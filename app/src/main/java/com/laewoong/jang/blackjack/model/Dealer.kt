package com.laewoong.jang.blackjack.model

class Dealer(
    val cards: MutableList<Card> = mutableListOf()
) {
    fun receiveCard(card: Card) {
        cards.add(card)
    }

    fun openCards(): List<Card> {
        return cards
    }
}