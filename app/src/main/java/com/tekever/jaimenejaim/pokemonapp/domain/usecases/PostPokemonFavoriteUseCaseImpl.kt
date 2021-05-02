package com.tekever.jaimenejaim.pokemonapp.domain.usecases

import com.tekever.jaimenejaim.pokemonapp.domain.repository.PokemonRepository
import javax.inject.Inject

class PostPokemonFavoriteUseCaseImpl @Inject constructor(
    private val repository: PokemonRepository
) : PostPokemonFavoriteUseCase {

    override suspend fun postPokemonFavorite(pokemonName: String) {
        repository.postPokemonFavorite(pokemonName)
    }

}