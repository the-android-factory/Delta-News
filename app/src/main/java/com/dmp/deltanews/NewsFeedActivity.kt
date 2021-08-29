package com.dmp.deltanews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dmp.deltanews.databinding.ActivityNewsFeedBinding

class NewsFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityNewsFeedBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_news_feed)

        val viewModel: NewsFeedViewModel = ViewModelProvider(this)[NewsFeedViewModel::class.java]

        binding.lifecycleOwner = this

        binding.viewModel = viewModel

//        binding.textOnScreen = "Hello!"
//
//        binding.textView.postDelayed({
//            binding.textOnScreen = "Hello, again!"
//        }, 2_000)
    }
}