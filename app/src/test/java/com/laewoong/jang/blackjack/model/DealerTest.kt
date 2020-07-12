package com.laewoong.jang.blackjack.model

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DealerTest {

    @Test
    fun `카드를 받으면 리스트에 저장한다`() {
        val dealer = Dealer()
        val card = Card(CardPattern.DIAMOND, "A")
        dealer.receiveCard(card)
        assertTrue(dealer.cards.contains(card))
    }

    @Test
    fun `두 개의 카드 합계 점수가 16점 이하이면 카드를 받아서 저장한다`() {
        val dealer = Dealer()
        val card = Card(CardPattern.DIAMOND, "A")
        dealer.receiveCard(card)
        assertTrue(dealer.cards.contains(card))
    }

    @Test
    fun `두 개의 카드 합계 점수가 17점 이상이면 카드를 받아도 저장하지 않는다`() {
        val dealer = Dealer(
            mutableListOf(
                Card(CardPattern.DIAMOND, "Q"),
                Card(CardPattern.DIAMOND, "K")
            )
        )
        val card = Card(CardPattern.DIAMOND, "A")
        dealer.receiveCard(card)
        assertFalse(dealer.cards.contains(card))
    }

    @Test
    fun `가지고 있는 카드 합계 점수가 16점 이하이면 카드를 더 받을 수 있다고 알려준다`() {
        val dealer = Dealer(
            mutableListOf(
                Card(CardPattern.DIAMOND, "A")
            )
        )
        assertTrue(dealer.isReceiveCard())
    }

    @Test
    fun `가지고 있는 카드 합계 점수가 17점 이상이면 카드를 더이상 받을 수 없다고 알려준다`() {
        val dealer = Dealer(
            mutableListOf(
                Card(CardPattern.DIAMOND, "Q"),
                Card(CardPattern.DIAMOND, "K")
            )
        )
        assertFalse(dealer.isReceiveCard())
    }
}