package com.universodoandroid.presentation.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.universodoandroid.presentation.usecase.GamesUseCase

class GamesViewModel(private val useCase: GamesUseCase) : ViewModel() {

    private val state = MutableLiveData<List<String>>()

    fun loadGames() {
        print(useCase)
    }

}