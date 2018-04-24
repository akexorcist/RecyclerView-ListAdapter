package com.akexorcist.listadapter.model

import com.akexorcist.listadapter.constant.PostType

class StatusPost(id: String, text: String, timestamp: String) : Post(id, text, timestamp, PostType.STATUS) {

}