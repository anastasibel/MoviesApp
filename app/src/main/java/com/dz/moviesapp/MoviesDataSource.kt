package com.dz.moviesapp

class MoviesDataSource {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie("Avengers", 100),
            Movie("Tenet", 120),
            Movie("Black Widow", 130),
            Movie("Супер женщина", 220),
            Movie("Супер кот", 10),
            Movie("Леди баг", 12),
            Movie("Шишки", 13),
            Movie("Попик", 22),
        )
    }
}