package com.example.exercismproblems.PROBLEMS

object Bob {
    fun hey(input: String): String {
        val frase  = input.trimEnd()
        val upperFrase = frase.uppercase()
        var equal: Boolean = false

        if (frase.any(Char::isLetter)){
            if(frase == upperFrase){
                equal = true
            }
        }


        if (equal == true && frase.endsWith('?')) {
            return "Calm down, I know what I'm doing!"
        } else if (frase.endsWith('?') ){
            return "Sure."
        }else if(equal == true) {
            return "Whoa, chill out!"
        }else if (frase.isBlank()){
            return "Fine. Be that way!"
        }else {
            return "Whatever."
        }
    }
}