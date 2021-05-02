package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class OtherData(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorldData?,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtworkData?

)