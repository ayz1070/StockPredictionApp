package com.example.stockpredictionproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stockpredictionproject.adapter.BookmarkAdapter
import com.example.stockpredictionproject.databinding.FragmentBookmarkBinding
import com.example.stockpredictionproject.model.Stock


class BookmarkFragment : Fragment() {
    // 일단 문자열로
    val stocks:MutableList<Stock> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBookmarkBinding = FragmentBookmarkBinding.inflate(inflater, container, false)

        stocks.add(Stock("애플"))
        stocks.add(Stock("삼성전자"))

        // Inflate the layout for this fragment
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = BookmarkAdapter(stocks)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(context,LinearLayoutManager.VERTICAL))
        return binding.root
    }

    companion object {

    }
}