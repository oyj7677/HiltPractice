package com.example.hiltpractice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import kotlin.random.Random

@Module
@InstallIn(DialogComponent::class)
class DialogModule {

    @Provides
    fun provideUser(): User{
        return User("OYJ")
    }

    @Provides
    @DialogScoped
    fun provideRandomNumber(): Int {
        return Random.nextInt(1000)
    }
}