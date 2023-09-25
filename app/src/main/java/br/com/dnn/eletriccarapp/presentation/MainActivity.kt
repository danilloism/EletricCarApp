package br.com.dnn.eletriccarapp.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.dnn.eletriccarapp.R
import br.com.dnn.eletriccarapp.data.CarFactory
import br.com.dnn.eletriccarapp.presentation.adapter.CarAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var btnRedirect: Button
    private lateinit var listaCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
        setupListeners()
        setupList()
    }

    private fun setupView() {
        btnRedirect = findViewById(R.id.btn_redirect)
        listaCarros = findViewById(R.id.rv_carros)
    }

    private fun setupList() {
        val adapter = CarAdapter(CarFactory.list)

        listaCarros.adapter = adapter
    }

    private fun setupListeners() {
        btnRedirect.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}