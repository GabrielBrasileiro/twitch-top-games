package com.universodoandroid.remote.games

import com.universodoandroid.remote.BaseObserver
import com.universodoandroid.remote.domain.TopGamesApiDataSource
import com.universodoandroid.remote.domain.TopGamesRemoteDataSource
import io.reactivex.disposables.Disposable

internal class TopGamesRemoteDataSourceImpl(
    private val apiDataSource: TopGamesApiDataSource
) : BaseObserver(), TopGamesRemoteDataSource {

    override fun loadTopGames(): Disposable {
        return buildObserver(apiDataSource.getTopGames(), {

        }, {

        })
    }

}