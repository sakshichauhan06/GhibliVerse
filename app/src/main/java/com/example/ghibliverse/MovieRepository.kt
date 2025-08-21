package com.example.ghibliverse

class MovieRepository(private val api: GhibliApi) {

    suspend fun getMovies() : List<GhibliMovieData> {
        return api.getMovies()
    }
}