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
        val calcular = Calcular()

        var resultado : Float?
        resultado = 0f

        when (v?.id) {
            R.id.btSoma -> resultado = calcular.Somar(edValor1.text.toString().toFloat() , edValor2.text.toString().toFloat())
            R.id.btSubtrai -> resultado = calcular.Subtrair(edValor1.text.toString().toFloat() , edValor2.text.toString().toFloat())
            R.id.btMultiplica -> resultado = calcular.Multiplicar(edValor1.text.toString().toFloat() , edValor2.text.toString().toFloat())
            R.id.btDivide -> resultado = calcular.Dividir(edValor1.text.toString().toFloat() , edValor2.text.toString().toFloat())
        }

        edResultado.setText(resultado.toString())
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