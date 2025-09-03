package com.example.ghibliverse

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ghibliverse.data.GhibliMovieData
import com.example.ghibliverse.data.RetrofitInstance
import kotlinx.coroutines.flow.StateFlow
import androidx.compose.runtime.State
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MovieViewModel: ViewModel() {

    private val _movies = MutableStateFlow<List<GhibliMovieData>>(emptyList())
    val movies: StateFlow<List<GhibliMovieData>> = _movies

    init {
        fetchMovies()
    }

    fun fetchMovies() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.ghibliApi.getMovies()
                _movies.value = response

            } catch (e: Exception) {
                println("Error fetching movies: ${e.message}")
            }
        }
    }

}