package com.example.hiltpractice

import android.content.Context
import android.util.Log
import dagger.hilt.EntryPoints

class FooManager {
    private val TAG = "FooManager"
    fun doSomething(context: Context) {
        val fooEntryPoint = EntryPoints.get(context, FooEntryPoint::class.java)
        val foo = fooEntryPoint.getFoo()
        Log.e(TAG, "f oo = $foo ")
    }
}