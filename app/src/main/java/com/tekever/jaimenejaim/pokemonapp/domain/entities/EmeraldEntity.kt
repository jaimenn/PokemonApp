package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class EmeraldEntity(
    val frontDefault: String?,
    val frontShiny: String?
) : Parcelable