package com.akexorcist.listadapter.model

import com.akexorcist.listadapter.constant.PostType

class PhotoPost(override var id: String, override var text: String, override var timestamp: String, var url: String) : Post(id, text, timestamp, PostType.PHOTO)