package me.jaimenejaim.tekever.pokeapp.domain.usecases

import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonListEntity

interface GetPokemonListUseCase {
    suspend fun getPokemonList(offset: Int, limit: Int): List<PokemonListEntity>?
}