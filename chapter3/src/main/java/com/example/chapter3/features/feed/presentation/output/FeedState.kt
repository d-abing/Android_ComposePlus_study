package com.example.chapter3.features.feed.presentation.output

import com.example.chapter3.features.common.entity.CategoryEntity
import com.example.chapter3.features.common.entity.MovieFeedItemEntity

sealed class FeedState {
    object Loading: FeedState()
    class Main(
        val categories: List<CategoryEntity>
    ): FeedState()
    class Failed(
        val reason: String
    ): FeedState()
}