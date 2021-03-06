package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationViiEntity(
    val icons: IconsEntity?,
    val ultraSunUltraMoon: UltraSunUltraMoonEntity?
) : Parcelable