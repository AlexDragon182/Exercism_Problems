package com.example.exercismproblems.PROBLEMS

import java.util.Collections.emptyMap

object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        var map: MutableMap<Char,Int> = emptyMap()
        source.forEach { score  ->
            score.value.forEach { letter , ->
                val l = letter.toString().lowercase()
                val character : Char  = l[0]
                map[character] = score.key
            }
        }
        return map.toMap()
    }

    fun transform(data: Map<Int, List<Char>>): Map<Char, Int> {
        var transformedData = mutableMapOf<Char, Int>()
        data.forEach { key, valueList ->
            valueList.forEach { value ->
                transformedData.put(value.toLowerCase(), key)
            }
        }
        return transformedData
    }
}
