package com.example.proyectofinalticmas


import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
    class MainActivityIUTest {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompararButtonClick() {
        val primeraTexto = "Hola"
        val segundaTexto = "Hola Mundo"
        val expectedRespuesta = "Las cadenas son distintas"

        // Ingresa texto en los campos de entrada
        onView(ViewMatchers.withId(R.id.etPrimera))
            .perform(ViewActions.typeText(primeraTexto), ViewActions.closeSoftKeyboard())

        onView(ViewMatchers.withId(R.id.etSegunda))
            .perform(ViewActions.typeText(segundaTexto), ViewActions.closeSoftKeyboard())

        // Presiona el botón de comparar
        onView(ViewMatchers.withId(R.id.btCompara))
            .perform(ViewActions.click())

        // Verifica si el resultado en la vista es el esperado
        onView(ViewMatchers.withId(R.id.tvResultado))
            .check(ViewAssertions.matches(ViewMatchers.withText(expectedRespuesta)))
    }
}