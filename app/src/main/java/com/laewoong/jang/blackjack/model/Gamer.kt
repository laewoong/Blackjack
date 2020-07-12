package com.laewoong.jang.blackjack.model

class Gamer(
    val cards: MutableList<Card> = mutableListOf<Card>()
) {

    fun receiveCard(card: Card) {
        cards.add(card)
    }

    fun openCards(): List<Card> {
        return cards
    }
}