package com.universodoandroid.local.di

import com.universodoandroid.local.data.GamesRepositoryImpl
import com.universodoandroid.local.domain.GamesRepository
import org.koin.dsl.module

internal val localModule = module {
    factory<GamesRepository> { GamesRepositoryImpl(get()) }
}

fun injectLocalModule() = localModule
fun injectRemoteModule() = com.universodoandroid.remote.di.injectRemoteModule()