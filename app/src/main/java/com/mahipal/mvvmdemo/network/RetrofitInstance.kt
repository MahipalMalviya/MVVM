package com.mahipal.mvvmdemo.network

import com.mahipal.mvvmdemo.network.apiService.BlogApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private var retrofit: Retrofit? = null

    fun getInstance() : BlogApiService? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl("https://androidwave.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit?.create(BlogApiService::class.java)
    }
}