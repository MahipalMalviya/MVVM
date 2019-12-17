package com.mahipal.mvvmdemo.mvvm.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.mahipal.mvvmdemo.mvvm.model.Blog
import com.mahipal.mvvmdemo.repository.BlogRepository

class BlogViewModel(application: Application) : AndroidViewModel(application) {

    private var blogRepository: BlogRepository? = null

    init {
        blogRepository = BlogRepository()
    }

    fun getAllBlogDetails() : LiveData<List<Blog>>? {
        return blogRepository?.getBlogMutableLiveData()
    }
}