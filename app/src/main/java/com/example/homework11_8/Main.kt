package com.example.homework11_8

fun main() {

    print("Enter a numbers of warrior for every team: ")
    val numbersOfWarriors = inputInt()
    val firstTeam = Team(numbersOfWarriors)
    val secondTeam = Team(numbersOfWarriors)
    firstTeam.createTeam()
    secondTeam.createTeam()
    println(firstTeam.teamList)
    println(secondTeam.teamList)
    val battle = Battle(firstTeam, secondTeam)
    //Battle(firstTeam, secondTeam)
   // BattleState.Progress(firstTeam.getCountOfTeam(), secondTeam.getCountOfTeam()).print()
    println()
    while(battle.getTheStateOfTheBattle() is BattleState.Progress) {
        battle.battleIterration()
        BattleState.Progress(firstTeam.getCountOfTeam(), secondTeam.getCountOfTeam()).print()
    }
    battle.getTheStateOfTheBattle().print()
    return
}

fun inputInt(): Int = readLine()?.toIntOrNull() ?: inputInt()
