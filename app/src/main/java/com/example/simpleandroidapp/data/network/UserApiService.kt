package com.example.simpleandroidapp.data.network

import com.example.simpleandroidapp.data.model.user.User
import retrofit2.http.GET

interface UserApiService {
    @GET("users")
    suspend fun getAllUsers(): List<User>
}