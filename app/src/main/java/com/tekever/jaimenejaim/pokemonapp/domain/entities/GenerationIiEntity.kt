package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenerationIiEntity(
    val crystal: CrystalEntity?,
    val gold: GoldEntity?,
    val silver: SilverEntity?
) : Parcelable