package com.github.egorbogomolov.adventofcode2021

import com.github.egorbogomolov.adventofcode2021.utils.Resources

abstract class Day(val number: Number) {

    private val input = Resources.asString("day${number.toString().padStart(2, '0')}.txt")

    abstract fun part1(input: String): Any

    fun part1() = part1(input)

    abstract fun part2(input: String): Any

    fun part2() = part2(input)
}
