package com.example.interfaceviewbinding

import android.app.Notification.Action
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.MenuProvider
import com.example.interfaceviewbinding.databinding.ActivityToolbarActionbarBinding

class ToolbarActionbarActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityToolbarActionbarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        supportActionBar?.hide()
//        inicializarActionBar()

        inicializarToolBar()

    }

    private fun inicializarToolBar() {

        binding.btnAbrirNova.setOnClickListener {
            startActivity(Intent(this, NovaActivity::class.java))
        }

        binding.includeToolbar.tbPrincipal.title = "Youtube"
        binding.includeToolbar.tbPrincipal.setTitleTextColor(
            ContextCompat.getColor(this, R.color.white)
        )

//        binding.tbPrincipal.inflateMenu(R.menu.menu_principal)
//        binding.tbPrincipal.setOnMenuItemClickListener{menuItem ->
//            when(menuItem.itemId){
//                R.id.item_adicionar -> {
//                    Toast.makeText(applicationContext, "Adicionado", Toast.LENGTH_SHORT).show()
//                    return@setOnMenuItemClickListener true
//                }
//                R.id.item_config ->{
//                    Toast.makeText(applicationContext, "Configurando", Toast.LENGTH_SHORT).show()
//                    return@setOnMenuItemClickListener true
//                }
//                R.id.item_pesquisar ->{
//                    Toast.makeText(applicationContext, "Pesquisando", Toast.LENGTH_SHORT).show()
//                    return@setOnMenuItemClickListener true
//                }
//                R.id.item_sair ->{
//                    Toast.makeText(applicationContext, "Saindo", Toast.LENGTH_SHORT).show()
//                    return@setOnMenuItemClickListener true
//                }else -> {
//                return@setOnMenuItemClickListener true
//                }
//            }
//
//        }
//        binding.tbPrincipal.subtitle = "Mais detalhes"

        setSupportActionBar(binding.includeToolbar.tbPrincipal)
        inicializarActionBar()
    }

    private fun inicializarActionBar() {
        addMenuProvider(
            object: MenuProvider {
                override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                    menuInflater.inflate(R.menu.menu_principal, menu)
                }

                override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                    when(menuItem.itemId){
                        R.id.item_adicionar -> {
                            Toast.makeText(applicationContext, "Adicionado", Toast.LENGTH_SHORT).show()
                        }
                        R.id.item_config ->{
                            Toast.makeText(applicationContext, "Configurando", Toast.LENGTH_SHORT).show()
                        }
                        R.id.item_pesquisar ->{
                            Toast.makeText(applicationContext, "Pesquisando", Toast.LENGTH_SHORT).show()
                        }
                        R.id.item_sair ->{
                            Toast.makeText(applicationContext, "Saindo", Toast.LENGTH_SHORT).show()
                        }
                    }

                    return true
                }

            }
        )
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_principal, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//
//        when(item.itemId){
//            R.id.item_adicionar -> {
//                Toast.makeText(this, "Adicionado", Toast.LENGTH_SHORT).show()
//            }
//            R.id.item_config ->{
//                Toast.makeText(this, "Configurando", Toast.LENGTH_SHORT).show()
//            }
//            R.id.item_pesquisar ->{
//                Toast.makeText(this, "Pesquisando", Toast.LENGTH_SHORT).show()
//            }
//            R.id.item_sair ->{
//                Toast.makeText(this, "Saindo", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        return true
//    }
}