package com.example.stockpredictionproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stockpredictionproject.databinding.BookmarkItemBinding
import com.example.stockpredictionproject.model.Stock

class BookmarkViewHolder(val binding:BookmarkItemBinding):RecyclerView.ViewHolder(binding.root){

}
class BookmarkAdapter(val stocks: MutableList<Stock>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var binding:BookmarkItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BookmarkViewHolder(BookmarkItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        binding = (holder as BookmarkViewHolder).binding

    }

    override fun getItemCount(): Int {
        return stocks.size
    }
}