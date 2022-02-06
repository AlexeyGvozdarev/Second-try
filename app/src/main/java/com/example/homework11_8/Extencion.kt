package com.example.homework11_8

import kotlin.random.Random

fun Int.toBoolean(): Boolean {
    return this > Random.nextInt(101)
}