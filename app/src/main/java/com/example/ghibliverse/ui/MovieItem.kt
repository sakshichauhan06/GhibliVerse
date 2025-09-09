package com.example.ghibliverse.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ghibliverse.data.GhibliMovieData

@Composable
fun MovieItem(
    movie: GhibliMovieData
) {
    Column {

    }
}

@Preview
@Composable
fun MovieItemPreview() {
    val movie = GhibliMovieData(
        id = "1",
        title = "Movie Title",
        description = "Movie Description",
        release_date = "2023-01-01")
}