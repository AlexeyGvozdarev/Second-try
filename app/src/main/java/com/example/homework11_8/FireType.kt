package com.example.homework11_8

sealed class FireType(var burstLength: Int) {
    object SingleShot : FireType(1)

    data class Burst(val bursSize: Int) : FireType(bursSize) {
        override fun toString(): String {
            return "Burst(bursSize=$bursSize)"
        }
    }

    override fun toString(): String {
        return "FireType(burstLength=$burstLength)"
    }
}
