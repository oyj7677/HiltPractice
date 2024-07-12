package com.example.hiltpractice

import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine
) {
}