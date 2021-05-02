package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class GenerationIData(
    @SerializedName("red-blue")
    val redBlue: RedBlueData?,
    val yellow: YellowData?
)