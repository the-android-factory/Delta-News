package com.dmp.deltanews

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dmp.deltanews.model.NewsFeedItem
import com.dmp.deltanews.newsfeed.NewsFeedRecyclerViewAdapter

// region RecyclerView
@BindingAdapter("setItems")
fun setItems(recyclerView: RecyclerView, list: List<NewsFeedItem>?) {
    (recyclerView.adapter as NewsFeedRecyclerViewAdapter).setItems(list)
}
// endregion RecyclerView