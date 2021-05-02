package com.tekever.jaimenejaim.pokemonapp.presentation.ui.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import com.tekever.jaimenejaim.pokemonapp.presentation.util.BindingFragment
import com.tekever.jaimenejaim.pokemonapp.R
import com.tekever.jaimenejaim.pokemonapp.presentation.util.observeResource
import com.tekever.jaimenejaim.pokemonapp.databinding.PokemonDetailFragmentBinding
import com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.PokemonMainFragment

@AndroidEntryPoint
class PokemonDetailFragment : BindingFragment<PokemonDetailFragmentBinding>() {

    override fun getLayoutResId() = R.layout.pokemon_detail_fragment

    private var viewModel =  viewModels<PokemonDetailViewModel>()

    private var pokemonName: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        observers()
        getFromArgs()
        loadData()
    }

    private fun getFromArgs() {
        arguments?.apply {
            pokemonName = getString(PokemonMainFragment.POKEMON_NAME_ARG)
        }
    }

    private fun loadData() {
        pokemonName?.let {
            loadPokemonByName(it)
        }
    }

    private fun setupView() {
        setupSetOnTouchListener()
        setButtonListeners()
    }

    private fun setButtonListeners() {
        binding.buttonTryAgain.setOnClickListener {
            pokemonName?.let {
                loadPokemonByName(it)
            }
        }
        binding.buttonSendFavorite.setOnClickListener {
            favoritePokemon()
        }
    }

    private fun favoritePokemon() {
        pokemonName?.let {
            viewModel.value.favoritePokemon(it)
        }
    }

    /*
    * Disable event touch on seek bars
    * */
    @SuppressLint("ClickableViewAccessibility")
    private fun setupSetOnTouchListener() {
        binding.seekBarStatsHp.setOnTouchListener { v, event -> return@setOnTouchListener true }
        binding.seekBarAttack.setOnTouchListener { v, event -> return@setOnTouchListener true }
        binding.seekBarDefense.setOnTouchListener { v, event -> return@setOnTouchListener true }
        binding.seekBarSpecialAttack.setOnTouchListener { v, event -> return@setOnTouchListener true }
        binding.seekBarSpecialDefense.setOnTouchListener { v, event -> return@setOnTouchListener true }
        binding.seekBarSpeed.setOnTouchListener { v, event -> return@setOnTouchListener true }
    }

    private fun loadPokemonByName(pokemonName: String) {
       viewModel.value.getPokemonDetailByName(pokemonName)
    }

    private fun observers() {
         viewModel.value.observerPokemonDetail.observeResource(viewLifecycleOwner,
             onSuccess = {
                 binding.model = it
                 binding.constraintLayoutSuccessLoading.visibility = View.VISIBLE
                 binding.constraintLayoutLoading.visibility = View.GONE
                 binding.constraintLayoutErrorLoading.visibility = View.GONE
             },
             onError = {
                 it.printStackTrace()
                 binding.constraintLayoutErrorLoading.visibility = View.VISIBLE
             },
             onLoading = {
                 binding.constraintLayoutSuccessLoading.visibility = View.GONE
                if(it) {
                    binding.constraintLayoutLoading.visibility = View.VISIBLE
                } else {
                    binding.constraintLayoutLoading.visibility = View.GONE
                }
             })
    }


}