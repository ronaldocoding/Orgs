package br.com.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.orgs.R
import br.com.orgs.model.Produto
import br.com.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

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
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}