package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.Fragment.*

class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> caculatorFragment()
            1 -> LetterFragment()
            2 -> GomshintalkFragment()
            3 -> GunshopFragment()
            else -> StarzoneFragment()
        }
    }
    override fun getCount() = 5

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "계산기"
            1 -> "편지"
            2 -> "곰신톡"
            3 -> "군샵"
            else -> {
                return "별존"
            }
        }
    }
}
