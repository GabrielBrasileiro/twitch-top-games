package com.universodoandroid.remote.domain

import io.reactivex.disposables.Disposable

interface TopGamesRemoteDataSource {
    fun loadTopGames(): Disposable
}