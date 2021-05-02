package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class GenerationIiiData(
    val emerald: EmeraldData?,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreenData?,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphireData?
)