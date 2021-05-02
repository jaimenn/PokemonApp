package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameIndiceEntity(
    val gameIndex: Int?,
    val version: VersionEntity?
) : Parcelable