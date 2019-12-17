package com.mahipal.mvvmdemo.network.apiService

import com.mahipal.mvvmdemo.mvvm.model.BlogResponse
import retrofit2.Call
import retrofit2.http.GET

interface BlogApiService {

    @GET("feed.json")
    fun getBlogDetails() : Call<BlogResponse>
}