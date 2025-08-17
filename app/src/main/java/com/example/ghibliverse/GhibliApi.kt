package com.example.ghibliverse

import retrofit2.http.GET

interface GhibliApi {
    @GET("films")
    suspend fun getMovies() : List<GhibliMovieData>
}