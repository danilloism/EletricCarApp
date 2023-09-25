package br.com.dnn.eletriccarapp.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.dnn.eletriccarapp.R

class CalcularAutonomiaActivity : AppCompatActivity() {
    private lateinit var preco: EditText
    private lateinit var kmPercorrido: EditText
    private lateinit var resultado: TextView
    private lateinit var btnCalcular: Button
    private lateinit var btnClose: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)

        setupView()
        setupListeners()
    }

    private fun setupView() {
        preco = findViewById(R.id.et_preco_kwh)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btnCalcular = findViewById(R.id.btn_calcular)
        btnClose = findViewById(R.id.iv_close)
    }

    private fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()
        }

        btnClose.setOnClickListener {
            finish()
        }
    }

    private fun calcular() {
        val resultadoCalculo =
            preco.text.let {
                if (it.isBlank()) 0F else it.toString().toFloat()
            } / kmPercorrido.text.let {
                if (it.isBlank()) 0F else it.toString().toFloat()
            }

        resultado.text = resultadoCalculo.let { if (it.isNaN()) "" else it.toString() }
    }
}