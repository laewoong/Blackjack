package com.laewoong.jang.blackjack.model

data class Card(
    val pattern: CardPattern,
    val denomination: String
)

enum class CardPattern {
    SPADE,
    HEART,
    DIAMOND,
    CLUB
}