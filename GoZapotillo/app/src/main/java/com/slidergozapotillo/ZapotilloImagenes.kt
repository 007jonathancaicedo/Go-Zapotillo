package com.slidergozapotillo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ZapotilloImagenes(val url: String) : Parcelable {

    companion object {
        fun getSunsetPhotos(): Array<ZapotilloImagenes> {
            return arrayOf(ZapotilloImagenes("https://scontent.fgye11-1.fna.fbcdn.net/v/t1.6435-9/56866438_10218565998638602_3148041389644709888_n.jpg?_nc_cat=105&ccb=1-4&_nc_sid=e3f864&_nc_eui2=AeHDh2ZJJ-ZNcII-VZ52vpyVx6yypF3TXS7HrLKkXdNdLt0kZ5K7lZR2ma0IPLewKOc&_nc_ohc=OgPT3UDkmnQAX82wpnb&_nc_ht=scontent.fgye11-1.fna&oh=345a5275538671d381ff84623fc49697&oe=613C0B42"),
                    ZapotilloImagenes("https://lahora.com.ec/contenido/cache/74/el-balneario-el-inca-y-el-avistamiento-de-cocodrilos-opciones-para-todo-feriado-imagen-1-_20200223035215-2000x2000.jpg"),
                    ZapotilloImagenes("https://img.goraymi.com/2018/08/16/716275bedfded91ea9029a050c836595_lg.jpg"),
                    ZapotilloImagenes("https://img.goraymi.com/2018/08/16/e33e6d8c22396a761f7572758691be19_lg.jpg"),
                    ZapotilloImagenes("https://img.goraymi.com/2018/06/21/9e7801e79a65569fc141ee2dbe3cd285_lg.jpg"),
                    ZapotilloImagenes("https://img.goraymi.com/2018/06/21/f94a49abea1ac8d9e48584d2cd1cbe88_lg.jpg"))
        }
    }
}
