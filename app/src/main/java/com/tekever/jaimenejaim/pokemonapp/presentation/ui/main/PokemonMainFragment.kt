package com.tekever.jaimenejaim.pokemonapp.presentation.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import com.tekever.jaimenejaim.pokemonapp.presentation.util.BindingFragment
import com.tekever.jaimenejaim.pokemonapp.R
import com.tekever.jaimenejaim.pokemonapp.databinding.PokemonMainFragmentBinding
import com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.adpter.PokemonListAdapter


@AndroidEntryPoint
class PokemonMainFragment : BindingFragment<PokemonMainFragmentBinding>() {

    companion object {
        const val POKEMON_NAME_ARG = "pokemonNameArg"
    }

    override fun getLayoutResId() = R.layout.pokemon_main_fragment

    private var viewModel = viewModels<PokemonMainViewModel>()

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var pokemonListAdapter: PokemonListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        subscribeToList()
    }

    private fun setupRecyclerView() {
        pokemonListAdapter = PokemonListAdapter { pokemonListEntity ->
            view?.let {
                val args = Bundle().apply {
                    putString(POKEMON_NAME_ARG, pokemonListEntity.name)
                }
                Navigation.findNavController(it).navigate(R.id.action_pokemonMainFragment_to_pokemonDetailFragment, args)
            }
        }

        linearLayoutManager = LinearLayoutManager(context)

        binding.recyclerView.apply {
            adapter = pokemonListAdapter
            layoutManager = linearLayoutManager
        }
    }

    private fun subscribeToList() {
        viewModel.value.pokemonPagedList.observe(viewLifecycleOwner, {
            pokemonListAdapter.submitList(it)
        })
    }

}