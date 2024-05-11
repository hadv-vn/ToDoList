package com.joyce.todolist.di

import com.joyce.todolist.model.TDLModel
import com.joyce.todolist.service.TDLService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideTDLModel(): TDLModel {
        return TDLModel()
    }

    @Singleton
    @Provides
    fun provideTDLService(): TDLService {
        return TDLService()
    }
}