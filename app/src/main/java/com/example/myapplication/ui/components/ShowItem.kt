package com.example.myapplication.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun ShowItem(title: String, url:String) {
    Column(modifier = Modifier.fillMaxSize()){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .build(),
            modifier = Modifier,
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )
        Text(text = title,modifier = Modifier.padding(16.dp))
        Canvas(modifier = , onDraw = )
        androidx.compose.ui.graphics.Canvas()
    }
}