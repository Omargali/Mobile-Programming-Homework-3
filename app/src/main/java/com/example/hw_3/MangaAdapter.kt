package com.example.hw_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MangaAdapter(private val mangaList: ArrayList<Manga>) : RecyclerView.Adapter<MangaAdapter.FoodViewHolder>() {

    override fun getItemCount() = mangaList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.manga_item,
            parent, false
        )
        return FoodViewHolder(viewLayout)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = mangaList[position]
        holder.mangaImage.setImageResource(currentFood.mangaImage)
        holder.mangaName.text = currentFood.mangaName
        holder.mangaDescriptor.text = currentFood.mangaDescriptor
    }

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mangaImage: ImageView = itemView.findViewById(R.id.iv_manga)
        val mangaName: TextView = itemView.findViewById(R.id.tv_manga_text)
        val mangaDescriptor: TextView = itemView.findViewById(R.id.tv_manga_description)
    }
}




