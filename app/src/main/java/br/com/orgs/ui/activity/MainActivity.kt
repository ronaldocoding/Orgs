package br.com.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.orgs.R
import br.com.orgs.model.Produto
import br.com.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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