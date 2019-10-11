package com.universodoandroid.local.domain

import com.universodoandroid.core.domain.Game
import io.reactivex.disposables.Disposable

interface GamesRepository {
    fun loadGames(onSuccess: (List<Game>) -> Unit, onError: (String) -> Unit): Disposable
}