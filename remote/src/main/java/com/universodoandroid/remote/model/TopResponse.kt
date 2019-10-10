package com.universodoandroid.remote.model

data class TopResponse(
    val channels: Int,
    val game: GameResponse,
    val viewers: Int
)