package com.universodoandroid.remote.di

import com.universodoandroid.remote.ApiDataSource
import com.universodoandroid.remote.BuildConfig
import com.universodoandroid.remote.domain.TopGamesApiDataSource
import com.universodoandroid.remote.domain.TopGamesRemoteDataSource
import com.universodoandroid.remote.games.TopGamesRemoteDataSourceImpl
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

internal val remoteModule = module {
    single { ApiDataSource(BuildConfig.BASE_URL) }

    factory { get<ApiDataSource>().createService(TopGamesApiDataSource::class.java) }
    factory<TopGamesRemoteDataSource> { TopGamesRemoteDataSourceImpl(get()) }
}

private val remoteModules = listOf(remoteModule)

private val loadRemoteModules by lazy { loadKoinModules(remoteModules) }

fun injectRemoteModules() = loadRemoteModules