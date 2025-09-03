package com.example.ghibliverse.data

import retrofit2.http.GET

interface GhibliApi {
    @GET("films")
    suspend fun getMovies(): List<GhibliMovieData>
}