package com.example.acessandoapi


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ViaCepAPI {

    @GET("ws/{cep}/jason/")
    fun buscarCep(@Path("cep") cep: String): Call<CepResponse>


}