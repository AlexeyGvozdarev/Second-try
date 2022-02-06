package com.example.homework11_8

class Captain(
    maxHP: Int = 200,
    dodgeChance: Int = 10,
    accuracy: Int = 80,
    weapon: AbstractWeapon = Weapons.createShotGun()
) : AbstractWarrior(maxHP, dodgeChance, accuracy, weapon) {

    override fun toString(): String {
        return "Captain()"
    }
}