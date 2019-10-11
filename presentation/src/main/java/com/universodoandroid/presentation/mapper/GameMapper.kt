package com.universodoandroid.presentation.mapper

import com.universodoandroid.core.domain.Game
import com.universodoandroid.presentation.dto.GameDto

object GameMapper {

    fun mapToDto(games: List<Game>) = games.map {
        GameDto(
            id = it.id,
            name = it.name,
            imageUrl = it.urlImage
        )
    }

}