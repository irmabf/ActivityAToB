package com.example.irmablanco.activityatob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        button.setOnClickListener{
            //Vamos a la actividad b con datos
            //Llamos al metodo del companion object de BActivity intent que nos
            //Falicita la llamada a BActivity
            //Pasamos los datos al intent
            val intent = BActivity.intent(
                    this,
                    42,
                    "La respuesta es esta"
            )
            //Llamamos a startActivity pasando el intent
            startActivity(intent)
            //📌Ahora queda acceder a los datos desde la actividad b
        }
    }
}
