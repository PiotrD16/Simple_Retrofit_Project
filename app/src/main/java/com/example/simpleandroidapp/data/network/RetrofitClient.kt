package com.example.simpleandroidapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL_POST = "https://jsonplaceholder.typicode.com/"
    private const val BASE_URL_USER = "https://jsonplaceholder.typicode.com/"

    val instance: ApiService by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL_POST)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    val instanceUser: UserApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL_USER)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserApiService::class.java)
    }
}