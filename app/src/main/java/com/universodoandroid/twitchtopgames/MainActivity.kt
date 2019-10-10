package com.universodoandroid.twitchtopgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.universodoandroid.remote.domain.TopGamesRemoteDataSource
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val remoteDataSource: TopGamesRemoteDataSource by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        remoteDataSource.loadTopGames()
    }

}
