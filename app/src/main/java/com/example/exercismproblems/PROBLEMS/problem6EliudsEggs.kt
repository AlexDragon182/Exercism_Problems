package com.example.exercismproblems.PROBLEMS

object EliudsEggs {

    fun eggCount(number: Int): Int{
        val charToCount = '1'
        val binaryString = number.toString(2)
        val count = binaryString.count { it == charToCount }

        return count
    }

    fun eggCount2(number: Int): Int {
        return number.countOneBits()
    }
    fun eggCount3(number: Int): Int {
        var count = 0
        var remainder = number
        while (remainder > 0) {
            if (remainder % 2 == 1) { // Check if the last bit is 1
                count++
            }
            remainder /= 2 // Right shift (integer division by 2)
        }
        return count
    }


    fun eggCount4(number: Int): Int{
        return Integer.bitCount(number)
    }

}