package com.universodoandroid.presentation.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.universodoandroid.presentation.dto.GameDto
import com.universodoandroid.presentation.usecase.GamesUseCase

class GamesViewModel(private val useCase: GamesUseCase) : ViewModel() {

    private val state = MutableLiveData<List<GameDto>>()

    fun getState(): LiveData<List<GameDto>> = state

    fun loadGames() {
        useCase.loadGames({
            state.postValue(it)
        }) {

        }
    }

}