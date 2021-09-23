package com.slidergozapotillo
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.login.gozapotillo.R

import com.squareup.picasso.Picasso


class ZapotilloActivity : AppCompatActivity() {

    companion object {
        const val GaleriaVista = "GaleriaZActivity.GaleriaVista"
    }

    private lateinit var imageView: ImageView
    private lateinit var zapotilloImagenes: ZapotilloImagenes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagenes_zap)

        zapotilloImagenes = intent.getParcelableExtra(GaleriaVista)!!
        imageView = findViewById(R.id.image)
    }

    override fun onStart() {
        super.onStart()
        Picasso.get()
            .load(zapotilloImagenes.url)
            .placeholder(R.drawable.goimagen)
            .error(R.drawable.goerror)
            .fit()
            .priority(Picasso.Priority.HIGH)
            .into(imageView)

        Picasso.get()
            .load(zapotilloImagenes.url)
            .placeholder(R.drawable.goimagen)
            .error(R.drawable.goerror)
            .fit()
            .priority(Picasso.Priority.LOW)
            .into(imageView)

        Picasso.get()
            .load(zapotilloImagenes.url)
            .placeholder(R.drawable.goimagen)
            .error(R.drawable.goerror)
            .fit()
            .priority(Picasso.Priority.NORMAL)
            .into(imageView)

    }


}


