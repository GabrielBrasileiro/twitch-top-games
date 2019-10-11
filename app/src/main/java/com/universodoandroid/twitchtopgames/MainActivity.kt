package com.universodoandroid.twitchtopgames

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.universodoandroid.core.defaultNumberOfColumns
import com.universodoandroid.presentation.dto.GameDto
import com.universodoandroid.presentation.models.GamesViewModel
import com.universodoandroid.twitchtopgames.games.adapter.GameAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<GamesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initGamesObserver()
    }

    private fun initGamesObserver() {
        viewModel.getState().observe(this, Observer {
            setupRecyclerView(it)
        })

        viewModel.loadGames()
    }

    private fun setupRecyclerView(games: List<GameDto>) {
        gamesRecyclerView.run {
            layoutManager = GridLayoutManager(context, resources.defaultNumberOfColumns())
            adapter = GameAdapter(games) { dto ->
                Toast.makeText(applicationContext, dto.name, Toast.LENGTH_SHORT).show()
            }
        }
    }

}
