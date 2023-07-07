package com.example.traineegeeks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.traineegeeks.databinding.ItemDetailBinding

class DetailAdapter():Adapter<DetailAdapter.DetailViewHolder> (){
    private  var detailList = ArrayList<String>()

    class DetailViewHolder (val binding: ItemDetailBinding):ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        return DetailViewHolder(ItemDetailBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
return  detailList.size
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
      Glide.with(holder.itemView).load(detailList[position]).into(holder.binding.imgDetail)

    }
}