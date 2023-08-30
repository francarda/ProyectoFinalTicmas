package com.example.proyectofinalticmas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.proyectofinalticmas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mv: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mv= ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.btCompara.setOnClickListener{
            mv.comparar(binding.etPrimera.text.toString(),binding.etSegunda.text.toString())
        }
        mv.getRespuesta().observe(this) { repuesta ->
            binding.tvResultado.text = repuesta
        }
    }


}

