package com.example.chapter3.features.feed.domain.usecase

import com.example.chapter3.features.common.entity.CategoryEntity
import com.example.chapter3.features.common.entity.EntityWrapper
import com.example.chapter3.features.feed.domain.SortOrder

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
}