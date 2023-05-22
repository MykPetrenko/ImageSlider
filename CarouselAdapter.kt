package com.example.task7


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarouselAdapter(private val imageUrls: List<String>) :
  RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

  inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.carousel_item_layout, parent, false)
    return ViewHolder(view)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val imageUrl = imageUrls[position]
    Picasso.get()
      .load(imageUrl)
      .fit()
      .centerCrop()
      .into(holder.imageView)
  }

  override fun getItemCount(): Int {
    return imageUrls.size
  }
}


