package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TypeEntity(
    val slot: Int?,
    val type: TypeXEntity?
) : Parcelable