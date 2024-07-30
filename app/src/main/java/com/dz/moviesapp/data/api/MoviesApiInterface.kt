package com.dz.moviesapp.data.api

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MoviesApiInterface {

    @GET("movie?")
    @Headers("X-API-KEY: CBAQ8YY-PQ0MCP0-N4PD5MJ-YCCGGHA")
    suspend fun getList(
        @Query("page") page:Int = 1,
        @Query("limit") limit:Int = 100,
        @Query("selectFields") selectFields: List<String> = listOf(
            "name",
            "description",
            "rating",
            "ageRating",
            "votes",
            "movieLength",
            "genres",
            "poster",
            "backdrop",
            "persons",
        )
    ): ResponseDTO
}