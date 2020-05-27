package org.sopt.cldi

import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import kotlinx.android.synthetic.main.gomshin_talk_item.*

/**
 * A simple [Fragment] subclass.
 */
class GomshinTalkFlagment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gomshin_talk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val drawable: GradientDrawable = context?.getDrawable(R.drawable.background_rounding) as GradientDrawable
        img_content_image.background = drawable
        img_content_image.clipToOutline = true
    }

}
