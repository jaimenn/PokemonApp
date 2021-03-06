package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class VersionDetailsEntity(
    val rarity: Int?,
    val version: VersionEntity?
) : Parcelable