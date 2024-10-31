package com.example.chapter3.library.storage.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.example.chapter3.library.storage.IStorage
import com.example.chapter3.library.storage.StorageManager
import com.example.chapter3.library.storage.helpers.DataConverter
import com.example.chapter3.library.storage.helpers.DataEncoding
import com.example.chapter3.library.storage.prefs.SharedPrefsStorageProvider
import com.example.chapter3.library.storage.prefs.StorageProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {

    @Singleton
    @Provides
    fun bindOnDiscStorage(
        storage: StorageProvider,
        converter: DataConverter,
        encoding: DataEncoding
    ): IStorage = StorageManager(storage, converter, encoding)

    @Provides
    fun provideSharePrefStorageProvider(provider: SharedPrefsStorageProvider): StorageProvider =
        provider

}
