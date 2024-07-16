package com.example.hiltpractice

import android.os.Build
import androidx.annotation.RequiresApi
import dagger.hilt.internal.GeneratedComponentManager
import java.time.LocalDateTime
import javax.inject.Inject

class DialogComponentManager @Inject constructor(
    private val dialogComponentBuilder: DialogComponentBuilder
) : GeneratedComponentManager<DialogComponent> {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun generatedComponent(): DialogComponent {
        return dialogComponentBuilder
            .setLocalDateTime(LocalDateTime.now())
            .build()
    }
}