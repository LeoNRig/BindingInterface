package com.example.interfaceviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.example.interfaceviewbinding.databinding.ActivityFormularioBinding
import com.google.android.material.snackbar.Snackbar

class FormularioActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityFormularioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        spinnerExibicao()
        with(binding){
            btnEnviar.setOnClickListener{view ->
                //checkbox()
//                radioButton()
//                exibirSnackbar(view)
//                Toast.makeText(, "", Toast.LENGTH_SHORT).show()
//                caixaAlertaDialog()
                spinnerSelecionadoItem()

            }
//            rbMasculino.setOnClickListener {  }
//            rbMasculino .setOnCheckedChangeListener{buttonView, isChecked ->
//
//            }

//            cbConfirmacao.setOnCheckedChangeListener { _, isChecked ->
//                val resultado = if( isChecked ) "Sim" else "Não"
//                binding.textResultado.text  = "valor selecionado: $resultado"
//            }

//            cbConfirmacao.setOnClickListener {
//                val selecionado = cbConfirmacao.isChecked
//                val resultado = if( selecionado ) "Sim" else "Não"
//                binding.textResultado.text  = "valor selecionado: $resultado"
//            }

        }

    }

    private fun spinnerSelecionadoItem() {

       val itemSelected = binding.spinCategoria.selectedItem
       val itemPosicion = binding.spinCategoria.selectedItemPosition

        if (itemPosicion == 0){
            binding.textResultado.text = "Selecione um item"
        }else{
            binding.textResultado.text = "Selecionado: $itemSelected / pos: $itemPosicion"
        }

    }

    private fun spinnerExibicao() {



//        val categorias = listOf(
//            "Slecione um item:",
//            "Eletrônica", "Roupas", "Móveis"
//        )
//        val categorias = resources.getStringArray(
//            R.array.categorias
//        )
//
        binding.spinCategoria.adapter = ArrayAdapter.createFromResource(
            this,
            R.array.categorias,
            android.R.layout.simple_spinner_dropdown_item
        )

//        binding.spinCategoria.onItemSelectedListener = object: OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long) {
////                 val itemSelecionado = parent?.getItemAtPosition(position)
//                 val itemSelecionado = parent?.selectedItem
//                binding.textResultado.text = itemSelecionado.toString()
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//
//            }
//
//        }

    }

    private fun caixaAlertaDialog() {

        AlertDialog.Builder(this)
            .setTitle("Confirmar exclusão do item")
            .setMessage("Tem certeza que quer excluir?")
            .setPositiveButton("Remover"){_, posicao ->
            Toast.makeText(this, "Item Removido $posicao", Toast.LENGTH_SHORT).show()
        }
            .setNegativeButton("Cancelar"){_, posicao ->
            Toast.makeText(this, "$posicao", Toast.LENGTH_SHORT).show()
//           dialog.dismiss()
        }
            .setCancelable(true)
            .create()
            .show()

//        val alertbuild = AlertDialog.Builder(this)
//        alertbuild.setTitle("Confirmar exclusão do item")
//        alertbuild.setMessage("Tem certeza que quer excluir?")
//
//        alertbuild.setNegativeButton("Cancelar"){_, posicao ->
//            Toast.makeText(this, "$posicao", Toast.LENGTH_SHORT).show()
////            dialog.dismiss()
//        }
//        alertbuild.setPositiveButton("Remover"){_, posicao ->
//            Toast.makeText(this, "Item Removido $posicao", Toast.LENGTH_SHORT).show()
//        }
//        alertbuild.setCancelable(false)
//        alertbuild.setNeutralButton("ajuda"){_, posicao ->
//            Toast.makeText(this, "Ajuda $posicao", Toast.LENGTH_SHORT).show()
//        }
//        alertbuild.setIcon(R.drawable.ic_alert_24)
//
//        val AlertDialog = alertbuild.create()
//        AlertDialog.show()

    }

    private fun exibirSnackbar(view: View) {
//        Toast.makeText(this, "Mensagem", Toast.LENGTH_SHORT).show()
        val snackbar = Snackbar.make(
            view,
            "Ola Usuário",
            Snackbar.LENGTH_LONG
        )
        snackbar.setAction("Desfazer"){
            Toast.makeText(this, "Desfeito", Toast.LENGTH_SHORT).show()
        }
//        snackbar.setTextColor(
//            ContextCompat.getColor(
//                this,
//                R.color.black
//            )
//        )
//        snackbar.setActionTextColor(
//            ContextCompat.getColor(
//                this,
//                android.R.color.holo_red_light
//            )
//        )
//        snackbar.setBackgroundTint(
//            ContextCompat.getColor(
//                this,
//                android.R.color.background_light
//            )
//        )

        snackbar.show()
    }

    private fun radioButton() {
        val selecionadoMasculino = binding.rbMasculino.isChecked
//        binding.textResultado.text = if(selecionadoMasculino) "Masculino" else "Feminino"

//        binding.rgSexo.clearCheck()
        val idItemSelecionado = binding.rgSexo.checkedRadioButtonId
        binding.textResultado.text = when(idItemSelecionado){
            R.id.rbMasculino -> "Masculino"
            R.id.rbFeminino -> "Feminino"
            else -> "Nada Selecionado"
        }

//        if (selecionadoMasculino){
//            binding.textResultado.text = "valor selecionado: $selecionadoMasculino"
//        }else if(binding.rbFeminino.isChecked){
//            binding.textResultado.text = "valor selecionado: "
//        }else{
//
//        }

    }

    private fun checkbox() {
        val selecionado = binding.cbConfirmacao.isChecked
        val resultado = if( selecionado ) "Sim" else "Não"
        binding.textResultado.text  = "valor selecionado: $resultado"
    }
}