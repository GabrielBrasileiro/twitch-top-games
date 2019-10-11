package com.universodoandroid.remote.domain.mapper

import com.universodoandroid.core.domain.Game
import com.universodoandroid.remote.model.TopGamesResponse

object GameMapper {

    fun mapResponse(response: TopGamesResponse) =  response.top.map {
        Game(
            id = it.game.id,
            name = it.game.name,
            urlImage = it.game.box.large,
            channelCount = it.channels,
            views = it.viewers
        )
    }

}