package co.tiagoaguiar.clone.googleplay.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.clone.googleplay.R
import co.tiagoaguiar.clone.googleplay.model.*
import co.tiagoaguiar.clone.googleplay.view.adapters.ForYouVerticalAdapter
import co.tiagoaguiar.clone.googleplay.view.adapters.TopChartsVerticalAdapter
import com.google.gson.Gson
import java.lang.RuntimeException

const val ARG_GAME_TYPE = "arg_game_type"

class GameFragment : Fragment() {

    private var forYouVerticalAdapter: ForYouVerticalAdapter? = null
    private var topChartsVerticalAdapter: TopChartsVerticalAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_GAME_TYPE) }?.apply {
            when(getSerializable(ARG_GAME_TYPE) as GamesType) {
                GamesType.FOR_YOU -> {
                    forYouVerticalAdapter = ForYouVerticalAdapter()
                    view.findViewById<RecyclerView>(R.id.rv_vertical).adapter = forYouVerticalAdapter
                    requestForYou()
                }
                GamesType.TOP_CHARTS -> {
                    topChartsVerticalAdapter = TopChartsVerticalAdapter()
                    view.findViewById<RecyclerView>(R.id.rv_vertical).adapter = topChartsVerticalAdapter
                    requestTopCharts()
                }
                GamesType.PREMIUM -> {
                    forYouVerticalAdapter = ForYouVerticalAdapter()
                    view.findViewById<RecyclerView>(R.id.rv_vertical).adapter = forYouVerticalAdapter
                    requestForYou()
                }
                else -> {}
            }

        }
    }

    private fun requestForYou() {
        Thread {
            Thread.sleep(1000)
            val feed = Gson().fromJson(feed(), Feed::class.java)

            activity?.runOnUiThread {
                forYouVerticalAdapter?.add(feed.categories)
            }
        }.start()
    }

    private fun requestTopCharts() {
        Thread {
            Thread.sleep(1000)
            val topChart = Gson().fromJson(topCharts(), Category::class.java)

            activity?.runOnUiThread {
                topChartsVerticalAdapter?.add(topChart.games)
            }
        }.start()
    }

}
