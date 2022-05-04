package br.com.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.orgs.R
import br.com.orgs.model.Produto
import br.com.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "Maça",
                descricao = "Fruta",
                valor = 1.99.toBigDecimal()
            ),
            Produto(
                nome = "Banana",
                descricao = "Fruta",
                valor = 2.0.toBigDecimal()
            ),
            Produto(
                nome = "Mamão",
                descricao = "Fruta",
                valor = 6.5.toBigDecimal()
            ),
            Produto(
                nome = "Abacate",
                descricao = "Fruta",
                valor = 12.0.toBigDecimal()
            )
        ))
    }
}