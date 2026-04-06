package com.example.simpleandroidapp.data.model.user

data class Address (
    val street: String,
    val suite: String,
    val city: String,
    val zipcode: String,
    val geo: Geo
)