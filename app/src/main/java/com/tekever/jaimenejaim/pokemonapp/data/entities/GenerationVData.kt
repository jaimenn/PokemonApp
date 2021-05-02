package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class GenerationVData(
    @SerializedName("black-white")
    val blackWhite: BlackWhiteData?
)