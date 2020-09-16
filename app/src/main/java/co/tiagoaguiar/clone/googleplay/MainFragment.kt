package co.tiagoaguiar.clone.googleplay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.frag_view_pager.adapter = CategoryAdapter(this)

        for (i in 0 until view.tab_layout.tabCount) {

        }

        TabLayoutMediator(view.tab_layout, view.frag_view_pager) { tab, position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()
    }

    inner class CategoryAdapter(val fa: Fragment) : FragmentStateAdapter(fa) {

        override fun getItemCount(): Int = 6

        override fun createFragment(position: Int): Fragment {
            val frag = DemoObjectFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_OBJECT, position + 1)
                }
            }

//            val tab: TabLayout.Tab? = fa.tab_layout.getTabAt(position)
//            val relativeLayout = LayoutInflater.from(requireContext())
//                .inflate(R.layout.tab_layout, fa.tab_layout, false) as RelativeLayout
//            val tabTextView =
//                relativeLayout.findViewById<View>(R.id.tab_title) as TextView
//            tabTextView.text = tab?.text
//            tab?.customView = relativeLayout
//            tab?.select()
            return frag
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}