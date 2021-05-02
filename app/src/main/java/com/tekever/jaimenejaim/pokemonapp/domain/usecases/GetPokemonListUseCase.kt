package me.jaimenejaim.tekever.pokeapp.domain.usecases

import me.jaimenejaim.tekever.pokeapp.domain.entities.PokemonListEntity

interface GetPokemonListUseCase {
    suspend fun getPokemonList(offset: Int, limit: Int): List<PokemonListEntity>?
}