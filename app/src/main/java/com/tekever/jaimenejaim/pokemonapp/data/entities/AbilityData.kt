package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class AbilityData(
    val ability: AbilityXData?,
    @SerializedName("is_hidden")
    val isHidden: Boolean?,
    val slot: Int?
)