package com.akexorcist.listadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.akexorcist.listadapter.adapter.ContentAdapter
import com.akexorcist.listadapter.model.PostGenerator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var adapter: ContentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ContentAdapter()
        adapter.submitList(PostGenerator.get())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        btnRefresh.setOnClickListener {
            adapter.submitList(PostGenerator.get())
        }
    }
}
