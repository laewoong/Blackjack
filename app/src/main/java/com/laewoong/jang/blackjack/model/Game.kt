package com.laewoong.jang.blackjack.model

class Game(
    val dealer: Dealer = Dealer(),
    val gamer: Gamer = Gamer()
) {
    val cardDeck = CardDeck()

    fun play() {

//        val dealer = Dealer()
//        val gamer = Gamer()
//        val rule = Rule()
//        val cardDeek = CardDeck()
    }

    fun initPhase() {

        (1 .. 2).forEach {
            dealer.receiveCard(cardDeck.draw())
            gamer.receiveCard(cardDeck.draw())
        }
    }
}