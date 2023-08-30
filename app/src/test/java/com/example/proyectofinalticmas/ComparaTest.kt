package com.example.proyectofinalticmas

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.ApplicationProvider.*
import androidx.test.platform.app.InstrumentationRegistry
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test


class ComparaTestTest{
    @RelaxedMockK
    private lateinit var application: Application
    private lateinit var vm: MainActivityViewModel
    private lateinit var context: Context;
    @Before
    fun onBefore() {
        MockKAnnotations.init(this)

    }

    @Test
    fun compararPalabrasIguales(){

        val compara= Compara("hola", "hola")

        val resultado= compara.comparar()
        assertEquals("Las cadenas son iguales", resultado)


    }
    @Test
    fun compararPalabrasDiferentes(){

        val compara= Compara("hola", "Adios")

        val resultado= compara.comparar()
        assertEquals("Las cadenas son distintas", resultado)


    }
}