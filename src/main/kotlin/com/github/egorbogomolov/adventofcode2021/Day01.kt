package com.github.egorbogomolov.adventofcode2021

import com.github.egorbogomolov.adventofcode2021.utils.ints

class Day01 : Day(1) {

    override fun part1(input: String): Int {
        val numbers = input.ints().toSet()
        for (number in numbers) {
            if (numbers.contains(2020 - number)) {
                return number * (2020 - number)
            }
        }
        throw Exception("Failed to find the answer")
    }

    override fun part2(input: String): Int {
        return 0
    }
}
