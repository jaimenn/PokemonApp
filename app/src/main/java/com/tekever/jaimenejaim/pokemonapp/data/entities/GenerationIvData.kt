package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class GenerationIvData(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearlData?,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilverData?,
    val platinum: PlatinumData?
)