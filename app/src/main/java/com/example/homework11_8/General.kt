package com.example.homework11_8

class General(
    maxHP: Int = 300,
    dodgeChance: Int = 15,
    accuracy: Int = 90,
    weapon: AbstractWeapon = Weapons.createLauncher()
): AbstractWarrior(maxHP, dodgeChance , accuracy , weapon ) {
    override fun toString(): String {
        return "General()"
    }
}