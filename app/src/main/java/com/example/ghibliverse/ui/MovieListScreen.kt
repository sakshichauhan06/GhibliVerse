package com.example.ghibliverse.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.ghibliverse.MovieViewModel

@Composable
fun MovieListScreen() {
    val viewModel = MovieViewModel()
    val movies by viewModel.movies.collectAsState()

    LazyColumn {
        items(movies) { movie ->
            MovieItem(movie)
        }
    }
}