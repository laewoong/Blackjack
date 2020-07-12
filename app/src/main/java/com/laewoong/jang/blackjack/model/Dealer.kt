package com.laewoong.jang.blackjack.model

class Dealer(
    val cards: MutableList<Card> = mutableListOf()
) {
    fun receiveCard(card: Card) {
        if(cards.map { it.point }.sum() <= 16) {
            cards.add(card)
        }
    }

    fun openCards(): List<Card> {
        return cards
    }

    fun isReceiveCard(): Boolean {
        return false
    }
}