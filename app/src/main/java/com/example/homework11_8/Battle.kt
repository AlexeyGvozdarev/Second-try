package com.example.homework11_8

class Battle(
    val firstTeam: Team,
    val secondTeam: Team
) {
    var endOfBattle: Boolean = true

    fun getTheStateOfTheBattle(): BattleState {
        return when {
            firstTeam.teamList.any { !it.isKilled } && secondTeam.teamList.all { it.isKilled } -> BattleState.FirstTeamWin
            firstTeam.teamList.all { it.isKilled } && secondTeam.teamList.any { !it.isKilled } -> BattleState.SecondTeamWin
            firstTeam.teamList.any { !it.isKilled } && secondTeam.teamList.any { !it.isKilled } -> BattleState.Progress(
                firstTeam.getCountOfTeam(),
                secondTeam.getCountOfTeam()
            )
            else -> BattleState.Draw
        }
    }

   // private fun haveHp(warrior: Warrior): Boolean = !warrior.isKilled

    fun battleIterration() {
        firstTeam.teamList.shuffle()
        secondTeam.teamList.shuffle()
        for (firstWarrior in firstTeam.teamList) {
            for (secondWarrior in secondTeam.teamList) {
                if (secondWarrior.hp > 0) {
                    firstWarrior.attack(secondWarrior)
                } else
                    if (firstWarrior.hp > 0) {
                        secondWarrior.attack(firstWarrior)
                    }
            }
        }
    }

    override fun toString(): String {
        return "Battle(firstTeam=$firstTeam, secondTeam=$secondTeam, endOfBattle=$endOfBattle)"
    }

}
//for (firstWarrior in firstTeam.teamList) {
//    for (secondWarrior in secondTeam.teamList) {
//        if (haveHp(firstWarrior) && haveHp(secondWarrior)) {
//            firstWarrior.attack(secondWarrior)
//            if (secondWarrior.hp <= 0) {
//                secondTeam.removeWarrior(secondWarrior)
//            }
//            if (haveHp(secondWarrior)) secondWarrior.attack(firstWarrior)
//            if (firstWarrior.hp <= 0) {
//                firstTeam.removeWarrior(firstWarrior)
//            } else break
//        }
//    }
//}