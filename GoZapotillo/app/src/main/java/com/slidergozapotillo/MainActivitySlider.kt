package com.slidergozapotillo


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

import com.login.gozapotillo.R



class MainActivitySlider : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_slidergozapotillo)
//Variables de llamado a las imagenes
        val imageSlider = findViewById<ImageSlider>(R.id.imageSliderGoZ)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://scontent.fgye11-1.fna.fbcdn.net/v/t1.6435-9/87629823_2995706050440443_3347498927841607680_n.jpg?_nc_cat=103&ccb=1-3&_nc_sid=8bfeb9&_nc_eui2=AeE76xrSwgxz3XaCKraCvy1iZLZSYSMVCApktlJhIxUIClt5P4nt9JAInQ0FoetsPvY&_nc_ohc=8rdHrca7BdcAX9Z-acR&_nc_ht=scontent.fgye11-1.fna&oh=e597a79020c2840f738d9b49b2583cd6&oe=61262F90","EVENTOS"))
        imageList.add(SlideModel("https://scontent.fgye11-1.fna.fbcdn.net/v/t1.18169-9/20476132_10213323352615728_1869820981940694833_n.jpg?_nc_cat=104&ccb=1-3&_nc_sid=8bfeb9&_nc_eui2=AeFxILGok2tyZN0pWBqETt-_EAqDmHkbVlQQCoOYeRtWVNkpQZGRioNtlMGp0yPofW8&_nc_ohc=6rdBqQjIS9sAX_lQ3O_&_nc_ht=scontent.fgye11-1.fna&oh=cb7b6575aa3276e24c58f058a5382157&oe=6127AF91","GASTRONOMIA"))
        imageList.add(SlideModel("https://scontent.fgye11-1.fna.fbcdn.net/v/t1.6435-9/56866438_10218565998638602_3148041389644709888_n.jpg?_nc_cat=105&ccb=1-3&_nc_sid=e3f864&_nc_eui2=AeHDh2ZJJ-ZNcII-VZ52vpyVx6yypF3TXS7HrLKkXdNdLt0kZ5K7lZR2ma0IPLewKOc&_nc_ohc=NYSKfDdO8FsAX-8EliC&_nc_ht=scontent.fgye11-1.fna&oh=ea4fb25d0794ebd261b59939f8efbdb1&oe=612844C2","SITIOS TURISTICOS"))
        imageList.add(SlideModel("https://scontent.fgye11-1.fna.fbcdn.net/v/t1.18169-9/10428085_623021821136385_1908558412868653194_n.png?_nc_cat=106&ccb=1-3&_nc_sid=9267fe&_nc_eui2=AeGGDu5Bq9txx4eSPikksMlFu3XDmsdBqRS7dcOax0GpFH5C51WRhogF0xXn3JMLHQc&_nc_ohc=iBBcI0ApqpMAX-cgw0M&_nc_ht=scontent.fgye11-1.fna&oh=ae65a4d5f04cd430ebeb0f4ad93d6559&oe=61247ECE","HOSPEDAJE"))

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)
//


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val myParroquiasdata: Array<MyParroquiasdata> = arrayOf<MyParroquiasdata>(
            MyParroquiasdata("ZAPOTILLO" , "JQ85+4MW, Zapotillo" , R.drawable.zapprin) ,
            MyParroquiasdata("LIMONES" , "JM72+GRV, Limones" , R.drawable.limones) ,
            MyParroquiasdata("GARZA REAL" , "MQW6+7H Garza Huachana" , R.drawable.garzar) ,
            MyParroquiasdata("PALETILLAS" , "RPPG+5W9, Paletillas" , R.drawable.paletillas) ,
            MyParroquiasdata("BOLASPAMBA" , "RJ7M+W3 Bolaspamba" , R.drawable.bolpamba) ,
            MyParroquiasdata("MANGAHURCO" , "RHV9+PFH, Mangahurco" , R.drawable.mangaprin) ,
            MyParroquiasdata("CAZADEROS" , "WG79+9CG, Cazaderos" , R.drawable.cazaprin)
        )

        val myParroquiaAdapter = MyParroquiaAdapter(myParroquiasdata , this@MainActivitySlider)
        recyclerView.adapter = myParroquiaAdapter


       /* termina lista parroquias*/


    }

    fun IrAZapotillo(view: View) {

        var visitazapotillo = findViewById<View>(R.id.btnIrAZapotillo) as Button
        visitazapotillo.setOnClickListener(View.OnClickListener {
            val visitazapotillo = Intent(this@MainActivitySlider , ActivityGaleriaZap::class.java)
            startActivity(visitazapotillo)
        })



    }


}




