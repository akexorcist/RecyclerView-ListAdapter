package com.akexorcist.listadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akexorcist.listadapter.adapter.ContentAdapter
import com.akexorcist.listadapter.databinding.ActivityMainBinding
import com.akexorcist.listadapter.model.PostGenerator


class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var adapter: ContentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        adapter = ContentAdapter()
        adapter.submitList(PostGenerator.get())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.btnRefresh.setOnClickListener {
            adapter.submitList(PostGenerator.get())
        }
    }
}
