package com.tekever.jaimenejaim.pokemonapp.data.api.response.model

data class PokemonListResponseData(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResultData>
)