package com.love.introduce.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.love.introduce.R
import com.love.introduce.databinding.ViewItemBinding
import com.love.introduce.view.recyclerview.SwipeCardAdapter


class SwAdapter(context: Context, list: List<String?>?) :
    SwipeCardAdapter<SwAdapter.SwHolder?>(list) {
    private val mContext: Context
    private lateinit var binding: ViewItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwHolder {
        val view: View = LayoutInflater.from(mContext)
            .inflate(R.layout.view_item, parent, false)
        binding = ViewItemBinding.bind(view)
        return SwHolder(view)
    }

    override fun onBindViewHolder(holder: SwHolder, position: Int) {
        holder.setData(mList[position] as String?)
    }

    inner class SwHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(text: String?) {
            binding.apply {
                // TODO:
            }
        }

    }

    init {
        mContext = context
    }
}