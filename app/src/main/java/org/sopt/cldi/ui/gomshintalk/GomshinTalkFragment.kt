package org.sopt.cldi.ui.gomshintalk

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_gomshin_talk.*
import org.sopt.cldi.NetworkImpl
import org.sopt.cldi.R
import org.sopt.cldi.data.BaseResponse
import org.sopt.cldi.data.GomshinTalkData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */
class GomshinTalkFragment : Fragment() {

    private var data =  mutableListOf<GomshinTalkData>()

    private lateinit var gomshinTalkAdapter: GomshinTalkAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gomshin_talk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setButtonEvent()
        setAdapter(data)
    }

    //어뎁터 연결 함수
    private fun setAdapter(gomshinTalkItem : MutableList<GomshinTalkData>) {
        rv_gomshin_talk.addItemDecoration(
            GomshinTalkDecoration(
                7,
                Color.rgb(247, 247, 247)
            )
        )
        gomshinTalkAdapter =
            GomshinTalkAdapter(
                gomshinTalkItem,
                this.context!!
            )
        loadDatas()
        rv_gomshin_talk.adapter = gomshinTalkAdapter
    }

    private fun setButtonEvent() {
        btn_best.setOnClickListener {
            it.isSelected = true
            btn_recent.isSelected = false
        }
        btn_recent.setOnClickListener {
            it.isSelected = true
            btn_best.isSelected = false
        }
        btn_search.setOnClickListener {  }
        btn_filter.setOnClickListener {  }
    }


    private fun loadDatas() {
        NetworkImpl.network.getBestGunShop().enqueue(object: Callback<BaseResponse<List<GomshinTalkData>>> {
            override fun onFailure(call: Call<BaseResponse<List<GomshinTalkData>>>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(
                call: Call<BaseResponse<List<GomshinTalkData>>>,
                response: Response<BaseResponse<List<GomshinTalkData>>>
            ) {
                if (response.isSuccessful) {
                    gomshinTalkAdapter.datas = response.body()?.data!!
                    gomshinTalkAdapter.notifyDataSetChanged()
                }
            }

        })
    }

}
