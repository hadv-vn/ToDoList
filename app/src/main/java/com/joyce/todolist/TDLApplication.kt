package com.joyce.todolist

import android.app.Application
import android.content.Intent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TDLApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // This is where you can initialize things when your application starts
//        val intent = Intent(this, MainActivity::class.java)
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        startActivity(intent)
    }

    override fun onTerminate() {
        super.onTerminate()
        // This is where you can clean up resources when your application terminates
    }
}