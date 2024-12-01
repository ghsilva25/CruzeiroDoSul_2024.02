package com.example.consolesantigos

class ConsolesAntigos(
    private val nome: String,
    private val anoLancamento: Int,
    private val publicadora: String,
    private val historia: String
) {
    fun getNome(): String {
        return nome
    }

    fun getAnoLancamento(): Int {
        return anoLancamento
    }

    fun getPublicadora(): String {
        return publicadora
    }

    fun getHistoria(): String {
        return historia
    }
}