package org.sopt.cldi

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GomshinTalkAdapter(var datas: MutableList<Data>, val context: Context) : RecyclerView.Adapter<GomshinTalkViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GomshinTalkViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.gomshin_talk_item,parent,false)
        return GomshinTalkViewHolder(view)
    }

    override fun getItemCount() = datas.size

    override fun onBindViewHolder(holder: GomshinTalkViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}