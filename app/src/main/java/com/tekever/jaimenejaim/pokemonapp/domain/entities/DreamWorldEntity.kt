package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DreamWorldEntity(
    val frontDefault: String?,
    val frontFemale: String?
) : Parcelable