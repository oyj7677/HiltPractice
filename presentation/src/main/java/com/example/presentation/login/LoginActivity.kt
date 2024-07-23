package com.example.presentation.login

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.presentation.theme.HiltPracticeTheme

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreate: ", )
        setContent {
            HiltPracticeTheme {
                LoginNavHost()
            }
        }
    }

    companion object {
        private const val TAG = "LoginActivity"
    }
}