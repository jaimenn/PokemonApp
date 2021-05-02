package com.tekever.jaimenejaim.pokemonapp.data.mappers

import com.tekever.jaimenejaim.pokemonapp.data.api.response.model.PokemonResultData
import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonListEntity

class PokemonResultDataMapper : Mapper<PokemonResultData, PokemonListEntity>() {
    override fun mapFrom(from: PokemonResultData): PokemonListEntity {
        return PokemonListEntity(
            name = from.name,
            url = from.url
        )
    }
}