package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class GameIndiceData(
    @SerializedName("game_index")
    val gameIndex: Int?,
    val version: VersionData?
)