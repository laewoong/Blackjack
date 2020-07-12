package com.laewoong.jang.blackjack.model

import org.junit.Assert.*
import org.junit.Test

class CardTest {

    @Test
    fun `다이아몬드, 하트, 스페이드, 클럽 중 1개의 무늬를 가지고 있다`() {
        //val card = Card("heard")
    }

    @Test
    fun `A는 1점을 리턴한다`() {
        val card = Card(CardPattern.CLUB, "A")
        assertEquals(1, card.point)
    }

    @Test
    fun `J는 11점을 리턴한다`() {
        val card = Card(CardPattern.CLUB, "J")
        assertEquals(1, card.point)
    }

    @Test
    fun `Q는 12점을 리턴한다`() {
        val card = Card(CardPattern.CLUB, "Q")
        assertEquals(1, card.point)
    }

    @Test
    fun `K는 13점을 리턴한다`() {
        val card = Card(CardPattern.CLUB, "K")
        assertEquals(1, card.point)
    }

    @Test
    fun `숫자는 숫자 그대로의 값을 리턴한다`() {
        val card = Card(CardPattern.CLUB, "2")
        assertEquals(2, card.point)
    }

    @Test(expected = IllegalStateException::class)
    fun `2보다 작은 숫자일 경우 에러를 발생한다`() {
        Card(CardPattern.CLUB, "1").point
    }

    @Test(expected = IllegalStateException::class)
    fun `10보다 큰 숫자일 경우 에러를 발생한다`() {
        Card(CardPattern.CLUB, "11").point
    }

    @Test(expected = IllegalStateException::class)
    fun `A, J, Q, K가 아닌 문자일 경우 에러를 발생한다`() {
        Card(CardPattern.CLUB, "B").point
    }
}