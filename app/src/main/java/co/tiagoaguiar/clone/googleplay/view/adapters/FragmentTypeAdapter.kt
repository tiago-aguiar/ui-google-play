package co.tiagoaguiar.clone.googleplay.view.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import co.tiagoaguiar.clone.googleplay.view.ARG_GAME_TYPE
import co.tiagoaguiar.clone.googleplay.view.GameFragment
import co.tiagoaguiar.clone.googleplay.model.GamesType

class FragmentTypeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = GamesType.values().size

    override fun createFragment(position: Int): Fragment = GameFragment().apply {
        arguments = Bundle().apply {
            putSerializable(ARG_GAME_TYPE, GamesType.values()[position])
        }
    }

}