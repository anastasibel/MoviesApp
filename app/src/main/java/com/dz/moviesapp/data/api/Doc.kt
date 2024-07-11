package com.dz.moviesapp.data.api

data class Doc(
    val ageRating: Int,
    val alternativeName: String,
    val backdrop: Backdrop,
    val countries: List<Country>,
    val description: String,
    val enName: Any,
    val genres: List<Genre>,
    val id: Int,
    val isSeries: Boolean,
    val movieLength: Int,
    val name: String,
    val poster: Poster,
    val rating: Rating,
    val ratingMpaa: String,
    val seriesLength: Any,
    val shortDescription: String,
    val status: Any,
    val ticketsOnSale: Boolean,
    val top10: Any,
    val top250: Any,
    val totalSeriesLength: Any,
    val type: String,
    val typeNumber: Int,
    val votes: Votes,
    val year: Int
)