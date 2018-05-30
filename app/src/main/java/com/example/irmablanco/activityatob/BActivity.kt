package com.example.irmablanco.activityatob

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*


class BActivity : AppCompatActivity() {
    //Con el patron del companion object, si una o varias actividades llamn a la actividad b,
    //simplemente tenemo que llamar al intent creado en este companion object
    companion object {
        //keys del diccionario que usaremos para pasar y recoger los valores
        val EXTRA_NUMBER = "EXTRA_NUMBER"
        val EXTRA_STRING = "EXTRA_STRING"

        fun intent(context: Context, number: Int, string: String): Intent{
            //Creamos el intent
            val intent = Intent(context, BActivity::class.java )
            //Pasamos los datos al intent, claves con sus valores
            intent.putExtra(EXTRA_NUMBER, number)
            intent.putExtra(EXTRA_STRING, string)
            //Devolveos el intent preparado para que nos llamen
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        //📌Accedo a los datos de la actividad a
        val number = intent.getIntExtra(EXTRA_NUMBER, 0)
        val string = intent.getStringExtra(EXTRA_STRING)

        result.text = "He recibido esto: ${string}. ${number}"

    }
}
