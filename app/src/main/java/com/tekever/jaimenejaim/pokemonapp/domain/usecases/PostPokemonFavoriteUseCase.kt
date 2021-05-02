package com.tekever.jaimenejaim.pokemonapp.domain.usecases

interface PostPokemonFavoriteUseCase {
    suspend fun postPokemonFavorite(pokemonName: String)
}