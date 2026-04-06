package com.example.simpleandroidapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val postService: ApiService = retrofit.create(ApiService::class.java)
    val userService: UserApiService = retrofit.create(UserApiService::class.java)
}