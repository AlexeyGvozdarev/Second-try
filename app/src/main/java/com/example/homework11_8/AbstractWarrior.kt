package com.example.homework11_8

abstract class AbstractWarrior(
    var maxHp: Int,
    override var dodgeChance: Int,
    var accuracy: Int,
    var weapon: AbstractWeapon
) : Warrior {
    var hp = maxHp
    override val isKilled: Boolean
    get() = hp <= 0

    override fun applyDamage(damage: Int) {
        hp -= damage
    }

    override fun attack(enemy: Warrior) {
        val bullets = weapon.getBullets()
        if (weapon.magazineIsEmpty && bullets.isEmpty()) {
            weapon.reload()
            return
        } else if (accuracy.toBoolean() && !enemy.dodgeChance.toBoolean()) { //изменено
            while (bullets.isEmpty() == false) {
                val item = bullets.pop()
                if (item != null) {
                    enemy.applyDamage(item.getCurrentDamage())
                }
            }
        }
    }

    override fun toString(): String {
        return "AbstractWarrior(maxHp=$maxHp, dodgeChance=$dodgeChance, accuracy=$accuracy, weapon=$weapon, hp=$hp, isKilled=$isKilled)"
    }

}