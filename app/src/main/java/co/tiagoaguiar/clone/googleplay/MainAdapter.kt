package co.tiagoaguiar.clone.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter() : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder =
        MainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_game, parent, false)
        )

    override fun getItemCount(): Int = 15

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        println(position)
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

}