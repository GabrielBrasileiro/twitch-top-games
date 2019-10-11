package com.universodoandroid.presentation.usecase

import com.universodoandroid.local.domain.GamesRepository
import com.universodoandroid.presentation.dto.GameDto
import com.universodoandroid.presentation.mapper.GameMapper

class GamesUseCase(private val repository: GamesRepository) {

    fun loadGames(onSuccess: (List<GameDto>) -> Unit, onError: (String) -> Unit) {
        repository.loadGames({
            val games = GameMapper.mapToDto(it)
            onSuccess(games)
        }, onError)
    }

}