package com.example.homework11_8

sealed class BattleState(val message: String) {

    open fun print() = println(message)
    override fun toString(): String {
        return "BattleState(message='$message')"
    }

    class Progress(
        val firstTeamCount: Int,
        val secondTeamCount: Int
    ) : BattleState("Количество воинов в первой комманде: $firstTeamCount   Количество воинов во второй комманде: $secondTeamCount")

    object FirstTeamWin : BattleState("Победа первой комманды")

    object SecondTeamWin : BattleState("Победа второй комманды")

    object Draw : BattleState("Ничья")

}