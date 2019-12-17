package com.mahipal.mvvmdemo.mvvm.view

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mahipal.mvvmdemo.R
import com.mahipal.mvvmdemo.mvvm.model.Blog
import kotlinx.android.synthetic.main.layout_blog_details_item.view.*

class BlogDetailsAdapter(private val list: List<Blog>) : RecyclerView.Adapter<BlogDetailsAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_blog_details_item,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])


    }

    open class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @SuppressLint("SetTextI18n")
        fun bind(blog: Blog) {
            Glide.with(itemView.context)
                .load(blog.thumbnail)
                .into(itemView.iv_blog_photo)

            itemView.tv_blog_title.text = blog.title
            itemView.tv_blog_desc.text = "Desc :- ${blog.description}"

            itemView.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(blog.link))
                itemView.context.startActivity(intent)
            }
        }
    }
}