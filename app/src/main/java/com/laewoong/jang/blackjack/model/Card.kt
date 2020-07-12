package com.laewoong.jang.blackjack.model

data class Card(
    val pattern: CardPattern,
    val denomination: String
) {
    val point: Int
    get() = 0
}

enum class CardPattern {
    SPADE,
    HEART,
    DIAMOND,
    CLUB
}