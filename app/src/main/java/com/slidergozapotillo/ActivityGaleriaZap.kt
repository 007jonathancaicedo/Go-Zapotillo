package com.slidergozapotillo

import android.content.Context
import android.content.Intent
import android.os.Bundle


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.login.gozapotillo.R

import com.squareup.picasso.Picasso

class ActivityGaleriaZap : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageGalleryAdapter: ImageGalleryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_zapotillo)

        val layoutManager = GridLayoutManager(this, 2)
        recyclerView = findViewById(R.id.rv_images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager
        imageGalleryAdapter = ImageGalleryAdapter(this, ZapotilloImagenes.getSunsetPhotos())
    }

    override fun onStart() {
        super.onStart()
        recyclerView.adapter = imageGalleryAdapter
    }

    private inner class ImageGalleryAdapter(val context: Context, val zapotilloImagenes: Array<ZapotilloImagenes>)
        : RecyclerView.Adapter<ImageGalleryAdapter.MyViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageGalleryAdapter.MyViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            val photoView = inflater.inflate(R.layout.activiti_galeria_zap, parent, false)
            return MyViewHolder(photoView)
        }

        override fun onBindViewHolder(holder: ImageGalleryAdapter.MyViewHolder, position: Int) {
            val sunsetPhoto = zapotilloImagenes[position]
            val imageView = holder.photoImageView

            Picasso.get()
                    .load(sunsetPhoto.url)
                    .placeholder(R.drawable.goimagen)
                    .error(R.drawable.goerror)
                    .fit()
                    .tag(context)
                    .into(imageView)

        }

        override fun getItemCount(): Int {
            return zapotilloImagenes.size
        }

        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

            var photoImageView: ImageView = itemView.findViewById(R.id.iv_photo)

            init {
                itemView.setOnClickListener(this)
            }

            override fun onClick(view: View) {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val sunsetPhoto = zapotilloImagenes[position]
                    val intent = Intent(context, ZapotilloActivity::class.java).apply {
                        putExtra(ZapotilloActivity.GaleriaVista, sunsetPhoto)
                    }
                    startActivity(intent)
                }
            }
        }
    }
}
