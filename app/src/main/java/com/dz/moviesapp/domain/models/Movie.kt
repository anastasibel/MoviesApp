package com.dz.moviesapp.domain.models


data class Movie(
    var name: String,
    var timing: Int,
    var genres: List<String>,
    var rating: Double,
    val reviews: Int,
    val isLiked: Boolean,
    val parentalGuidance: Int,
    val image: Int,
)
