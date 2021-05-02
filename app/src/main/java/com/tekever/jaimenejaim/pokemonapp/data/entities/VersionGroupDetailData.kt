package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class VersionGroupDetailData(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int?,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethodData?,
    @SerializedName("version_group")
    val versionGroup: VersionGroupData?
)