package com.tekever.jaimenejaim.pokemonapp.presentation.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import com.tekever.jaimenejaim.pokemonapp.presentation.util.BindingFragment
import com.tekever.jaimenejaim.pokemonapp.R
import com.tekever.jaimenejaim.pokemonapp.databinding.PokemonMainFragmentBinding
import com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.adpter.PokemonListAdapter


@AndroidEntryPoint
class PokemonMainFragment : BindingFragment<PokemonMainFragmentBinding>() {

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