package com.example.homework11_8

class Soldier(
    maxHp: Int =100,
    dodgeChance: Int =5,
    accuracy: Int = 70,
    weapon: AbstractWeapon = Weapons.createPistol()
): AbstractWarrior(maxHp , dodgeChance , accuracy , weapon) {
    override fun toString(): String {
        return "Soldier()"
    }
}