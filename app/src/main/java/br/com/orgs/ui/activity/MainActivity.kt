package br.com.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.orgs.R
import br.com.orgs.dao.ProdutosDAO
import br.com.orgs.model.Produto
import br.com.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onResume() {
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val dao = ProdutosDAO()
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos())
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }

}