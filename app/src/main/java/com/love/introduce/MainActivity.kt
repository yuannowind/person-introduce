package com.love.introduce

import android.app.Activity
import com.love.introduce.MyAdapter
import android.os.Bundle
import com.love.introduce.R
import com.love.introduce.ItemRemovedListener
import com.love.introduce.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : Activity() {
    private var mAdapter: MyAdapter? = null
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initList()
        initBackground()
    }

    private fun initList() {

        val list: MutableList<Person> =
            mutableListOf(
                Person("张琳昊", "山西大学", "1", "山西平遥", "健身", "改变就是好事", R.mipmap.zlh, 2),
                Person("米浩", "武汉理工大学", "1", "山西太原", "端游（FPS、RPG）、主机游戏、ACG", "灵活敏捷的思维远比埋头苦干更为重要", R.mipmap.mh, 2),
                Person("应卓恒", "浙江工业大学", "1", "浙江台州", "养猫，打游戏", "当下比过去和未来更重要", R.mipmap.yzh, 2),
                Person("严振鹏", "杭州电子科技大学", "1", "浙江金华", "乒乓球，steam游戏", "任何一种能力都是一笔财富", R.mipmap.yzp, 2),
                Person("祝文涛", "中国石油大学(华东)", "1", "江西上饶", "打游戏(主机游戏,吃鸡,英雄联盟都会玩一点)", "随遇而安", R.mipmap.zwt, 2),
                Person("朱兴涌", "杭州电子科技大学", "1", "江西赣州", "手游：王者荣耀、和平精英", "在实践中不断成就和锻炼自我的价值", R.mipmap.zxy, 2),
                Person("李庚华", "浙江工业大学", "1", "陕西渭南", "主流手游皆有涉猎", "快快乐乐大家都快乐", R.mipmap.lgh, 2),
                Person("徐肖剑", "武汉理工大学", "2", "江西九江", "下棋（云顶之弈），打台球", "梦想不是梦和想", R.mipmap.xxj, 2),
                Person("王杰辉", "杭州电子科技大学", "2", "四川自贡", "羽毛球、爬山、红色警戒", "stay hungry, stay foolish", R.mipmap.wjh, 2),
                Person("秦帅帅", "太原理工大学", "3", "山西", "跑步，踢足球", "与其临渊羡鱼，不如退而结网。", R.mipmap.qss, 2),
                Person("张韬", "南京邮电大学", "3", "四川达州", "旅游、跑路、打游戏", "to be or not to be, that's the question!", R.mipmap.zt, 2),
                Person("李鑫涛", "浙江工业大学", "4", "浙江湖州", "阅读、主机游戏、钓鱼", "嘛钱不钱的，乐呵乐呵得了", R.mipmap.lxt, 2),
                Person("","","","","","",0,1)
            )
        val list1: MutableList<Person> = ArrayList()
        binding.recyclerView.apply {
            layoutManager = SwipeCardLayoutManager()
            mAdapter = MyAdapter(this@MainActivity, list)
            adapter = mAdapter
            setRemovedListener(object : ItemRemovedListener {
                override fun onRightRemoved() {
                    //ignore
                }

                override fun onLeftRemoved() {
                    //ignore
                }
            })
        }
    }

    private fun initBackground() {
//        Glide.with(this)
//                .load(R.mipmap.job)
//                .into(binding.imgBackground);
    }
}