package com.akexorcist.listadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.akexorcist.listadapter.R
import com.akexorcist.listadapter.constant.PostType
import com.akexorcist.listadapter.databinding.ViewPhotoPostBinding
import com.akexorcist.listadapter.databinding.ViewStatusPostBinding
import com.akexorcist.listadapter.model.PhotoPost
import com.akexorcist.listadapter.model.Post
import com.akexorcist.listadapter.model.StatusPost
import com.akexorcist.listadapter.viewholder.PhotoViewHolder
import com.akexorcist.listadapter.viewholder.StatusViewHolder

class ContentAdapter : ListAdapter<Post, RecyclerView.ViewHolder>(PostDiffCallback()) {
    override fun getItemViewType(position: Int): Int {
        return getItem(position).type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {
        PostType.STATUS -> StatusViewHolder(
            ViewStatusPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
        PostType.PHOTO -> PhotoViewHolder(
            ViewPhotoPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
        else ->
            throw NullPointerException("View holder for type $viewType not found")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is StatusViewHolder -> {
                val statusPost = getItem(position) as StatusPost
                holder.bind(statusPost)
            }
            is PhotoViewHolder -> {
                val photoPost = getItem(position) as PhotoPost
                holder.bind(photoPost)
            }
        }
    }
}
