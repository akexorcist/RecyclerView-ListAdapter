package com.akexorcist.listadapter.model

import com.akexorcist.listadapter.constant.PostType

class PhotoPost(
    override val id: String,
    var text: String,
    var timestamp: String,
    var url: String
) : Post(id, PostType.PHOTO)
