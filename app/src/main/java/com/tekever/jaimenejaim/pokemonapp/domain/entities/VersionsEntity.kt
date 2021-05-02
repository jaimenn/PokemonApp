package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VersionsEntity(
    val generationI: GenerationIEntity?,
    val generationIi: GenerationIiEntity?,
    val generationIii: GenerationIiiEntity?,
    val generationIv: GenerationIvEntity?,
    val generationV: GenerationVEntity?,
    val generationVi: GenerationViEntity?,
    val generationVii: GenerationViiEntity?,
    val generationViii: GenerationViiiEntity?
) : Parcelable