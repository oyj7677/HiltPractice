package com.example.hiltpractice

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@EntryPoint
@InstallIn(SingletonComponent::class)
interface FooEntryPoint {
    fun getFoo(): Foo
}