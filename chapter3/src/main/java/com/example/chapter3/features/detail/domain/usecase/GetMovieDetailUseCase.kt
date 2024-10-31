package com.example.chapter3.features.detail.domain.usecase

import com.example.chapter3.features.common.entity.MovieDetailEntity
import com.example.chapter3.features.common.repository.IMovieDataSource
import javax.inject.Inject


class GetMovieDetailUseCase @Inject constructor(
    private val dataSource: IMovieDataSource
) : IGetMovieDetailUseCase {
    override suspend fun invoke(name: String): MovieDetailEntity {
        return dataSource.getMovieDetail(name)
    }
}