package com.example.lloydscleancode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.multidex.MultiDexApplication
import com.example.lloydscleancode.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


open class MainApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        initiateKoin()
    }

    private fun initiateKoin() {
        startKoin{
            androidContext(this@MainApp)
            modules(provideDependency())
        }
    }

    open fun provideDependency() = appComponent
}