package org.sopt.cldi.ui.gunShop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.sopt.cldi.R
import org.sopt.cldi.ui.gunShop.RecyclerViewAdapter
import org.sopt.cldi.data.BestItem

class GunShopFragment : Fragment() {

    lateinit var adapter: RecyclerViewAdapter
    lateinit var fragGunShopRv : RecyclerView

    var dummy = listOf(
        BestItem(
            thumb = R.drawable.gunshop_img_best_1,
            title = "나이키 에어포스",
            price = "180,000"
        ),
        BestItem(
            thumb = R.drawable.gunshop_img_best_2,
            title = "나이키 데이브레이크",
            price = "120,000"
        ),
        BestItem(
            thumb = R.drawable.gunshop_img_best_3,
            title = "이니스프리 로션",
            price = "55,000"
        ),
        BestItem(
            thumb = R.drawable.gunshop_img_best_4,
            title = "필립스 면도기",
            price = "140,000"
        ),
        BestItem(
            thumb = R.drawable.gunshop_img_best_5,
            title = "구급상자",
            price = "43,000"
        ),
        BestItem(
            thumb = R.drawable.gunshop_img_best_6,
            title = "이니스프리 로션",
            price = "48,000"
        )
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_gun_shop, container, false)
        fragGunShopRv = rootView.findViewById(R.id.frag_gun_shop_rv_list) as RecyclerView
        initRv()
        return rootView
    }

    fun initRv(){
        adapter = RecyclerViewAdapter(requireContext())
        fragGunShopRv.adapter = adapter
        fragGunShopRv.layoutManager = GridLayoutManager(requireContext(),3)
        adapter.data = dummy
        adapter.notifyDataSetChanged()
    }

}
