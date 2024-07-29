package com.dz.moviesapp.data.repository

import com.dz.moviesapp.domain.model.Movie
import com.dz.moviesapp.data.api.MoviesApiInterface
import com.dz.moviesapp.data.api.RetrofitInstance
import com.dz.moviesapp.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

class MoviesRepositoryImpl(): MoviesRepository {
    override suspend fun getMoviesList(): List<Movie> = withContext(Dispatchers.IO) {
        RetrofitInstance.api.getList().docs
    }

}