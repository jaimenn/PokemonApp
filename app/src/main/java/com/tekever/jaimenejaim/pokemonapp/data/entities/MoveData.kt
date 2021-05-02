package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class MoveData(
    val move: MoveXData?,
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetailData>
)