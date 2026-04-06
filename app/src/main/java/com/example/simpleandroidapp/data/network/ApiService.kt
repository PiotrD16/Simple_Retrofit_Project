package com.example.simpleandroidapp.data.network

import com.example.simpleandroidapp.data.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getAllPosts(): List<Post>
}