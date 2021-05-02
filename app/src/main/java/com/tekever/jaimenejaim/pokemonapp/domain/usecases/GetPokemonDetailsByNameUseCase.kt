package com.tekever.jaimenejaim.pokemonapp.domain.usecases

import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonEntity

interface GetPokemonDetailsByNameUseCase {
    suspend fun getPokemonDetailsByName(pokemonName: String): PokemonEntity?
}