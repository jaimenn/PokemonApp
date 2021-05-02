 package com.tekever.jaimenejaim.pokemonapp.data.repository

import com.tekever.jaimenejaim.pokemonapp.data.api.Api
import com.tekever.jaimenejaim.pokemonapp.data.api.ApiWebHook
import com.tekever.jaimenejaim.pokemonapp.data.entities.PokemonFavoriteData
import com.tekever.jaimenejaim.pokemonapp.data.mappers.PokemonEntityMapper
import com.tekever.jaimenejaim.pokemonapp.domain.repository.PokemonRepository
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private var api: Api,
    private var webHookApi: ApiWebHook) : PokemonRepository {

    override suspend fun getPokemonDetailsByName(pokemonName: String) =
        PokemonEntityMapper().mapFrom(api.getPokemonDetailsByName(pokemonName))

    override suspend fun postPokemonFavorite(pokemonName: String) {
        webHookApi.sendFavorite(pokemonFavorite = PokemonFavoriteData(
            name = pokemonName
        ))
    }
}