package com.github.egorbogomolov.adventofcode2021

import kotlin.test.Test
import kotlin.test.assertEquals

class Day01Test : DayTest(1) {

    override val day = Day01()

    @Test
    override fun `Part 1`() {
        assertEquals(514579, day.part1(testInput))    // check against test input
        println("Output for Day $number:")
        println(day.part1())
    }

    @Test
    override fun `Part 2`() {
        assertEquals(0, day.part2(testInput))
        println("Output for Day $number:")
        println(day.part2())
    }
}
