package com.universodoandroid.twitchtopgames

import android.app.Application
import com.universodoandroid.remote.di.injectRemoteModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class TwitchTopGamesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(applicationContext)
            injectRemoteModules()
        }
    }

}