package com.tekever.jaimenejaim.pokemonapp.presentation.di

import androidx.paging.DataSource
import androidx.paging.PageKeyedDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.tekever.jaimenejaim.pokemonapp.data.api.Api
import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonListEntity
import com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.datasource.PokemonDataSource
import com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.datasource.PokemonDataSourceFactory

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    fun providePokemonDataSource(api: Api) : PageKeyedDataSource<Int, PokemonListEntity> {
        return PokemonDataSource(api)
    }
    @Provides
    fun providePokemonDataSourceFactory(api: Api):  DataSource.Factory<Int, PokemonListEntity> {
        return PokemonDataSourceFactory(api)
    }

}