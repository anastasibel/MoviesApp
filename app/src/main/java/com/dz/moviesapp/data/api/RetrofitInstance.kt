package com.dz.moviesapp.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://api.kinopoisk.dev/v1.4/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: MoviesApiInterface by lazy {
        retrofit.create(MoviesApiInterface::class.java)
    }

}