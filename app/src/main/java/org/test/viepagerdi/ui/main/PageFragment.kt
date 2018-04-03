package org.test.viepagerdi.ui.main


import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.test.viepagerdi.R
import org.test.viepagerdi.util.buildViewModel
import javax.inject.Inject

class PageFragment : Fragment() {


    @Inject
    lateinit var factory:ViewModelProvider.Factory

    val page:Int by lazy { arguments!!.getInt(ARG_PAGE) }
    val viewModel:MainViewModel by lazy { buildViewModel<MainViewModel>(factory) }

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onResume() {
        super.onResume()
                // LOGICA
    }

        companion object {

        private val ARG_PAGE = "page"

        fun instance(page:Int):PageFragment{
            val fragment = PageFragment()
            val args = Bundle()
            args.putInt(ARG_PAGE, page)
            fragment.arguments = args
            return fragment
        }
    }


}
