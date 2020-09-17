package co.tiagoaguiar.clone.googleplay.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.clone.googleplay.R
import co.tiagoaguiar.clone.googleplay.model.Game
import co.tiagoaguiar.clone.googleplay.util.ImageDownloader
import kotlinx.android.synthetic.main.item_game.view.*
import kotlinx.android.synthetic.main.item_game.view.item_icon
import kotlinx.android.synthetic.main.item_game.view.item_size
import kotlinx.android.synthetic.main.item_game.view.item_title
import kotlinx.android.synthetic.main.item_top_game.view.*


class TopChartsVerticalAdapter(private val games: MutableList<Game> = mutableListOf()) :
    RecyclerView.Adapter<TopChartsVerticalAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder =
        MainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_top_game, parent, false)
        )

    override fun getItemCount(): Int = games.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(games[position])
    }

    fun add(games: List<Game>) {
        this.games.clear()
        this.games.addAll(games)
        notifyDataSetChanged()
    }

    class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(game: Game) {
            with(itemView) {
                ImageDownloader.download(item_icon, game.icon, 4)

                item_number.text = adapterPosition.toString()
                item_title.text = game.title
                item_size.text = game.subtitle
            }
        }
    }

}