package co.tiagoaguiar.clone.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter() : RecyclerView.Adapter<HorizontalAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder =
        MainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_game, parent, false)
        )

    override fun getItemCount(): Int = 15

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind()
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
        }
    }

}
