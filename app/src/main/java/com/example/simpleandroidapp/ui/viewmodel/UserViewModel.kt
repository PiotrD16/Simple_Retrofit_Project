package com.example.simpleandroidapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.simpleandroidapp.data.model.user.User
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simpleandroidapp.data.network.RetrofitClient
import kotlinx.coroutines.launch


class UserViewModel: ViewModel() {
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _users

    fun fetchUsers() {
        viewModelScope.launch {
            try{
                val usersResponse = RetrofitClient.instanceUser.getAllUsers()
                _users.value = usersResponse
            } catch(e: Exception){
                println("An error occurred: ${e.message}")
            }
        }
    }
}