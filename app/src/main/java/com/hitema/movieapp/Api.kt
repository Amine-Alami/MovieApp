package com.hitema.movieapp

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "189313a174a15dd2512f9d0fbb8faa56",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "189313a174a15dd2512f9d0fbb8faa56",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "189313a174a15dd2512f9d0fbb8faa56",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/{id}?api_key=189313a174a15dd2512f9d0fbb8faa56")
    suspend fun getMovieDetails(@Path("id") id: Int): Response<Movie>
}