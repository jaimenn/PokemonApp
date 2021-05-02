package com.tekever.jaimenejaim.pokemonapp.domain.repository

import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonEntity

interface PokemonRepository {
    suspend fun getPokemonDetailsByName(pokemonName: String): PokemonEntity
    suspend fun postPokemonFavorite(pokemonName: String)
}