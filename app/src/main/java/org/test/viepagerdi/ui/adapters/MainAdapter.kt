package org.test.viepagerdi.ui.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import org.test.viepagerdi.ui.main.PageFragment

class MainAdapter(fm:FragmentManager): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment = PageFragment.instance(position)

    override fun getCount(): Int = 3

}