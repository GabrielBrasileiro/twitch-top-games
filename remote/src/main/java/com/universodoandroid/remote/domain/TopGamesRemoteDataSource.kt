package com.universodoandroid.remote.domain

import com.universodoandroid.core.domain.Game
import io.reactivex.disposables.Disposable

interface TopGamesRemoteDataSource {
    fun loadTopGames(onSuccess: (List<Game>) -> Unit, onError: (String) -> Unit): Disposable
}