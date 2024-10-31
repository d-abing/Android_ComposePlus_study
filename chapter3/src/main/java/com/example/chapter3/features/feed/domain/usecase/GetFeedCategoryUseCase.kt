package com.example.chapter3.features.feed.domain.usecase

import com.example.chapter3.features.common.entity.CategoryEntity
import com.example.chapter3.features.common.entity.EntityWrapper
import com.example.chapter3.features.common.repository.IMovieDataSource
import com.example.chapter3.features.feed.domain.SortOrder
import javax.inject.Inject

class GetFeedCategoryUseCase @Inject constructor(
    private val dataSource: IMovieDataSource
) : IGetFeedCategoryUseCase{
    override suspend fun invoke(sortOrder: SortOrder?): EntityWrapper<List<CategoryEntity>> {
        return dataSource.getCategories(sortOrder)
    }
}