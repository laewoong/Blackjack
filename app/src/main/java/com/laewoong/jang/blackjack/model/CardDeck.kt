package com.laewoong.jang.blackjack.model

class CardDeck{

    var cards: List<Card> = generateCard()

    private fun generateCard(): List<Card> = PATTERNS.flatMap { pattern ->
        (1 .. CARD_COUNT).map {  i ->
            Card(pattern, numberToDenomination(i))
        }
    }


    private fun numberToDenomination(number: Int): String = when (number) {
        1 -> "A"
        11 -> "J"
        12 -> "Q"
        13 -> "K"
        else -> number.toString()
    }

    fun draw(): Card {
        val card = cards.first()
        cards = cards.filter { it !== card }
        return card
    }

    companion object {
        val PATTERNS = CardPattern.values()
        const val CARD_COUNT = 13
    }
}