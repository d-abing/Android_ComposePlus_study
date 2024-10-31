package com.example.chapter3.features.common.network.api

import com.example.chapter3.features.common.network.model.MovieResponse
import com.example.chapter3.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}