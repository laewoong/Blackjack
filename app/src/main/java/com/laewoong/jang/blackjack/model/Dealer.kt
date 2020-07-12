package com.laewoong.jang.blackjack.model

class Dealer(
    val cards: MutableList<Card> = mutableListOf()
) {
    fun receiveCard(card: Card) {
        if(isReceiveCard()) {
            cards.add(card)
        }
    }

    fun openCards(): List<Card> {
        return cards
    }

    fun isReceiveCard(): Boolean {
        return cards.map { it.point }.sum() <= 16
    }
}