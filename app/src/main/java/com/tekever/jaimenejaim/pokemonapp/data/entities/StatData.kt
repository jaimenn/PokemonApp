package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class StatData(
    @SerializedName("base_stat")
    val baseStat: Int?,
    val effort: Int?,
    val stat: StatXData?
)