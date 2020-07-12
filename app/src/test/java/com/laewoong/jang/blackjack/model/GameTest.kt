package com.laewoong.jang.blackjack.model

import org.junit.Assert.*
import org.junit.Test

class GameTest {

    @Test
    fun `처음 시작시 Dealer는 두 장의 카드를 받아야 한다`() {

        val game = Game()
        game.initPhase()
        assertTrue(game.dealer.openCards().size == 2)
    }

    @Test
    fun `처음 시작시 Gamer는 두 장의 카드를 받아야 한다`() {
        val game = Game()
        game.initPhase()
        assertTrue(game.gamer.openCards().size == 2)
    }
}