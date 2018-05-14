package com.example.myapplication

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.app.FragmentManager

class pageradapter (fm: FragmentManager) : FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
         when (position) {
                0 -> return Fragment1()
                1 -> return Fragment2()
                2 -> return Fragment3()
               else -> return Fragment4()
        }
    }

    override fun getCount(): Int {
       return 4
    }

}