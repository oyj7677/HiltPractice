package com.example.hiltpractice

import dagger.BindsOptionalOf
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class FooModule {

    @BindsOptionalOf
    abstract fun optinalFoo(): Foo
}