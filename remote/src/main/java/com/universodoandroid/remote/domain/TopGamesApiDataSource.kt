package com.universodoandroid.remote.domain

import com.universodoandroid.remote.model.GameResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface TopGamesApiDataSource {

    @GET("top")
    fun getTopGames(): Observable<List<GameResponse>>
}