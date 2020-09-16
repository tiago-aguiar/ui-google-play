package co.tiagoaguiar.clone.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.clone.googleplay.model.Game
import co.tiagoaguiar.clone.googleplay.util.ImageDownloader
import kotlinx.android.synthetic.main.item_game.view.*


class HorizontalAdapter(private val games: List<Game>) : RecyclerView.Adapter<HorizontalAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder =
        MainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_game, parent, false)
        )

    override fun getItemCount(): Int = games.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(games[position])
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(game: Game) {
            ImageDownloader.download(itemView.item_icon, game.icon, 4)

            itemView.item_title.text = game.title
            itemView.item_size.text = game.subtitle
        }
    }

}
