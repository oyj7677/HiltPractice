package com.example.hiltpractice

import java.util.UUID
import javax.inject.Inject

class MyName @Inject constructor() {

    private val uuid = UUID.randomUUID()

    override fun toString(): String {
        return uuid.toString()
    }
}