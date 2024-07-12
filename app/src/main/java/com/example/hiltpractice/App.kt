package com.example.hiltpractice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {

    val TAG = App::class.java.simpleName

    @Inject
    override fun onCreate() {
        super.onCreate()
    }
}