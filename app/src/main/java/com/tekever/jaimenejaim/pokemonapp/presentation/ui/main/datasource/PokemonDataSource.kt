package com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.datasource

import androidx.paging.PageKeyedDataSource
import com.tekever.jaimenejaim.pokemonapp.BuildConfig
import com.tekever.jaimenejaim.pokemonapp.data.api.Api
import com.tekever.jaimenejaim.pokemonapp.data.api.response.model.PokemonListResponseData
import com.tekever.jaimenejaim.pokemonapp.data.mappers.PokemonResultDataMapper
import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonListEntity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class PokemonDataSource @Inject constructor(
    private val api: Api) : PageKeyedDataSource<Int, PokemonListEntity>() {

    companion object {
        private val PAGE_SIZE = BuildConfig.PAGE_SIZE
    }

    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, PokemonListEntity>) {
        val numberOfItems = params.requestedLoadSize
        create(0, PAGE_SIZE, numberOfItems, callback, null)
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, PokemonListEntity>) {
        val page = params.key
        val numberOfItems = params.requestedLoadSize
        create(page, page + PAGE_SIZE, numberOfItems, null, callback)
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, PokemonListEntity>) {
        val page = params.key
        val numberOfItems = params.requestedLoadSize
        create(page, page + PAGE_SIZE, numberOfItems, null, callback)
    }

    private fun create(requestedPage: Int,
                                 adjacentPage: Int,
                                 requestedLoadSize: Int,
                                 initialCallback: LoadInitialCallback<Int, PokemonListEntity>?,
                                 callback: LoadCallback<Int, PokemonListEntity>?) {

        api.getPokemonList(requestedPage, requestedLoadSize).enqueue(object : Callback<PokemonListResponseData?>{
            override fun onResponse(
                call: Call<PokemonListResponseData?>,
                response: Response<PokemonListResponseData?>
            ) {
                response.body()?.let {
                    val pokemonResultData = it.results.map {
                        PokemonResultDataMapper().mapFrom(it)
                    }

                    initialCallback?.onResult(pokemonResultData, null, adjacentPage)
                    callback?.onResult(pokemonResultData, adjacentPage)
                }
            }

            override fun onFailure(call: Call<PokemonListResponseData?>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

}