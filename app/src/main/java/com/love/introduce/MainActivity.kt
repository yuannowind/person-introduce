package com.love.introduce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.love.introduce.R
import com.love.introduce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btStartanim.setOnClickListener {
            binding.patv.startTextAnim()
            binding.patv2.startTextAnim()
            binding.patv3.startTextAnim()
        }
        binding.apply {
            Glide.with(this@MainActivity)
                .load(R.mipmap.empty_address)
                .into(this.imgGif)
        }
    }
}