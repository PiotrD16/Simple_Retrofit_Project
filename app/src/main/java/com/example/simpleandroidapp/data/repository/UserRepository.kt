package com.example.simpleandroidapp.data.repository

import com.example.simpleandroidapp.data.model.user.User
import com.example.simpleandroidapp.data.network.UserApiService

class UserRepository (private val apiService: UserApiService) {
    suspend fun getAllUsers(): List<User> {
        return apiService.getAllUsers()
    }
}