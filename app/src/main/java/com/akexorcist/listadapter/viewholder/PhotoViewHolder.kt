package com.akexorcist.listadapter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.akexorcist.listadapter.model.PhotoPost
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.view_photo_post.*

class PhotoViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bind(post: PhotoPost) {
        tvText.text = post.text
        tvTimestamp.text = post.timestamp
        Glide.with(containerView.context).load(post.url).into(ivPhoto)
    }
}