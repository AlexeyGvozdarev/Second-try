package com.example.homework11_8

class Team(var teamCont: Int) {
    var teamList= mutableListOf<AbstractWarrior>()

     fun createWarrior(warrior: AbstractWarrior): AbstractWarrior {
         val member = warrior
         return member
     }


    fun createTeam(){
        while (teamList.size < teamCont){
            if (10.toBoolean()){
                teamList.add(createWarrior(General()))
            }else if (40.toBoolean()){
                teamList.add(createWarrior(Captain()))
            }else {
                teamList.add(createWarrior(Soldier()))
            }

        }
    }

    fun getCountOfTeam(): Int{
        return teamList.count { !it.isKilled }
    }



    override fun toString(): String {
        return "Team(teamCont=$teamCont, teamList=$teamList)"
    }


}