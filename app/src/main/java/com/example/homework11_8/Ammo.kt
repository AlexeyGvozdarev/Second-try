package com.example.homework11_8

enum class Ammo(
    val damage: Int,
    val critChance: Int,
    val critRatio: Int
) {

    BULLET(1, 15, 5),
    SHELLS(5, 23, 7),
    GRENADE(10, 40, 10);

    fun getCurrentDamage(): Int {
        return if (critChance.toBoolean())
            damage * critRatio
            else damage
    }
}