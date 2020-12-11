package com.akexorcist.listadapter.model

import com.akexorcist.listadapter.constant.PostType

data class StatusPost(
    override val id: String,
    val text: String,
    val timestamp: String
) : Post(id, PostType.STATUS)
