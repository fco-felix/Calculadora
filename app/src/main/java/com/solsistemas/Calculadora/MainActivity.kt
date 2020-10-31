package com.solsistemas.Calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        if (! validarValor(edValor1) || ! validarValor(edValor2))
            return

        Toast.makeText(applicationContext, "Passou no teste", Toast.LENGTH_LONG).show()
    }

    fun validarValor(edit : EditText) : Boolean {
        if ( edit.getText().isEmpty() ) {
            edit.requestFocus()
            Toast.makeText(applicationContext, "Verificar "+edit.contentDescription, Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }
}