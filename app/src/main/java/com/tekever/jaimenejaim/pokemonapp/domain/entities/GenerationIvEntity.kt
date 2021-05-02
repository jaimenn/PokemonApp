package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationIvEntity(
    val diamondPearl: DiamondPearlEntity?,
    val heartgoldSoulsilver: HeartgoldSoulsilverEntity?,
    val platinum: PlatinumEntity?
) : Parcelable