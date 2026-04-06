package com.example.simpleandroidapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.simpleandroidapp.data.model.Post
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.simpleandroidapp.data.network.RetrofitClient
import kotlinx.coroutines.launch


class MainViewModel: ViewModel() {

    /*
    * _posts is for getting data from API
    * posts is for displaying data in UI
    */
    private val _posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> get() = _posts

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                val postsResponse = RetrofitClient.instance.getAllPosts()
                _posts.value = postsResponse
            } catch(e: Exception) {
                println("An error occurred: ${e.message}")
            }
        }
    }
}
