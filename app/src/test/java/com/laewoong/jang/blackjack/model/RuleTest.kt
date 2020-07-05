package com.laewoong.jang.blackjack.model

import org.junit.Assert.assertEquals
import org.junit.Test

class RuleTest {

    lateinit var cardList: List<Card>

    @Test
    fun `A를 1점으로 변환해준다`() {
        val card = Card(CardPattern.DIAMOND, "A")
        val rule = Rule()
        val score = rule.convertScore(card)
        assertEquals(1, score)
    }

    @Test
    fun `K는 10점으로 변환해준다`() {
        val card = Card(CardPattern.DIAMOND, "K")
        val rule = Rule()
        val score = rule.convertScore(card)
        assertEquals(10, score)
    }

    @Test
    fun `Q는 10점으로 변환해준다`() {
        val card = Card(CardPattern.DIAMOND, "Q")
        val rule = Rule()
        val score = rule.convertScore(card)
        assertEquals(10, score)
    }

    @Test
    fun `J는 10점으로 변환해준다`() {
        val card = Card(CardPattern.DIAMOND, "J")
        val rule = Rule()
        val score = rule.convertScore(card)
        assertEquals(10, score)
    }

    @Test
    fun `숫자는 그대로 숫자로 변환해준다`() {
        val card = Card(CardPattern.DIAMOND, "2")
        val rule = Rule()
        val score = rule.convertScore(card)
        assertEquals(2, score)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `숫자 범위를 벗어난 경우 익셉션 발생한다`() {
        val card = Card(CardPattern.DIAMOND, "1")
        val rule = Rule()
        rule.convertScore(card)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `문자 범위를 벗어난 경우 익셉션 발생한다`() {
        val card = Card(CardPattern.DIAMOND, "H")
        val rule = Rule()
        rule.convertScore(card)
    }


    @Test
    fun `A만 있을 경우 1점을 리턴한다 측정해준다`() {
        val cardList = listOf(
            Card(CardPattern.DIAMOND, "A")
        )
        val rule = Rule()
        val score = rule.getScore(cardList)
        assertEquals(1, score)
    }

    @Test
    fun `A, 2만 있을 경우 3점을 리턴한다 측정해준다`() {
        val cardList = listOf(
            Card(CardPattern.DIAMOND, "A"),
            Card(CardPattern.DIAMOND, "2")
        )
        val rule = Rule()
        val score = rule.getScore(cardList)
        assertEquals(3, score)
    }

    @Test
    fun `J, K, Q만 있을 경우 30점을 리턴한다 측정해준다`() {
        val cardList = listOf(
            Card(CardPattern.DIAMOND, "J"),
            Card(CardPattern.DIAMOND, "K"),
            Card(CardPattern.DIAMOND, "Q")
        )
        val rule = Rule()
        val score = rule.getScore(cardList)
        assertEquals(30, score)
    }
}