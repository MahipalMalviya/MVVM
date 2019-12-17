package com.mahipal.mvvmdemo.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mahipal.mvvmdemo.R
import com.mahipal.mvvmdemo.mvvm.viewModel.BlogViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application)
            .create(BlogViewModel::class.java)

        viewModel.getAllBlogDetails()?.observe(this, Observer { blogList ->
            rv_blog_details.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
            val adapter = BlogDetailsAdapter(blogList)
            rv_blog_details.adapter = adapter
        })
    }
}
