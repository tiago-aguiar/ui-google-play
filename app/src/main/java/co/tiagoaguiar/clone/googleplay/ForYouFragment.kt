package co.tiagoaguiar.clone.googleplay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.clone.googleplay.model.Feed
import co.tiagoaguiar.clone.googleplay.model.feed
import com.google.gson.Gson

const val ARG_OBJECT = "object"

class ForYouFragment : Fragment() {

    private lateinit var verticalAdapter: VerticalAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_collection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            println(getSerializable(ARG_OBJECT))
//            val textView: TextView = view.findViewById(android.R.id.text1)
//            textView.text = getInt(ARG_OBJECT).toString()

            verticalAdapter = VerticalAdapter()
            view.findViewById<RecyclerView>(R.id.rv_vertical).adapter = verticalAdapter

            request()
        }
    }

    private fun request() {
        Thread {
            Thread.sleep(1000)
            val feed = Gson().fromJson(feed(), Feed::class.java)

            activity?.runOnUiThread {
                verticalAdapter.add(feed.categories)
            }
        }.start()
    }

}
