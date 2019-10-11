package com.universodoandroid.twitchtopgames

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.universodoandroid.presentation.models.GamesViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<GamesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.loadGames()
    }

}
