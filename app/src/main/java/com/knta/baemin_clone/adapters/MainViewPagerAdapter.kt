package com.knta.baemin_clone.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.knta.baemin_clone.fragments.MyProfileFragment
import com.knta.baemin_clone.fragments.StoreListFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2


    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> StoreListFragment()
            else -> MyProfileFragment()
        }
    }


}