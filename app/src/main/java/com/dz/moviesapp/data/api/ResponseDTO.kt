package com.dz.moviesapp.data.api

import com.dz.moviesapp.domain.model.Movie

data class ResponseDTO(
    val docs: List<Movie>,
    val limit: Int,
    val page: Int,
    val pages: Int,
    val total: Int
)