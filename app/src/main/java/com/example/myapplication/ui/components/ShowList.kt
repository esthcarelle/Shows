package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.myapplication.viewModel.ShowViewModel

@Composable
fun ShowList() {
    val viewModel = ShowViewModel()

    LazyVerticalGrid(columns = GridCells.Fixed(2),modifier = Modifier.fillMaxSize()){
        items(viewModel.showList) {
            Column(modifier = Modifier.fillMaxSize()){
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(it.url)
                        .build(),
                    modifier = Modifier,
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds
                )
                Text(text = it.name,modifier = Modifier.padding(16.dp))
            }
        }
    }
}