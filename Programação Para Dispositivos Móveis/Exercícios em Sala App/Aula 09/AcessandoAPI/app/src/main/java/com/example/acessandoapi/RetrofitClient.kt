package com.example.acessandoapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "http://viacep.com.br/"

    val instance: ViaCepAPI by lazy {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

        retrofit.create(ViaCepAPI::class.java)
    }

}