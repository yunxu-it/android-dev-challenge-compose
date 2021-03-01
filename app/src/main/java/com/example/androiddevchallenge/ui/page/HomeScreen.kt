package com.example.androiddevchallenge.ui.page;

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.androiddevchallenge.data.source.DataProvider
import com.example.androiddevchallenge.ui.components.DogList

@Composable
fun HomeScreen() {
    val dogs = DataProvider.dogs
    return DogList(dogs = dogs, modifier = Modifier)
}