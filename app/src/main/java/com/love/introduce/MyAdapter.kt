package com.love.introduce

import android.content.Context
import android.text.TextUtils
import android.util.TypedValue
import android.view.Gravity
import com.love.introduce.MyAdapter.MyHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import com.love.introduce.R
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.love.introduce.databinding.SelfBinding

/**
 * Created by xingzhu on 2016/11/15.
 */
class MyAdapter(private val mContext: Context, list: List<Person?>?) :
    SwipeCardAdapter<MyHolder?>(list) {
    private lateinit var binding: SelfBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.self, parent, false)
        binding = SelfBinding.bind(view)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.setData(mList[position] as Person);
    }

    inner class MyHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    ) {
        fun setData(person: Person) {
            binding.apply {
                if (person.type == 1) {
                    imgMain.setImageResource(R.mipmap.splash)
                } else {
                    name.text = person.name
                    school.text = person.school
                    var titleText = ""
                    when (person.department) {
                        "1" -> {
                            department.text = "B2B开发部移动端安卓开发"
                            imgIcon.setImageResource(R.mipmap.android)
                            titleText = "安卓开发"
                        }
                        "2" -> {
                            department.text = "B2B开发部移动端IOS开发"
                            imgIcon.setImageResource(R.mipmap.ios)
                            titleText = "IOS开发"
                        }
                        "3" -> {
                            department.text = "B2B开发部移动端中台后端开发"
                            imgIcon.setImageResource(R.mipmap.zhongtai)
                            titleText = "中台后端开发"
                        }
                        "4" -> {
                            department.text = "B2B开发部移动端中台前端开发"
                            imgIcon.setImageResource(R.mipmap.h5)
                            titleText = "前端开发"
                        }
                    }

                    vfTitle.apply {
                        stopFlipping()
                        removeAllViews()
                        addView(
                            createTextView(resources.getString(R.string.introduce)),
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )
                        addView(
                            createTextView(titleText),
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )
                        resetAnimation()
                        startFlipping()
                    }
                    home.text = person.home
                    hobby.text = person.hobby
                    tvInfo.text = person.info
                    Glide.with(mContext)
                        .load(person.photo)
                        .circleCrop()
                        .into(imgAvatar)
                }
//            name.setText(person.name);
//            school.setText(person.school);
//            department.setText(person.department);
//            home.setText(person.home);
//            hobby.setText(person.hobby);
            }
        }

        private fun createTextView(text: String): View {
            return TextView(mContext).apply {
                this.text = text
                setTextColor(resources.getColor(R.color.black))
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
                setLines(1)
                gravity = Gravity.CENTER
                ellipsize = TextUtils.TruncateAt.END
            }
        }

        private fun resetAnimation() {
            val annimIn = AnimationUtils.loadAnimation(mContext, R.anim.slide_up_in)
            annimIn.duration = 500
            binding.vfTitle.inAnimation = annimIn
            val annimOut = AnimationUtils.loadAnimation(mContext, R.anim.slide_up_out)
            annimOut.duration = 500
            binding.vfTitle.outAnimation = annimOut
        }
    }
}