package com.universodoandroid.twitchtopgames.games.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.universodoandroid.core.show
import com.universodoandroid.presentation.dto.GameDto
import com.universodoandroid.twitchtopgames.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.game_item.*

class GameAdapter(
    private val games: List<GameDto>,
    private val onClick: (GameDto) -> Unit
) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.game_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = games.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentGame = games[position]

        holder.containerView.setOnClickListener { onClick(currentGame) }
        holder.bind(currentGame)
    }


    inner class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bind(game: GameDto) {
            gameTextView.text = game.name
            loadImage(game.imageUrl)
        }

        private fun loadImage(url: String) {
            progressBar.show(true)

            Picasso.get().load(url).into(gameImageView, object : Callback {
                override fun onSuccess() = progressBar.show(false)
                override fun onError(e: Exception?) = progressBar.show(false)
            })
        }
    }

}