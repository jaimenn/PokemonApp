package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationVEntity(
    val blackWhite: BlackWhiteEntity?
) : Parcelable