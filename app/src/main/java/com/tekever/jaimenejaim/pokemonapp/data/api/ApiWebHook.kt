package com.tekever.jaimenejaim.pokemonapp.data.api

import com.tekever.jaimenejaim.pokemonapp.BuildConfig
import com.tekever.jaimenejaim.pokemonapp.data.entities.PokemonData
import com.tekever.jaimenejaim.pokemonapp.data.entities.PokemonFavoriteData
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiWebHook {

    @POST("/{uuid}")
    suspend fun sendFavorite(
            @Path("uuid") uuid: String = BuildConfig.WEB_HOOK_KEY,
            @Body pokemonFavorite: PokemonFavoriteData)
}