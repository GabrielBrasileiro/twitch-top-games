package com.universodoandroid.remote.model

import com.google.gson.annotations.SerializedName

data class GameResponse(
    @SerializedName("_id")
    val id: Int,
    val box: BoxResponse,
    val giantbombId: Int,
    val locale: String,
    val localizedName: String,
    val logo: LogoResponse,
    val name: String,
    val popularity: Int
)