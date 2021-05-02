package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class HeldItemEntity(
    val item: ItemEntity?,
    val versionDetails: List<VersionDetailsEntity>
) : Parcelable