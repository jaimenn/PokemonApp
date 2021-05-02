package com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.datasource

import androidx.paging.DataSource
import com.tekever.jaimenejaim.pokemonapp.data.api.Api
import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonListEntity
import javax.inject.Inject

class PokemonDataSourceFactory @Inject constructor(
    private val api: Api
) : DataSource.Factory<Int, PokemonListEntity>() {
    override fun create(): DataSource<Int, PokemonListEntity> {
        return PokemonDataSource(api)
    }
}