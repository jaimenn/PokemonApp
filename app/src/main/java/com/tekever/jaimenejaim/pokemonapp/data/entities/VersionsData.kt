package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class VersionsData(
    @SerializedName("generation-i")
    val generationI: GenerationIData?,
    @SerializedName("generation-ii")
    val generationIi: GenerationIiData?,
    @SerializedName("generation-iii")
    val generationIii: GenerationIiiData?,
    @SerializedName("generation-iv")
    val generationIv: GenerationIvData?,
    @SerializedName("generation-v")
    val generationV: GenerationVData?,
    @SerializedName("generation-vi")
    val generationVi: GenerationViData?,
    @SerializedName("generation-vii")
    val generationVii: GenerationViiData?,
    @SerializedName("generation-viii")
    val generationViii: GenerationViiiData?
)