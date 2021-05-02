package com.tekever.jaimenejaim.pokemonapp.data.api

import com.tekever.jaimenejaim.pokemonapp.data.api.response.model.PokemonListResponseData
import com.tekever.jaimenejaim.pokemonapp.data.entities.PokemonData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("pokemon/{name}")
    suspend fun getPokemonDetailsByName(@Path("name") pokemonName: String): PokemonData

    @GET("pokemon")
    fun getPokemonList(@Query("offset") offset: Int, @Query("limit") limit: Int = 20): Call<PokemonListResponseData?>

}