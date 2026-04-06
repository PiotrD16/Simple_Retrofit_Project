package com.example.simpleandroidapp.data.repository

import com.example.simpleandroidapp.data.model.Post
import com.example.simpleandroidapp.data.network.ApiService

class PostRepository (private val apiService: ApiService) {
    suspend fun getPosts(): List<Post> {
        return apiService.getAllPosts()
    }
}