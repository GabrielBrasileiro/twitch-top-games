package com.universodoandroid.twitchtopgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.universodoandroid.core.defaultNumberOfColumns
import com.universodoandroid.remote.domain.TopGamesRemoteDataSource
import com.universodoandroid.twitchtopgames.games.adapter.GameAdapter
import com.universodoandroid.twitchtopgames.games.dto.GameDto
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val remoteDataSource: TopGamesRemoteDataSource by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        remoteDataSource.loadTopGames({
            val games = it.map { game ->
                GameDto(
                    id = game.id,
                    name = game.name,
                    imageUrl = game.urlImage
                )
            }

            gamesRecyclerView.run {
                layoutManager = GridLayoutManager(context, resources.defaultNumberOfColumns())
                adapter = GameAdapter(games) { dto ->
                    Toast.makeText(applicationContext, dto.name, Toast.LENGTH_SHORT).show()
                }
            }
        }, {

        })
    }

}
