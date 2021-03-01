package com.example.androiddevchallenge.data.source

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog

object DataProvider {

    val dogs = listOf<Dog>(
        Dog(
            1,
            "Andy",
            "Male",
            "1 years old",
            "Black",
            "Affenpinscher",
            "",
            listOf(R.mipmap.img_affenpinscher)
        ),
        Dog(
            2,
            "Andy2",
            "Female",
            "2 years old",
            "Yellow",
            "Affenpinscher",
            "",
            listOf(R.mipmap.img_affenpinscher)
        )
    )
}