package com.example.hiltpractice.di

import javax.inject.Qualifier

@Qualifier
annotation class UserQualifier(val age: Int, val height: Int) {
}