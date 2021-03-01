package com.example.androiddevchallenge.data

data class Dog(
    val id: Long,
    val name: String,
    val sex: String,
    val age: String,
    val color: String,
    val breed: String,
    val address: String,
    val photos: List<Int>
)
