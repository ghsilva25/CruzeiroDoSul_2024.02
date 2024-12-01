package com.example.acessandoapi

data class CepResponse (

    val cep: String,
    val logradouro: String,
    val complemente: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ibge: String
)