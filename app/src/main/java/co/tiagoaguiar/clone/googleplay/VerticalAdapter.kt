package co.tiagoaguiar.clone.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.clone.googleplay.model.Category
import kotlinx.android.synthetic.main.item_horizontal_rv.view.*


class VerticalAdapter(private val categories: MutableList<Category> = mutableListOf()) :
    RecyclerView.Adapter<VerticalAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder =
        MainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_horizontal_rv, parent, false)
        )

    override fun getItemCount(): Int = categories.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(categories[position])
    }

    fun add(categories: List<Category>) {
        this.categories.clear()
        this.categories.addAll(categories)
        notifyDataSetChanged()
    }

    class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(category: Category) {
            with(itemView) {
                this.txt_title.text = category.title
                this.txt_subtitle.text = category.title
                this.rv_horizontal.layoutManager =
                    LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
                this.rv_horizontal.adapter = HorizontalAdapter(category.games.shuffled())
            }
        }
    }

}