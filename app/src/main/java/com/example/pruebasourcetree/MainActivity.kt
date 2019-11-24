package com.example.pruebasourcetree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Prueba("HOLA MUNDO")


    }

    fun Prueba(mensaje:String){

        Toast.makeText(this,"Prueba $mensaje",Toast.LENGTH_LONG).show()

    }
}
