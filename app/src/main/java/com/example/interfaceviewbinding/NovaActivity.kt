package com.example.interfaceviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.interfaceviewbinding.databinding.ActivityNovaBinding
import com.example.interfaceviewbinding.databinding.ActivityToolbarActionbarBinding

class NovaActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityNovaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarToolbar()
    }

    private fun inicializarToolbar() {
        binding.includeToolbar.clLogo.visibility = View.GONE
        binding.includeToolbar.tbPrincipal.title = "Upload de Video"
        setSupportActionBar(binding.includeToolbar.tbPrincipal)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}