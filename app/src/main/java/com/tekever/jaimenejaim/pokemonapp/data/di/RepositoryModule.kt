package com.tekever.jaimenejaim.pokemonapp.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.tekever.jaimenejaim.pokemonapp.data.repository.PokemonRepositoryImpl
import com.tekever.jaimenejaim.pokemonapp.domain.repository.PokemonRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun providerAddressRepository(repository: PokemonRepositoryImpl) : PokemonRepository

}