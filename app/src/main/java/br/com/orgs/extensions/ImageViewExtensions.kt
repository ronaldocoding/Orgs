package br.com.orgs.extensions

import android.widget.ImageView
import br.com.orgs.R
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null) {
    load(url) {
        fallback(br.com.orgs.R.drawable.erro)
        error(br.com.orgs.R.drawable.erro)
        placeholder(br.com.orgs.R.drawable.placeholder)
    }
}