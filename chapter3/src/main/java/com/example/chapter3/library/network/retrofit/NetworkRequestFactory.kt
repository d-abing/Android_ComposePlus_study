package com.example.chapter3.library.network.retrofit

import com.example.chapter3.library.network.model.ApiResult
import com.example.chapter3.library.network.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}