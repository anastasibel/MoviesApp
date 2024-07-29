package com.dz.moviesapp.domain.repository

import com.dz.moviesapp.domain.model.Movie

interface MoviesRepository {

    suspend fun getMoviesList(): List<Movie>

}