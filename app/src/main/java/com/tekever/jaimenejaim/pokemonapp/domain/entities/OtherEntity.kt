package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OtherEntity(
    val dreamWorld: DreamWorldEntity?,
    val officialArtwork: OfficialArtworkEntity?
) : Parcelable