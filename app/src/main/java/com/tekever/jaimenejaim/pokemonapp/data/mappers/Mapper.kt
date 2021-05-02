package com.tekever.jaimenejaim.pokemonapp.data.mappers

import com.tekever.jaimenejaim.pokemonapp.domain.entities.Optional

abstract class Mapper<in E, T> {

    abstract fun mapFrom(from: E): T

    fun mapOptional(from: Optional<E>): Optional<T> {
        from.value?.let {
            return Optional.of(mapFrom(it))
        } ?: return Optional.empty()
    }

}