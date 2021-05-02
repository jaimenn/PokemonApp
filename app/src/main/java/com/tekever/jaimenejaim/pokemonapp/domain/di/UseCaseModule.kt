package com.tekever.jaimenejaim.pokemonapp.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.tekever.jaimenejaim.pokemonapp.domain.usecases.GetPokemonDetailsByNameUseCase
import com.tekever.jaimenejaim.pokemonapp.domain.usecases.GetPokemonDetailsByNameUseCaseImpl
import com.tekever.jaimenejaim.pokemonapp.domain.usecases.PostPokemonFavoriteUseCase
import com.tekever.jaimenejaim.pokemonapp.domain.usecases.PostPokemonFavoriteUseCaseImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun providerGetPokemonDetailsByNameUseCase(repository: GetPokemonDetailsByNameUseCaseImpl) : GetPokemonDetailsByNameUseCase

    @Binds
    abstract fun providerPostPokemonUseCase(repository: PostPokemonFavoriteUseCaseImpl) : PostPokemonFavoriteUseCase
}