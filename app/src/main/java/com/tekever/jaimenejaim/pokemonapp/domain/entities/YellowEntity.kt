package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class YellowEntity(
    val backDefault: String?,
    val backGray: String?,
    val frontDefault: String?,
    val frontGray: String?
) : Parcelable