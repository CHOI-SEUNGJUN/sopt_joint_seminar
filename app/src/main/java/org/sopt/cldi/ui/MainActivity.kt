package org.sopt.cldi.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.sopt.cldi.BestGunShopRecyclerView
import org.sopt.cldi.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRequestFocus()
        initPopularTags()
        initBestGunShopRecyclerView()
    }

    private fun initRequestFocus() {
        edtSearch.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
    }

    private fun initPopularTags() {
        listOf("가나다", "라마바", "사아자", "일이삼")
            .asSequence()
            .map { "#$it" }
            .toList()
            .forEach {
                val tag = layoutInflater.inflate(R.layout.item_popular_tag, tagContainer, false) as TextView
                tag.text = it
                tagContainer.addView(tag)
            }
    }

    private fun initBestGunShopRecyclerView() {
        rvBestGunShop.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = BestGunShopRecyclerView().apply { notifyDataSetChanged() }
        }
    }
}
