package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationIiiEntity(
    val emerald: EmeraldEntity?,
    val fireredLeafgreen: FireredLeafgreenEntity?,
    val rubySapphire: RubySapphireEntity?
) : Parcelable