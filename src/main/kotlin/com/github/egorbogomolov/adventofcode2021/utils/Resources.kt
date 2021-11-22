package com.github.egorbogomolov.adventofcode2021.utils

internal object Resources {

    fun asString(fileName: String) = Resources.javaClass.classLoader.getResource(fileName)?.readText().orEmpty().trim()
}
