package com.laewoong.jang.blackjack.model

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class CardDeckTest {

    lateinit var  cardDeck: CardDeck

    @Before
    fun initCardDeck() {
        cardDeck = CardDeck()
    }

    @Test
    fun whenCardDeckInstantiate_shouldCrateCard() {
        Assert.assertEquals(52, cardDeck.cards.size)
    }

    @Test
    fun `남아있는 카드 중 1개를 뽑는다`() {
        val card = cardDeck.draw()
        Assert.assertNotNull(card)
    }

    @Test
    fun `뽑은 카드는 카드덱에서 제거한다`() {
        val card = cardDeck.draw()
        Assert.assertFalse(cardDeck.cards.contains(card))
    }


}