package org.sopt.cldi

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_gomshin_talk.*
import kotlinx.android.synthetic.main.gomshin_talk_item.*

/**
 * A simple [Fragment] subclass.
 */
class GomshinTalkFlagment : Fragment() {

    private var data =  mutableListOf<Data>()

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

        rv_gomshinTalk.addItemDecoration(GomshinTalkDecoration(7, Color.rgb(247, 247, 247)))
        setAdapter(data)
    }

    //어뎁터 연결 함수
    private fun setAdapter(gomshinTalkItem : MutableList<Data>) {
        gomshinTalkAdapter = GomshinTalkAdapter(gomshinTalkItem,this.context!!)
        loadDatas()
        rv_gomshinTalk.adapter = gomshinTalkAdapter
    }


    private fun loadDatas() {
        data.apply {
            add(
                Data(
                    num = 1,
                    title = "곰신톡 1번",
                    level = "Lv.21",
                    nick = "adfadf",
                    like = 210,
                    comment = 528,
                    time = "8시간전",
                    image = null,
                    category = "편지보내기",
                    rank = "해군 일병"
                )
            )
            add(
                Data(
                    num = 2,
                    title = "곰신톡 2번(이미지 존재)",
                    level = "Lv.23",
                    nick = "adfadf",
                    like = 210,
                    comment = 528,
                    time = "2시간전",
                    image = "https://avatars3.githubusercontent.com/u/45380072?s=460&u=b9fc82996ec2cc568a7dfcbf8846944dc16a7ccd&v=4",
                    category = "곰신미니톡",
                    rank = "공군 이등병"

                )
            )
            add(
                Data(
                    num = 3,
                    title = "곰신톡3번(이미지 없음)",
                    level = "Lv.22",
                    nick = "adfadf",
                    like = 210,
                    comment = 528,
                    time = "6시간전",
                    image = null,
                    category = "연애상담",
                    rank = "해병대 병장"
                )
            )
            add(
                Data(
                    num = 4,
                    title = "군계급 매칭 완료",
                    level = "Lv.22",
                    nick = "의경가고싶다",
                    like = 210,
                    comment = 528,
                    time = "6시간전",
                    image = "https://post-phinf.pstatic.net/MjAxNzAyMTlfODkg/MDAxNDg3NDkyNzA2NDk5.-8EvZjoO90a9veRqOynmW7BwbtiLkQUo4om-5BiYiOMg.4_Wk9yRIBcpeIdPzRCrX9ry0qAEZVt4mSWjQTt-mWJMg.PNG/B0E8B1DEC0E5.png",
                    category = "공동구매",
                    rank = "의경 상경"
                )
            )
            add(
                Data(
                    num = 5,
                    title = "카테고리 변경 적용완료",
                    level = "Lv.22",
                    nick = "육군 병장 이미지 매칭",
                    like = 210,
                    comment = 528,
                    time = "6시간전",
                    image = null,
                    category = "곰신사진첩",
                    rank = "육군병장"
                )
            )
        }
        gomshinTalkAdapter.datas = data
        gomshinTalkAdapter.notifyDataSetChanged()
    }

}
