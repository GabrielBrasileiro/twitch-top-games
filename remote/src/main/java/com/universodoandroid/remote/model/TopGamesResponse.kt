package com.universodoandroid.remote.model

data class TopGamesResponse(
    val _total: Int,
    val top: List<TopResponse>
)