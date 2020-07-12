package com.laewoong.jang.blackjack.model

import org.junit.Assert.*
import org.junit.Test

class GamerTest {

    @Test
    fun `카드를 받으면 내부 리스트에 저장한다`() {
        val gamer = Gamer()
        val card = Card(CardPattern.DIAMOND, "A")
        gamer.receiveCard(card)
        assertTrue(gamer.cards.contains(card))
    }

    @Test
    fun `현재 가지고 있는 카드를 모두 리턴한다`() {

        val cardList = listOf(
            Card(CardPattern.DIAMOND, "A"),
            Card(CardPattern.CLUB, "2"),
            Card(CardPattern.HEART, "3")
        )
        val gamer = Gamer(cardList)

        assertTrue(gamer.openCards() === cardList)
    }
}