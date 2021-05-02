package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class AbilityEntity(
    val ability: AbilityXEntity?,
    val isHidden: Boolean?,
    val slot: Int?
) : Parcelable