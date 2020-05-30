package org.sopt.cldi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.sopt.cldi.DateParser
import org.sopt.cldi.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MainPagerAdapter(supportFragmentManager)
        main_viewPager.adapter = fragmentAdapter

        tabbar.setupWithViewPager(main_viewPager)
    }

}
