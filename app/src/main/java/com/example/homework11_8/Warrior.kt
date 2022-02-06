package com.example.homework11_8

interface Warrior {
    val isKilled: Boolean
    var dodgeChance: Int

    fun attack(enemy: Warrior)

    fun applyDamage(damage: Int)
}