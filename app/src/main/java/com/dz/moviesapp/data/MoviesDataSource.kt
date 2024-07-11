package com.dz.moviesapp.data

import com.dz.moviesapp.R
import com.dz.moviesapp.domain.models.Movie


class MoviesDataSource {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                "The Shawshank Redemption",
                100,
                listOf("Horror", "Drama", "Action"),
                4.0,
                125,
                true,
                16,
                R.drawable.avengers_pic
            ),
            Movie(
                "The Godfather",
                180,
                listOf("Action", "Comedy", "Fantasy"),
                8.5,
                140,
                false,
                18,
                R.drawable.ww_img
            ),
            Movie(
                "Forrest Gump",
                90,
                listOf("Fantasy", "Action", "Comedy"),
                7.0,
                70,
                true,
                13,
                R.drawable.widow_img
            ),
            Movie(
                "Fight Club",
                120,
                listOf("Drama", "Romance", "Comedy"),
                3.0,
                205,
                true,
                13,
                R.drawable.avengers_pic
            ),
            Movie(
                "The Matrix",
                105,
                listOf("Drama", "Fantasy", "Romance"),
                9.0,
                195,
                false,
                6,
                R.drawable.tenet_img
            ),
            Movie(
                "The Lord of the Rings: The Return of the King",
                330,
                listOf("Drama", "Fantasy", "Action"),
                2.0,
                250,
                true,
                13,
                R.drawable.ww_img
            ),
            Movie(
                "Inception",
                111,
                listOf("Drama", "Comedy"),
                8.0,
                805,
                false,
                18,
                R.drawable.widow_img
            ),
        )
    }
}