package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationViEntity(
    val omegarubyAlphasapphire: OmegarubyAlphasapphireEntity?,
    val xY: XYEntity?
) : Parcelable