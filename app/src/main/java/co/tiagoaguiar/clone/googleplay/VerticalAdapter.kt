package co.tiagoaguiar.clone.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_horizontal_rv.view.*

class VerticalAdapter() : RecyclerView.Adapter<VerticalAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder =
        MainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_horizontal_rv, parent, false)
        )

    override fun getItemCount(): Int = 8

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
       holder.bind()
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            with(itemView) {
                this.rv_horizontal.layoutManager =
                    LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
                this.rv_horizontal.adapter = HorizontalAdapter()
            }
        }
    }

}