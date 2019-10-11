package com.universodoandroid.remote.data

import com.universodoandroid.core.domain.Game
import com.universodoandroid.remote.BaseObserver
import com.universodoandroid.remote.domain.TopGamesApiDataSource
import com.universodoandroid.remote.domain.TopGamesRemoteDataSource
import com.universodoandroid.remote.domain.mapper.GameMapper
import io.reactivex.disposables.Disposable

internal class TopGamesRemoteDataSourceImpl(
    private val apiDataSource: TopGamesApiDataSource
) : BaseObserver(), TopGamesRemoteDataSource {

    override fun loadTopGames(onSuccess: (List<Game>) -> Unit, onError: (String) -> Unit): Disposable {
        return buildObserver(apiDataSource.getTopGames(), {
            val games = GameMapper.mapResponse(it)
            onSuccess(games)
        }, {
            onError(it.localizedMessage)
        })
    }

}