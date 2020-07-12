package com.laewoong.jang.blackjack.model

data class Card(
    val pattern: CardPattern,
    val denomination: String
) {
    val point: Int
    get() = when(denomination) {
        "A" -> 1
        "J" -> 11
        "Q" -> 12
        "K" -> 13
        else -> {
            try {
                val num = denomination.toInt()
                if(num in 2..10) {
                    num
                } else {
                    throw IllegalStateException("$denomination is invalid number. Number point should be in 2..10!")
                }
            } catch (e: NumberFormatException) {
                throw IllegalStateException("Can't cast to Int : $denomination")
            }
        }
    }
}

enum class CardPattern {
    SPADE,
    HEART,
    DIAMOND,
    CLUB
}