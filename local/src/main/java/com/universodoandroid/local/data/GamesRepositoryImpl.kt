package com.universodoandroid.local.data

import com.universodoandroid.core.domain.Game
import com.universodoandroid.local.domain.GamesRepository
import com.universodoandroid.remote.domain.TopGamesRemoteDataSource
import io.reactivex.disposables.Disposable

class GamesRepositoryImpl(private val remoteDataSource: TopGamesRemoteDataSource) : GamesRepository {

    override fun loadGames(onSuccess: (List<Game>) -> Unit, onError: (String) -> Unit): Disposable {
        return remoteDataSource.loadTopGames(onSuccess, onError)
    }

}