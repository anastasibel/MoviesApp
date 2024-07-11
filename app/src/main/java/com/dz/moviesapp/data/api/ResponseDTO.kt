package com.dz.moviesapp.data.api

data class ResponseDTO(
    val docs: List<Doc>,
    val limit: Int,
    val page: Int,
    val pages: Int,
    val total: Int
)