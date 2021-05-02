package com.tekever.jaimenejaim.pokemonapp.domain.usecases

import com.tekever.jaimenejaim.pokemonapp.domain.repository.PokemonRepository
import javax.inject.Inject

class GetPokemonDetailsByNameUseCaseImpl @Inject constructor(
        private val repository: PokemonRepository
) : GetPokemonDetailsByNameUseCase {

    override suspend fun getPokemonDetailsByName(pokemonName: String) =
            repository.getPokemonDetailsByName(pokemonName)

}