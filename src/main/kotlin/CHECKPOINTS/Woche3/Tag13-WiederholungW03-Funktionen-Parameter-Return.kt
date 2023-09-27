package CHECKPOINTS.Woche3


fun main() {

    val teamBlue: MutableList<String> = mutableListOf()
    val teamRed: MutableList<String> = mutableListOf()




    val player1 = "Yassine"
    val player2 = "Lukas"
    val player3 = "Nilu"
    val nameTeamBlau = "Team BLAU"
    val nameTeamRot = "Team ROT"
    addPlayer(teamBlue, player1, nameTeamBlau)
    addPlayer(teamRed, player2, nameTeamRot)
    addPlayer(teamBlue, player3, nameTeamBlau)

    printTeam(nameTeamBlau, teamBlue)
    printTeam(nameTeamRot, teamRed)


    val lukas = "Lukas"
    val mohammad = "Mohammad"
    sayHelloToName(lukas)

    sayHelloToName(lukas)
    sayHelloToName(mohammad)

}


// schreibe eine Methode, die den Namen und Kader des Teams präsentiert
// Team: teamname
// Spieler: spieler1, spieler2, ...
fun printTeam(name: String, team: MutableList<String>) {
    println("Team: $name")
    println("Spieler: $team")

}

fun sayHelloToName(person: String){
    println("Hallo $person!")
}


// add a new player to the existing team
// Ausgabe: "name ist nun Teil des Teams."
fun addPlayer(team: MutableList<String>, player: String, nameTeam: String ) {
    team.add(player)
    println("$player wurde dem $nameTeam hinzugefügt.")
}
