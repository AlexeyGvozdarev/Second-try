package com.example.homework11_8

abstract class AbstractWeapon(
    var magazineSize: Int,
    var fireType: FireType
) {
    var magazine: Stack<Ammo> = Stack()
    val magazineIsEmpty: Boolean
        get() {
            return magazine.isEmpty()
        }

    abstract fun createBullet(): Ammo

    fun reload() {
        if (magazineIsEmpty) {                     //не должно превышать колво патронов....у меня превышает если запутить релоад неск раз
            for (item in 0 until magazineSize) {
                magazine.push(createBullet())
            }
        }else return
    }

    fun getBullets(): Stack<Ammo> {
         val list = Stack<Ammo> ()                                         // забрать из магазина колво патронов в зависимости от фаер тайп...забрать с помощью ПОП
        if (!magazineIsEmpty) {
            for (i in 0 until fireType.burstLength) {
                val temp: Ammo? = magazine.pop()
                if (temp != null) {
                    list.push(temp)
                }
            }
        }
        return list
    }

    override fun toString(): String {
        return "AbstractWeapon(magazineSize=$magazineSize, fireType=$fireType, magazine=$magazine, magazineIsEmpty=$magazineIsEmpty)"
    }

}



object Weapons {
     fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(6, FireType.SingleShot) {
            override fun createBullet(): Ammo {
                return Ammo.BULLET
            }
        }
    }

    fun createAK47(): AbstractWeapon {
        return object : AbstractWeapon(30, FireType.Burst(30)) {
            override fun createBullet(): Ammo {
                return Ammo.BULLET
            }
        }

    }
     fun createShotGun(): AbstractWeapon{
        return object : AbstractWeapon(12,FireType.SingleShot){
            override fun createBullet(): Ammo {
                return Ammo.SHELLS
            }
        }
    }
    fun createLauncher(): AbstractWeapon {
        return object : AbstractWeapon(1,FireType.SingleShot){
            override fun createBullet(): Ammo {
                return Ammo.GRENADE
            }
        }
    }
}
