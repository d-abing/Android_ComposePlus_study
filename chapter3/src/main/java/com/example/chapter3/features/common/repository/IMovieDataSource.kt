package com.example.chapter3.features.common.repository

import com.example.chapter3.features.common.entity.CategoryEntity
import com.example.chapter3.features.common.entity.EntityWrapper
import com.example.chapter3.features.common.entity.MovieDetailEntity
import com.example.chapter3.features.feed.domain.SortOrder

interface IMovieDataSource {
    suspend fun getCategories(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
    suspend fun getMovieDetail(movieName: String): MovieDetailEntity
}