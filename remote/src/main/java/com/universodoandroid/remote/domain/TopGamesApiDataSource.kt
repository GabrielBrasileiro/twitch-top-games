package com.universodoandroid.remote.domain

import com.universodoandroid.remote.model.TopGamesResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers

interface TopGamesApiDataSource {

    @Headers(
        "client-id: 94c7letgsmv0wpum1t5r73n2pbou2v",
        "accept: application/vnd.twitchtv.v5+json"
    )
    @GET("top")
    fun getTopGames(): Observable<TopGamesResponse>
}