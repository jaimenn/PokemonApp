package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MoveEntity(
    val move: MoveXEntity?,
    val versionGroupDetails: List<VersionGroupDetailEntity>
) : Parcelable