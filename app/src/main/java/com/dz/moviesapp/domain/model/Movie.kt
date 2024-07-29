package com.dz.moviesapp.domain.model

import com.dz.moviesapp.data.api.BackdropDTO
import com.dz.moviesapp.data.api.GenreDTO
import com.dz.moviesapp.data.api.PosterDTO
import com.dz.moviesapp.data.api.RatingDTO
import com.dz.moviesapp.data.api.VotesDTO

data class Movie(
    val name: String?,
    val description: String?,
    val rating: RatingDTO?,
    val votes: VotesDTO?,
    val movieLength: Int?,
    val ageRating: Int?,
    val genres: List<GenreDTO>?,
    val poster: PosterDTO?,
    val backdrop: BackdropDTO?,
    val persons: List<Person>?,
)