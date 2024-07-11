package com.example.hiltpractice.module

import android.util.Log
import com.example.hiltpractice.MyName
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyName(): MyName {
        Log.e("AppModule", "provideMyName 호출")
        return MyName()
    }
}