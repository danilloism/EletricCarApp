package br.com.dnn.eletriccarapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.dnn.eletriccarapp.R
import br.com.dnn.eletriccarapp.domain.Carro

class CarAdapter(private val carros: List<Carro>) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    //Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarAdapter.CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)

        return CarViewHolder(view)
    }

    override fun getItemCount() = carros.size

    //Pega o conteúdo da view e troca pela informaçao necessária
    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val carro = carros[position]

        holder.apply {
            preco.text = carro.preco
            bateria.text = carro.bateria
            recarga.text = carro.recarga
            potencia.text = carro.potencia
            nome.text = carro.nome
        }

    }

    class CarViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val preco: TextView
        val bateria: TextView
        val recarga: TextView
        val potencia: TextView
        val nome: TextView

        init {
            view.run {
                preco = findViewById(R.id.tv_preco_value)
                bateria = findViewById(R.id.tv_bateria_value)
                recarga = findViewById(R.id.tv_recarga_value)
                potencia = findViewById(R.id.tv_potencia_value)
                nome = findViewById(R.id.tv_nome)
            }

        }
    }
}

