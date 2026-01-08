package com.example.exercismproblems.PROBLEMS

import kotlin.math.hypot
import kotlin.math.sqrt

object Darts {

    fun score(x: Double, y: Double ): Int {
        val sumaCuadrados = (x*x) + (y * y)
        val hipotenusa = sqrt(sumaCuadrados)


        return when {
            hipotenusa >= 10.1  -> 0
            hipotenusa >= 5.0 && hipotenusa <= 10.0 -> 1
            hipotenusa >= 1.0 && hipotenusa <= 4.9  -> 5
            hipotenusa >= 0.0 && hipotenusa <= .9  -> 10
            else -> 10
        }
    }

    fun scoreExercism(x: Number, y: Number): Int {
        val distance = hypot(x.toDouble(), y.toDouble())
        return when {
            distance <= 1.0  -> 10
            distance <= 5.0  -> 5
            distance <= 10.0 -> 1
            else -> 0
        }
    }
}