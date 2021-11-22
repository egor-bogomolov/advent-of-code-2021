package com.github.egorbogomolov.adventofcode2021

import com.github.egorbogomolov.adventofcode2021.utils.Resources
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class DayTest(val number: Number) {

    val testInput = Resources.asString("test${number.toString().padStart(2, '0')}.txt")

    abstract val day: Day

    abstract fun `Part 1`()

    abstract fun `Part 2`()
}
