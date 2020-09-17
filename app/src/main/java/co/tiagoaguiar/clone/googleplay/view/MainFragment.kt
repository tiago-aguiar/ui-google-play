package co.tiagoaguiar.clone.googleplay.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import co.tiagoaguiar.clone.googleplay.R
import co.tiagoaguiar.clone.googleplay.model.GamesType
import co.tiagoaguiar.clone.googleplay.view.adapters.FragmentTypeAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.frag_view_pager.adapter = FragmentTypeAdapter(this)
        view.frag_view_pager.isUserInputEnabled = false

        TabLayoutMediator(view.tab_layout, view.frag_view_pager) { tab, position ->
            tab.text = GamesType.values()[position].label
        }.attach()
    }

}