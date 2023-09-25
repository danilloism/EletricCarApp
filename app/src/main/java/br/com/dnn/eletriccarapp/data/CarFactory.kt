package br.com.dnn.eletriccarapp.data

import br.com.dnn.eletriccarapp.domain.Carro

object CarFactory {
    val list = listOf(
        Carro(
            1,
            "Carro Teste",
            "R$ 300.000,00",
            "300 kWh",
            "200",
            "30 min",
            "google.com.br"
        )
    )
}