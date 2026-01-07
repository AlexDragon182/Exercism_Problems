package com.example.exercismproblems.PROBLEMS

import android.util.Log

val TAG  = "problem2"

fun reverse(input: String): String {
    return input.reversed()
}

fun reverseWithLoop(input: String): String {
    var reversed = ""
    for (i in input.length - 1 downTo 0) {
        reversed += input[i]
    }
    return reversed
}

fun reverseWithForEach(input: String):String{
    var reversed = ""
    input.reversed().forEach { letter ->
        reversed += letter
    }
    Log.d(TAG, reversed)
    return reversed
}