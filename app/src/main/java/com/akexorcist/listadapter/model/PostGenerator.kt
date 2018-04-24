package com.akexorcist.listadapter.model

class PostGenerator {
    private val post1 = PhotoPost("001", "Looking forward to a wonderful time ahead with the love of my life.", "02/01/2018 12:10", "https://images.unsplash.com/photo-1522199710521-72d69614c702?w=668&q=80")
    private val post2 = StatusPost("002", "Waiting eagerly for the winter.", "02/01/2018 12:09")
    private val post3 = PhotoPost("003", "Packed my bags and I am almost ready to go... a new job... a new life.", "02/01/2018 12:00", "https://images.unsplash.com/photo-1490984902283-b7f4723f3955?w=668&q=80")
    private val post4 = StatusPost("004", "Money may not buy us happiness; but if you hand me a million dollars, I would be more than happy to take it.", "02/01/2018 11:55")
    private val post5 = StatusPost("005", "There is no alternative to hard work.", "02/01/2018 11:53")
    private val post6 = PhotoPost("006", "Mistakes are what make us human. If you never trip, you never learn to walk.", "02/01/2018 11:53", "https://images.unsplash.com/photo-1522198763288-96e9f39904af?w=668&q=80")
    private val post7 = StatusPost("007", "Behind every successful and a charming man, there lie a woman who is rolling her eyes to get him.", "02/01/2018 11:51")
    private val post8 = PhotoPost("008", "If one day you manage to have everything, the question is where will you put it?", "02/01/2018 11:48", "https://images.unsplash.com/photo-1502120492606-fba13cc63721?w=668&q=80")
    private val post9 = StatusPost("009", "A kid scored 0 marks in his exam. Dad asked \"what is this?\" Kid replied - teacher was short of starts so she gave me the sun.", "02/01/2018 11:45")
    private val post10 = StatusPost("010", "When you intend to take a sick leave, you are actually sick! When a boss takes sick leaves, he is considered to be very ill.", "02/01/2018 11:40")

    companion object {
        fun get(): List<Post> {
            return PostGenerator().getPostList()
        }
    }

    private fun getPostList() = when ((0..5).shuffled().first()) {
        0 -> getPostList0()
        1 -> getPostList1()
        2 -> getPostList2()
        3 -> getPostList3()
        4 -> getPostList4()
        5 -> getPostList5()
        6 -> getPostList6()
        else -> getPostListAll()
    }

    private fun getPostList0(): List<Post> {
        return mutableListOf(post2, post3, post5, post6, post7, post8, post9)
    }

    private fun getPostList1(): List<Post> {
        return mutableListOf(post1, post3, post5, post6, post7)
    }

    private fun getPostList2(): List<Post> {
        return mutableListOf(post3, post4, post5, post6, post8, post10)
    }

    private fun getPostList3(): List<Post> {
        return mutableListOf(post4, post5, post6, post8, post9)
    }

    private fun getPostList4(): List<Post> {
        return mutableListOf(post1, post2, post6, post7, post10)
    }

    private fun getPostList5(): List<Post> {
        return mutableListOf(post2, post3, post4, post5, post6, post9, post10)
    }

    private fun getPostList6(): List<Post> {
        return mutableListOf(post1, post4, post5, post6, post7, post10)
    }

    private fun getPostListAll(): List<Post> {
        return mutableListOf(post1, post2, post3, post4, post5, post6, post7, post8, post9, post10)
    }
}