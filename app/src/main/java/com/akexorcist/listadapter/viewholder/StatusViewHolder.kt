package com.akexorcist.listadapter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.akexorcist.listadapter.model.StatusPost
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.view_status_post.*

class StatusViewHolder(override val containerView: View?) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bind(post: StatusPost) {
        tvText.text = post.text
        tvTimestamp.text = post.timestamp
    }
}