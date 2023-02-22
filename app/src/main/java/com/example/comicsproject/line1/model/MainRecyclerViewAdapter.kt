package com.example.comicsproject.line1.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comicsproject.R
import com.example.comicsproject.line1.bean.RecyclerViewCell

class MainRecyclerViewAdapter(var itemList:List<RecyclerViewCell>): RecyclerView.Adapter<MainRecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.main_recyclerview_cell,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load(itemList.get(position).imgSrc)
            .placeholder(R.drawable.cell_placeholder_gray)
            .into(holder.imageView)
        itemList.get(position).itemTitle.let {
            holder.textView.text = if(it.equals("")) "获取失败" else it
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val imageView=itemView.findViewById<ImageView>(R.id.imageView)
        val textView=itemView.findViewById<TextView>(R.id.textView)
    }
}