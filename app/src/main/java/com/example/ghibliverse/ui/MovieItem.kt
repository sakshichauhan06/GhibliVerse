package com.example.ghibliverse.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.ghibliverse.data.GhibliMovieData

@Composable
fun MovieItem(
    movie: GhibliMovieData
) {
    Column {
        Text(
            "${movie.title} (${movie.release_date})"
        )
        Image(
            painter = rememberAsyncImagePainter(movie.image),
            contentDescription = null,
            modifier = Modifier
                .padding(4.dp)
                .size(200.dp)
        )
    }
}

@Preview
@Composable
fun MovieItemPreview() {
    val movie = GhibliMovieData(
        id = "1",
        title = "Movie Title",
        description = "Movie Description",
        release_date = "2023-01-01",
        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/npOnzAbLh6VOIu3naU5QaEcTepo.jpg",
        movie_banner = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/npOnzAbLh6VOIu3naU5QaEcTepo.jpg"
    )

    MovieItem(movie)
}