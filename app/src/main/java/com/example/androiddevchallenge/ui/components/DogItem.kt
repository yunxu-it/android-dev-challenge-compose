package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DogList(dogs: List<Dog>, modifier: Modifier) {
    LazyColumn(
        modifier = modifier.background(color = Color.White)
    ) {
        items(dogs) { dog ->
            DogItem(dog = dog, modifier = modifier)
            Divider(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
            )
        }
    }
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier) {
    val image = ImageBitmap.imageResource(dog.photos.first())
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(8.dp)
            .background(
                Color.White
            )
    ) {
        Image(
            bitmap = image,
            "",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(80.dp, 80.dp)
                .clip(MaterialTheme.shapes.medium)
        )
        Column(
            modifier = modifier
                .weight(1f)
        ) {
            Text(dog.name, style = typography.h5)
            ItemInfo(dog.sex + "," + dog.age)
            ItemInfo(dog.breed)
            ItemInfo(dog.address)
        }
    }
}

@Composable
private fun ItemInfo(str: String) {
    Text(str, style = typography.body2, maxLines = 1, overflow = TextOverflow.Ellipsis)
}