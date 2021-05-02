package com.tekever.jaimenejaim.pokemonapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonEntity(
    val abilities: List<AbilityEntity>,
    val baseExperience: Int?,
    val forms: List<FormEntity>,
    val gameIndices: List<GameIndiceEntity>,
    val height: Int?,
    val heldItems: List<HeldItemEntity>,
    val id: Int?,
    val isDefault: Boolean?,
    val locationAreaEncounters: String?,
    val moves: List<MoveEntity>,
    val name: String?,
    val order: Int?,
    val species: SpeciesEntity?,
    val sprites: SpritesEntity?,
    val stats: List<StatEntity>,
    val types: List<TypeEntity>,
    val weight: Int?
) : Parcelable