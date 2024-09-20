package com.example.interfaceviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.interfaceviewbinding.databinding.ActivityFloatingActionButtonBinding

class FloatingActionButtonActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityFloatingActionButtonBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)

        with(binding){
            fabAdd.setOnClickListener{

                groupMenu.visibility = if(groupMenu.isVisible){
                     View.INVISIBLE
                }else{
                    View.VISIBLE
                }

            }
        }

    }
}