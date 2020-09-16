package co.tiagoaguiar.clone.googleplay

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_game.view.*


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
            val icon: Bitmap = BitmapFactory.decodeResource(
                itemView.resources,
                R.drawable.angry
            )
            val dr: RoundedBitmapDrawable = RoundedBitmapDrawableFactory.create(
                itemView.resources,
                icon
            )
//            val dip = 100f
//            val px = TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,
//                dip,
//                itemView.resources.displayMetrics
//            )
            dr.cornerRadius = (icon.width / 4).toFloat()
            itemView.item_icon.setImageDrawable(dr)
        }
    }

}
