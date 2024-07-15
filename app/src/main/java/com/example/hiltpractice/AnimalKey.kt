package com.example.hiltpractice

import dagger.MapKey

@MapKey
annotation class AnimalKey(val value: Animal) {
}