package com.solsistemas.Calculadora

class Calcular  {

    fun Somar(valor1 : Float, valor2 : Float) = valor1 + valor2

    fun Subtrair(valor1 : Float, valor2 : Float) = valor1 - valor2

    fun Multiplicar(valor1 : Float, valor2 : Float) = valor1 * valor2

    fun Dividir(valor1 : Float, valor2 : Float) : Float? {
        if (valor2.equals(0))
            return null
        else
            return valor1 / valor2 }
}