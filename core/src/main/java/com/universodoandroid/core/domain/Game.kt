package com.universodoandroid.core.domain

data class Game(
    val id: Int,
    val name: String,
    val urlImage: String,
    val channelCount: Int,
    val views: Int
)