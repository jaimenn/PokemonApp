package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class OfficialArtworkData(
    @SerializedName("front_default")
    val frontDefault: String?
)