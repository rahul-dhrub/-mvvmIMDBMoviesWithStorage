package com.example.likecountmvvmimdbmovies.data.remote

import com.example.likecountmvvmimdbmovies.model.Movie

data class MovieResponse(
    val page: Int?,
    val total_results: Int?,
    val total_pages: Int?,
    val results: List<Movie>?
) {
    fun isSuccess(): Boolean = (page!! > 0)
}