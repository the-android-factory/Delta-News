package com.dmp.deltanews

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dmp.deltanews.model.NewsFeedItem

class NewsFeedViewModel : ViewModel() {

    private val repository = NewsFeedRepository()

    private val _newsFeedLiveData = MutableLiveData<List<NewsFeedItem>>()
    val newsFeedLiveData: LiveData<List<NewsFeedItem>> = _newsFeedLiveData

    fun fetchNewsFeed() {
        repository.fetchNewsFeed(_newsFeedLiveData)
    }
}