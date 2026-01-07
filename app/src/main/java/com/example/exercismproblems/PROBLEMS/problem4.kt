package com.example.exercismproblems.PROBLEMS

import android.util.Log

object CollatzCalculator {
    val TAG = "Problema 4"
    fun computeStepCount(start: Int, steps:Int? ): Int {
        var startNumber :Int = start
        Log.d(TAG, startNumber.toString())
        var steps = steps?: 0

        return if (startNumber == 1){
            steps
        }else {
            startNumber = checkIfNumberIsEvenOrOdd(startNumber)
            Log.d(TAG, startNumber.toString())
            steps = sumCounter(steps)
            Log.d(TAG, "pasos"+ steps.toString())
            computeStepCount(startNumber,steps)
        }

    }
    fun checkIfNumberIsEvenOrOdd (startNumber:Int):Int{
        var startNumberInCheck = startNumber
        return if (startNumberInCheck == 1){
            startNumberInCheck
        }else if (startNumberInCheck % 2 == 0){
            startNumberInCheck = startNumberInCheck/2
            startNumberInCheck

        }else if (startNumberInCheck % 2 == 1){
            startNumberInCheck = (startNumberInCheck*3)+1
            startNumberInCheck
        } else {
            startNumberInCheck
        }

    }

    fun sumCounter(steps:Int ):Int{
            return steps + 1
        }
    fun computeStepCountGoogle(start: Int): Int {
        // Validate input: only positive integers are allowed
        require(start > 0) { "Only positive integers are allowed" }

        var current = start
        var steps = 0

        while (current != 1) {
            current = if (current % 2 == 0) {
                current / 2
            } else {
                // Potential for large numbers, consider using 'Long' for very large inputs
                3 * current + 1
            }
            steps++
        }
        Log.d(TAG,"google problem steps" +steps.toString())
        return steps
    }
    fun computeStepoCountExercism(n:Int):Int{
        require(n > 0) { "Only natural numbers are allowed" }
        return computeStepCountE(n, 0)
    }
    private tailrec fun computeStepCountE(n: Int, count: Int): Int =
        when {
            n == 1     -> count
            n.isEven() -> computeStepCount(n / 2, count + 1)
            else       -> computeStepCount(3 * n + 1, count + 1)
        }
    fun Int.isEven() = this % 2 == 0

    }



