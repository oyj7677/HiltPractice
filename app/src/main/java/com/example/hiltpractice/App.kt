package com.example.hiltpractice

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {

    val TAG = App::class.java.simpleName

    @Inject
    lateinit var myName: MyName

    override fun onCreate() {
//        Log.e(TAG, "My name is $myName") // 의존성 주입 실패
        super.onCreate()
        Log.e(TAG, "My name is $myName") // 의존성 주입 성공
        // 이유는? super.onCreate()에서 의존성 주입이 발생하기 때문.
    }
}