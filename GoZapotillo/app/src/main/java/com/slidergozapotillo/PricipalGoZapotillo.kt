package com.slidergozapotillo



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import com.login.gozapotillo.R


class PricipalGoZapotillo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_gozapotillo)

        ///codificar el boton no se utilizan variables anteriormente




    }


    fun ZapParroquiaslistas(view: View) {

        var siguieenteparroquiaslista = findViewById<View>(R.id.btnParroquiasLista) as Button
        siguieenteparroquiaslista.setOnClickListener(View.OnClickListener {
            val siguieenteparroquiaslista = Intent(this@PricipalGoZapotillo , MainActivitySlider::class.java)
            startActivity(siguieenteparroquiaslista)
        })



    }



    
    
    
    

}