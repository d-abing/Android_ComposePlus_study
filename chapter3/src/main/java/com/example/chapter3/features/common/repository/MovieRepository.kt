package com.example.chapter3.features.common.repository

import com.example.chapter3.features.common.entity.CategoryEntity
import com.example.chapter3.features.common.entity.EntityWrapper
import com.example.chapter3.features.common.entity.MovieDetailEntity
import com.example.chapter3.features.common.network.api.IMovieAppNetworkApi
import com.example.chapter3.features.feed.data.FeedConstants
import com.example.chapter3.features.feed.data.mapper.CategoryMapper
import com.example.chapter3.features.feed.domain.SortOrder
import com.example.chapter3.library.network.model.ApiResponse
import com.example.chapter3.library.storage.IStorage
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val movieNetworkApi: IMovieAppNetworkApi,
    private val storage: IStorage,
    private val categoryMapper: CategoryMapper,
): IMovieDataSource{
    override suspend fun getCategories(sortOrder: SortOrder?): EntityWrapper<List<CategoryEntity>> {
        return categoryMapper.mapFromResult(
            result = movieNetworkApi.getMovies(),
            extra = sortOrder
        )
    }

    override suspend fun getMovieDetail(movieName: String): MovieDetailEntity {
        return storage
            .get<List<MovieDetailEntity>>(FeedConstants.MOVIE_LIST_KEY)
            ?.single { it.title == movieName }
            ?: MovieDetailEntity()
    }
}