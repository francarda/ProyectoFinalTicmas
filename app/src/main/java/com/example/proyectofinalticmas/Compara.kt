package com.example.proyectofinalticmas

import android.content.Context
import android.widget.Toast

class Compara {
    private var primera:String
    private  var segunda:String

    constructor(primera: String, segunda: String) {
        this.primera = primera
        this.segunda = segunda
    }
    fun comparar(): String {

        if (primera.equals(segunda)){
           return  "Las cadenas son iguales"
        } else {
            return  "Las cadenas son distintas"
        }
    }
}