package com.universodoandroid.remote.model

data class GameResponse(
    val _id: Int,
    val box: BoxResponse,
    val giantbombId: Int,
    val locale: String,
    val localizedName: String,
    val logo: LogoResponse,
    val name: String,
    val popularity: Int
)