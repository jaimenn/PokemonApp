package com.tekever.jaimenejaim.pokemonapp.data.mappers

import android.util.Log
import com.google.gson.Gson
import com.tekever.jaimenejaim.pokemonapp.data.entities.PokemonData
import com.tekever.jaimenejaim.pokemonapp.domain.entities.*

class PokemonEntityMapper() : Mapper<PokemonData, PokemonEntity>() {

    override fun mapFrom(from: PokemonData): PokemonEntity {
        return PokemonEntity(
            id = from.id,
            isDefault = from.isDefault,
            locationAreaEncounters = from.locationAreaEncounters,
            baseExperience = from.baseExperience,
            name = from.name,
            order = from.order,
            weight = from.weight,
            abilities = from.abilities.map {
                      AbilityEntity(
                          ability = AbilityXEntity(
                              name = it.ability?.name,
                              url = it.ability?.url
                          ),
                          isHidden = it.isHidden,
                          slot = it.slot
                      )
            },

            forms = from.forms.map {
                                   FormEntity(
                                       name = it.name,
                                       url = it.url
                                   )
            },
            gameIndices = from.gameIndices.map {
                                               GameIndiceEntity(
                                                   gameIndex = it.gameIndex,
                                                   version = VersionEntity(
                                                       name = it.version?.name,
                                                       url = it.version?.url
                                                   )
                                               )
            },
            height = from.height,
            heldItems = from.heldItems.map {
                                           HeldItemEntity(
                                                   item = ItemEntity(
                                                           name = it.item.name,
                                                           url = it.item.url
                                                   ),
                                                   versionDetails = it.versionDetails.map {
                                                       VersionDetailsEntity(
                                                               rarity = it.rarity,
                                                               version = VersionEntity(
                                                                       name = it.version?.name,
                                                                       url = it.version?.url
                                                               )
                                                       )
                                                   }
                                           )
            },
            moves = from.moves.map {
                                   MoveEntity(
                                       move = MoveXEntity(
                                           name = it.move?.name,
                                           url = it.move?.url
                                       ),
                                       versionGroupDetails = it.versionGroupDetails.map {
                                           VersionGroupDetailEntity(
                                               levelLearnedAt = it.levelLearnedAt,
                                               moveLearnMethod = MoveLearnMethodEntity(
                                                   name = it.moveLearnMethod?.name,
                                                   url = it.moveLearnMethod?.url
                                               ),
                                               versionGroup = VersionGroupEntity(
                                                   name = it.versionGroup?.name,
                                                   url = it.versionGroup?.url
                                               )
                                           )
                                       }
                                   )
            },
            species = SpeciesEntity(
                name = from.species?.name,
                url = from.species?.url
            ),
            sprites = SpritesEntity(
                backDefault = from.sprites?.backDefault,
                backFemale = from.sprites?.backFemale,
                backShiny = from.sprites?.backShiny,
                backShinyFemale = from.sprites?.backShinyFemale,
                frontDefault = from.sprites?.frontDefault,
                frontFemale = from.sprites?.frontFemale,
                frontShiny = from.sprites?.frontShiny,
                frontShinyFemale = from.sprites?.frontShinyFemale,
                other = OtherEntity(
                    dreamWorld = DreamWorldEntity(
                        frontDefault = from.sprites?.other?.dreamWorld?.frontDefault,
                        frontFemale = from.sprites?.other?.dreamWorld?.frontFemale
                    ),
                    officialArtwork = OfficialArtworkEntity(
                        frontDefault = from.sprites?.other?.officialArtwork?.frontDefault
                    )
                ),
                versions = VersionsEntity(
                    generationI = GenerationIEntity(
                        redBlue = RedBlueEntity(
                            backDefault = from.sprites?.versions?.generationI?.redBlue?.backDefault,
                            backGray = from.sprites?.versions?.generationI?.redBlue?.backGray,
                            frontDefault = from.sprites?.versions?.generationI?.redBlue?.frontDefault,
                            frontGray = from.sprites?.versions?.generationI?.redBlue?.frontGray
                        ),
                        yellow = YellowEntity(
                            backDefault = from.sprites?.versions?.generationI?.yellow?.backDefault,
                            backGray = from.sprites?.versions?.generationI?.yellow?.backGray,
                            frontDefault = from.sprites?.versions?.generationI?.yellow?.frontDefault,
                            frontGray = from.sprites?.versions?.generationI?.yellow?.frontGray
                        )
                    ),
                    generationIi = GenerationIiEntity(
                        crystal = CrystalEntity(
                            backDefault = from.sprites?.versions?.generationIi?.crystal?.backDefault,
                            backShiny = from.sprites?.versions?.generationIi?.crystal?.backShiny,
                            frontDefault = from.sprites?.versions?.generationIi?.crystal?.frontDefault,
                            frontShiny = from.sprites?.versions?.generationIi?.crystal?.frontShiny
                        ),
                        gold = GoldEntity(
                            backDefault = from.sprites?.versions?.generationIi?.gold?.backDefault,
                            backShiny = from.sprites?.versions?.generationIi?.gold?.backShiny,
                            frontDefault = from.sprites?.versions?.generationIi?.gold?.frontDefault,
                            frontShiny = from.sprites?.versions?.generationIi?.gold?.frontShiny
                        ),
                        silver = SilverEntity(
                            backDefault = from.sprites?.versions?.generationIi?.silver?.backDefault,
                            backShiny = from.sprites?.versions?.generationIi?.silver?.backShiny,
                            frontDefault = from.sprites?.versions?.generationIi?.silver?.frontDefault,
                            frontShiny = from.sprites?.versions?.generationIi?.silver?.frontShiny

                        )
                    ),
                    generationIii = GenerationIiiEntity(
                        emerald = EmeraldEntity(
                            frontDefault = from.sprites?.versions?.generationIii?.emerald?.frontDefault,
                            frontShiny =  from.sprites?.versions?.generationIii?.emerald?.frontShiny
                        ),
                        fireredLeafgreen = FireredLeafgreenEntity(
                            backDefault =  from.sprites?.versions?.generationIii?.fireredLeafgreen?.backDefault,
                            backShiny = from.sprites?.versions?.generationIii?.fireredLeafgreen?.backShiny,
                            frontDefault = from.sprites?.versions?.generationIii?.fireredLeafgreen?.frontDefault,
                            frontShiny = from.sprites?.versions?.generationIii?.fireredLeafgreen?.frontShiny
                        ),
                        rubySapphire = RubySapphireEntity(
                            backDefault = from.sprites?.versions?.generationIii?.rubySapphire?.backDefault,
                            backShiny = from.sprites?.versions?.generationIii?.rubySapphire?.backShiny,
                            frontDefault = from.sprites?.versions?.generationIii?.rubySapphire?.frontDefault,
                            frontShiny = from.sprites?.versions?.generationIii?.rubySapphire?.frontShiny
                        )
                    ),
                    generationIv = GenerationIvEntity(
                        diamondPearl = DiamondPearlEntity(
                            backDefault = from.sprites?.versions?.generationIv?.diamondPearl?.backDefault,
                            backFemale = from.sprites?.versions?.generationIv?.diamondPearl?.backFemale,
                            backShiny = from.sprites?.versions?.generationIv?.diamondPearl?.backShiny,
                            backShinyFemale = from.sprites?.versions?.generationIv?.diamondPearl?.backShinyFemale,
                            frontDefault = from.sprites?.versions?.generationIv?.diamondPearl?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationIv?.diamondPearl?.frontFemale,
                            frontShiny = from.sprites?.versions?.generationIv?.diamondPearl?.frontShiny,
                            frontShinyFemale = from.sprites?.versions?.generationIv?.diamondPearl?.frontShinyFemale
                        ),
                        heartgoldSoulsilver = HeartgoldSoulsilverEntity(
                            backDefault = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.backDefault,
                            backFemale = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.backFemale,
                            backShiny = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.backShiny,
                            backShinyFemale = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.backShinyFemale,
                            frontDefault = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.frontFemale,
                            frontShiny = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.frontShiny,
                            frontShinyFemale = from.sprites?.versions?.generationIv?.heartgoldSoulsilver?.frontShinyFemale
                        ),
                        platinum = PlatinumEntity(
                            backDefault = from.sprites?.versions?.generationIv?.platinum?.backDefault,
                            backFemale = from.sprites?.versions?.generationIv?.platinum?.backFemale,
                            backShiny = from.sprites?.versions?.generationIv?.platinum?.backShiny,
                            backShinyFemale = from.sprites?.versions?.generationIv?.platinum?.backShinyFemale,
                            frontDefault = from.sprites?.versions?.generationIv?.platinum?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationIv?.platinum?.frontFemale,
                            frontShiny = from.sprites?.versions?.generationIv?.platinum?.frontShiny,
                            frontShinyFemale = from.sprites?.versions?.generationIv?.platinum?.frontShinyFemale
                        )
                    ),
                    generationV = GenerationVEntity(
                        blackWhite = BlackWhiteEntity(
                            animated = AnimatedEntity(
                                backDefault = from.sprites?.versions?.generationV?.blackWhite?.animated?.backDefault,
                                backFemale = from.sprites?.versions?.generationV?.blackWhite?.animated?.backFemale,
                                backShiny = from.sprites?.versions?.generationV?.blackWhite?.animated?.backShiny,
                                backShinyFemale = from.sprites?.versions?.generationV?.blackWhite?.animated?.backShinyFemale,
                                frontDefault = from.sprites?.versions?.generationV?.blackWhite?.animated?.frontDefault,
                                frontFemale = from.sprites?.versions?.generationV?.blackWhite?.animated?.frontFemale,
                                frontShiny = from.sprites?.versions?.generationV?.blackWhite?.animated?.frontShiny,
                                frontShinyFemale = from.sprites?.versions?.generationV?.blackWhite?.animated?.frontShinyFemale
                            ),
                            backDefault = from.sprites?.versions?.generationV?.blackWhite?.backDefault,
                            backFemale = from.sprites?.versions?.generationV?.blackWhite?.backFemale,
                            backShiny = from.sprites?.versions?.generationV?.blackWhite?.backShiny,
                            backShinyFemale = from.sprites?.versions?.generationV?.blackWhite?.backShinyFemale,
                            frontDefault = from.sprites?.versions?.generationV?.blackWhite?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationV?.blackWhite?.frontFemale,
                            frontShiny = from.sprites?.versions?.generationV?.blackWhite?.frontShiny,
                            frontShinyFemale = from.sprites?.versions?.generationV?.blackWhite?.frontShinyFemale
                        )
                    ),
                    generationVi = GenerationViEntity(
                        omegarubyAlphasapphire = OmegarubyAlphasapphireEntity(
                            frontDefault = from.sprites?.versions?.generationVi?.omegarubyAlphasapphire?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationVi?.omegarubyAlphasapphire?.frontFemale,
                            frontShiny = from.sprites?.versions?.generationVi?.omegarubyAlphasapphire?.frontShiny,
                            frontShinyFemale = from.sprites?.versions?.generationVi?.omegarubyAlphasapphire?.frontShinyFemale
                        ),
                        xY = XYEntity(
                            frontDefault = from.sprites?.versions?.generationVi?.xY?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationVi?.xY?.frontFemale,
                            frontShiny = from.sprites?.versions?.generationVi?.xY?.frontShiny,
                            frontShinyFemale = from.sprites?.versions?.generationVi?.xY?.frontShinyFemale
                        )
                    ),
                    generationVii = GenerationViiEntity(
                        icons = IconsEntity(
                            frontDefault = from.sprites?.versions?.generationVii?.icons?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationVii?.icons?.frontFemale
                        ),
                        ultraSunUltraMoon = UltraSunUltraMoonEntity(
                            frontDefault = from.sprites?.versions?.generationVii?.ultraSunUltraMoon?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationVii?.ultraSunUltraMoon?.frontFemale,
                            frontShiny = from.sprites?.versions?.generationVii?.ultraSunUltraMoon?.frontShiny,
                            frontShinyFemale = from.sprites?.versions?.generationVii?.ultraSunUltraMoon?.frontShinyFemale
                        )
                    ),
                    generationViii = GenerationViiiEntity(
                        icons = IconsXEntity(
                            frontDefault = from.sprites?.versions?.generationViii?.icons?.frontDefault,
                            frontFemale = from.sprites?.versions?.generationViii?.icons?.frontFemale
                        )
                    )
                )
            ),
            stats = from.stats.map {
                                   StatEntity(
                                       baseStat = it.baseStat,
                                       effort = it.effort,
                                       stat = StatXEntity(
                                           name = it.stat?.name,
                                           url = it.stat?.url
                                       )
                                   )
            },
            types = from.types.map {
                                   TypeEntity(
                                       slot = it.slot,
                                       type = TypeXEntity(
                                           name = it.type?.name,
                                           url = it.type?.url
                                       )
                                   )
            }
        ).apply {
            Log.d(PokemonEntityMapper::class.simpleName, Gson().toJson(this))
        }
    }

}