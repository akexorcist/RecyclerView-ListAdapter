package com.akexorcist.listadapter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.view_status_post.*

class PostViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    var text: CharSequence
        get() = tvText.text
        set(text) {
            tvText.text = text
        }

    var job: CharSequence
        get() = tvTimestamp.text
        set(job) {
            tvTimestamp.text = job
        }
}