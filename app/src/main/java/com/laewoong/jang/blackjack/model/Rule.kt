package com.laewoong.jang.blackjack.model

import java.lang.Exception

class Rule {

    fun getScore(cards: List<Card>): Int {
        return cards.map { convertScore(it) }.reduce { acc, i -> acc + i }
    }

    fun getWinner(dealer: Dealer, gamer: Gamer) {

    }

    fun convertScore(card: Card): Int {
        return if (card.denomination == "A") {
            1
        } else if (card.denomination == "K" ||
            card.denomination == "Q" ||
            card.denomination == "J"
                ) {
            10
        } else {
            try {
                val number = card.denomination.toInt()
                if (number in 2..10) {
                    number
                } else {
                    throw IllegalArgumentException("Your denomination(${card.denomination}) is incorrect!")
                }
            } catch (e: Exception) {
                throw IllegalArgumentException("Your denomination(${card.denomination}) is incorrect!")
            }
        }
    }
}