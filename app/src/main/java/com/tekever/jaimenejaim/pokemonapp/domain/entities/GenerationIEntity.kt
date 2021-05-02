package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationIEntity(
    val redBlue: RedBlueEntity?,
    val yellow: YellowEntity?
) : Parcelable