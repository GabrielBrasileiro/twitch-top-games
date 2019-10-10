package com.universodoandroid.remote.di

import com.universodoandroid.remote.ApiDataSource
import com.universodoandroid.remote.BuildConfig
import org.koin.dsl.module

internal val remoteModule = module {
    single { ApiDataSource(BuildConfig.BASE_URL, BuildConfig.USER_ID, BuildConfig.ACCEPT) }
}