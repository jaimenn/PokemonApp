package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StatEntity(
    val baseStat: Int?,
    val effort: Int?,
    val stat: StatXEntity?
) : Parcelable