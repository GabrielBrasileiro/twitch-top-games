package com.universodoandroid.presentation.di

import com.universodoandroid.local.di.injectLocalModule
import com.universodoandroid.presentation.models.GamesViewModel
import com.universodoandroid.presentation.usecase.GamesUseCase
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val presentationModules = module {
    factory { GamesUseCase(get()) }

    viewModel { GamesViewModel(get()) }
}

fun injectPresentationModules() = presentationModules
fun injectLocalModule() = injectLocalModule()
fun injectRemoteModule() = com.universodoandroid.local.di.injectRemoteModule()