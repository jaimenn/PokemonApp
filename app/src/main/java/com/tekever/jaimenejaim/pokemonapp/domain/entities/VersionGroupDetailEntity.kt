package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VersionGroupDetailEntity(
    val levelLearnedAt: Int?,
    val moveLearnMethod: MoveLearnMethodEntity?,
    val versionGroup: VersionGroupEntity?
) : Parcelable