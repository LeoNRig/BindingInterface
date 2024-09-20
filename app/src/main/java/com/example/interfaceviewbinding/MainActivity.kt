package com.example.interfaceviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.interfaceviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var btnClique: Button
//    private lateinit var binding: ActivityMainBinding
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        fun clique(){
//
//        }

//        binding.btnClique.setOnClickListener {
//
//        }
//
//        binding.btnExecutar.setOnClickListener {
//
//        }
        with(binding){
            btnClique?.setOnClickListener{

            }
            btnExecutar?.setOnClickListener {

            }
        }

    }
}