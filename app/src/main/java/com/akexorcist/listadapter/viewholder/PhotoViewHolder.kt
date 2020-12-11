package com.akexorcist.listadapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.akexorcist.listadapter.databinding.ViewPhotoPostBinding
import com.akexorcist.listadapter.model.PhotoPost
import com.bumptech.glide.Glide

class PhotoViewHolder(private val binding: ViewPhotoPostBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(post: PhotoPost) {
        binding.tvText.text = post.text
        binding.tvTimestamp.text = post.timestamp
        Glide.with(itemView.context)
            .load(post.url)
            .into(binding.ivPhoto)
    }
}
