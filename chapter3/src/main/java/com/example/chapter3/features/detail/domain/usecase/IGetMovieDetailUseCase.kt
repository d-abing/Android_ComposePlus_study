package com.example.chapter3.features.detail.domain.usecase

import com.example.chapter3.features.common.entity.MovieDetailEntity

interface IGetMovieDetailUseCase {
    suspend operator fun invoke(name: String): MovieDetailEntity
}