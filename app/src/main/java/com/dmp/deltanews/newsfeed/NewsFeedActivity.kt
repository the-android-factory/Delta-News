package com.dmp.deltanews.newsfeed

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dmp.deltanews.R
import com.dmp.deltanews.databinding.ActivityNewsFeedBinding
import com.dmp.deltanews.detail.DetailActivity
import java.lang.ref.WeakReference

class NewsFeedActivity : AppCompatActivity(), NewsFeedRecyclerViewAdapter.NewsFeedItemInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityNewsFeedBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_news_feed)

        val viewModel: NewsFeedViewModel = ViewModelProvider(this)[NewsFeedViewModel::class.java]

        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        val newsFeedAdapter = NewsFeedRecyclerViewAdapter(WeakReference(this))
        binding.recyclerView.adapter = newsFeedAdapter

        viewModel.fetchNewsFeed()
    }

    override fun onNewsFeedItemClicked(url: String) {
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra(DetailActivity.ARG_URL, url)
        }

        startActivity(intent)
    }
}