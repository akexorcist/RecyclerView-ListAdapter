package com.akexorcist.listadapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.akexorcist.listadapter.databinding.ViewStatusPostBinding
import com.akexorcist.listadapter.model.StatusPost

class StatusViewHolder(private val binding: ViewStatusPostBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(post: StatusPost) {
        binding.tvText.text = post.text
        binding.tvTimestamp.text = post.timestamp
    }
}
