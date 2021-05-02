package com.tekever.jaimenejaim.pokemonapp.presentation.ui.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import com.tekever.jaimenejaim.pokemonapp.presentation.util.Resource
import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonEntity
import com.tekever.jaimenejaim.pokemonapp.domain.usecases.GetPokemonDetailsByNameUseCase
import com.tekever.jaimenejaim.pokemonapp.domain.usecases.PostPokemonFavoriteUseCase
import com.tekever.jaimenejaim.pokemonapp.presentation.util.BaseViewModel
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val useCase: GetPokemonDetailsByNameUseCase,
    private val useCasePostPokemon: PostPokemonFavoriteUseCase) : BaseViewModel() {

    private val pokemonDetailLiveData = MutableLiveData<Resource<PokemonEntity>>()

    val observerPokemonDetail = pokemonDetailLiveData

    fun getPokemonDetailByName(pokemonName: String) {
        viewModelScope.launch {
            with(pokemonDetailLiveData) {
                loading(true)
                try {
                    success(useCase.getPokemonDetailsByName(pokemonName))
                } catch (e: Exception) {
                    error(e)
                } finally {
                    loading(false)
                }
            }
        }
    }

    fun favoritePokemon(pokemonName: String) {
        viewModelScope.launch {
            useCasePostPokemon.postPokemonFavorite(pokemonName)
        }
    }

}