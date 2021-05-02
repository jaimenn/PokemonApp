package com.tekever.jaimenejaim.pokemonapp.presentation.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import dagger.hilt.android.lifecycle.HiltViewModel
import com.tekever.jaimenejaim.pokemonapp.BuildConfig
import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonListEntity
import com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.datasource.PokemonDataSourceFactory
import com.tekever.jaimenejaim.pokemonapp.presentation.util.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonMainViewModel @Inject constructor(
    factory: PokemonDataSourceFactory) : BaseViewModel() {

    companion object {
        private val PAGE_SIZE = BuildConfig.PAGE_SIZE
        private const val PREFETCH_DISTANCE = 10
    }

    var pokemonPagedList: LiveData<PagedList<PokemonListEntity>> = MutableLiveData()

    init {
        val config = PagedList.Config.Builder()
            .setPageSize(PAGE_SIZE)
            .setInitialLoadSizeHint(PAGE_SIZE)
            .setPrefetchDistance(PREFETCH_DISTANCE)
            .setEnablePlaceholders(false)
            .build()

        pokemonPagedList = LivePagedListBuilder(factory, config).build()
    }

}