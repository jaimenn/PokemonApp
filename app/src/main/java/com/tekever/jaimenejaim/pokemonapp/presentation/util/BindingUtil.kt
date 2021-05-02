package com.tekever.jaimenejaim.pokemonapp.presentation.util

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImageUrl")
fun loadImageUrl(imageView: ImageView, url: String?) {
    val context = imageView.context
    url?.let {
        Glide.with(context)
            .load(url)
            .into(imageView)
    }
}

@BindingAdapter("percentToString")
fun percentToString(textView: TextView, percent: Int) {
    textView.text = percent.toString().plus(" %")
}