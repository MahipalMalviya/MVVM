package com.mahipal.mvvmdemo.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mahipal.mvvmdemo.mvvm.model.Blog
import com.mahipal.mvvmdemo.mvvm.model.BlogResponse
import com.mahipal.mvvmdemo.network.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BlogRepository {

    private val LOG_TAG = BlogRepository::class.java.simpleName

    private var blogMutableLiveData = MutableLiveData<List<Blog>>()

    fun getBlogMutableLiveData() : LiveData<List<Blog>> {
        val apiCall = RetrofitInstance.getInstance()?.getBlogDetails()

        apiCall?.enqueue(object : Callback<BlogResponse> {
            override fun onFailure(call: Call<BlogResponse>, t: Throwable) {
                Log.e(LOG_TAG,"Api call error $t")
            }

            override fun onResponse(call: Call<BlogResponse>, response: Response<BlogResponse>) {
                val blogResponse = response.body()
                blogResponse?.let {
                    it.data?.let { blogList ->
                        blogMutableLiveData.value = blogList
                    }
                }
            }

        })
        return blogMutableLiveData
    }

}