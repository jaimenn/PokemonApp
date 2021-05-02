package com.tekever.jaimenejaim.pokemonapp.presentation.ui.main.adpter

import com.tekever.jaimenejaim.pokemonapp.presentation.util.BindingAdapter
import com.tekever.jaimenejaim.pokemonapp.R
import com.tekever.jaimenejaim.pokemonapp.databinding.ItemPokemonListBinding
import com.tekever.jaimenejaim.pokemonapp.domain.entities.PokemonListEntity

class PokemonListAdapter(
    private val onClick: (PokemonListEntity) -> Unit) : BindingAdapter<PokemonListEntity, ItemPokemonListBinding>() {

    override fun getLayoutResId() = R.layout.item_pokemon_list

    override fun onBindViewHolder(binding: ItemPokemonListBinding, position: Int) {

        val pokemonEntity = getItem(position)
        binding.model = pokemonEntity
        pokemonEntity?.let {
            binding.root.setOnClickListener { view ->
                onClick.invoke(it)
            }
        }
    }

}