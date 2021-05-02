package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

class HeldItemData(
    val item: ItemData,
    @SerializedName("version_details")
    val versionDetails: List<VersionDetailsData>
)