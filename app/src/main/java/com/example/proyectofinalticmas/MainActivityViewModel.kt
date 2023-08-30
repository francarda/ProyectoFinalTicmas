package com.example.proyectofinalticmas

import android.app.Application
import android.content.Context
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {


    private val context: Context = application.applicationContext
    private var respuesta: String? = null
    private var mtRespuesta: MutableLiveData<String>? = null

    fun getRespuesta(): MutableLiveData<String> {
        if (mtRespuesta == null) {
            mtRespuesta = MutableLiveData()
        }
        return mtRespuesta!!
    }

    fun comparar(primera: String, segunda: String) {

        if (primera.equals("")) {
            Toast.makeText(context, "Debe ingresar un texto en el primer campo", Toast.LENGTH_SHORT)
                .show()
            return
        } else {
            if (segunda.equals("")) {
                Toast.makeText(
                    context,
                    "Debe ingresar un texto en el segundo campo",
                    Toast.LENGTH_SHORT
                ).show()
                return
            } else {

                val compara = Compara(primera, segunda);
                val cadena = compara.comparar()
                mtRespuesta?.value = cadena
                return
            }
        }
    }

}
