package br.com.dnn.eletriccarapp.domain

data class Carro(
    val id: Int,
    val nome: String,
    val preco: String,
    val bateria: String,
    val potencia: String,
    val recarga: String,
    val urlImage: String
)