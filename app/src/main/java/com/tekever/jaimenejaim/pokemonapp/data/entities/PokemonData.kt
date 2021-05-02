package com.tekever.jaimenejaim.pokemonapp.data.entities

import com.google.gson.annotations.SerializedName

data class PokemonData(
    val abilities: List<AbilityData>,
    @SerializedName("base_experience")
    val baseExperience: Int?,
    val forms: List<FormData>,
    @SerializedName("game_indices")
    val gameIndices: List<GameIndiceData>,
    val height: Int?,
    @SerializedName("held_items")
    val heldItems: List<HeldItemData>,
    val id: Int?,
    @SerializedName("is_default")
    val isDefault: Boolean?,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String?,
    val moves: List<MoveData>,
    val name: String?,
    val order: Int?,
    val species: SpeciesData?,
    val sprites: SpritesData?,
    val stats: List<StatData>,
    val types: List<TypeData>,
    val weight: Int?
)