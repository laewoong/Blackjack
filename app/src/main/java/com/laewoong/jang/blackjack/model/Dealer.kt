package com.laewoong.jang.blackjack.model

class Dealer(
    val card: MutableList<Card> = mutableListOf()
) {
    fun receiveCard(card: Card) {

    }

    fun openCards(): List<Card> {
        return emptyList()
    }
}