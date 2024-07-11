package com.example.hiltpractice.module

import com.example.hiltpractice.di.User
import com.example.hiltpractice.di.UserQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UserModule {

    @Provides
    @UserQualifier(33, 176)
    fun provideOyj(): User {
        return User("OYJ")
    }

    @Provides
    @UserQualifier(29, 165)
    fun providePch(): User {
        return User("PCH")
    }
}