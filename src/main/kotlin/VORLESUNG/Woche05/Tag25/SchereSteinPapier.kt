package VORLESUNG.Woche05.Tag25

fun main() {

    // choices
    val choices = listOf("schere", "papier", "stein")


    // game over variable
    var gameOver = false


    // spiel logik
    while (!gameOver) {
        logikIf(choices)
        println("Nochmal spielen? y/n eingeben")
        var continueOrNot = readln()
        if (continueOrNot == "n") {
            gameOver = true

        }
    }


}

fun logikIf(choices: List<String>) {
    println("Deine Wahl eingeben: schere, stein oder papier...")
    // user choice
    var userChoice = readln().lowercase()
    println("Deine Wahl: $userChoice")

    // pc choice
    var pcChoice = choices.random()
    println("PC wahl: $pcChoice")
    if (pcChoice == userChoice) {
        println("Unentschieden! Beide spielen $userChoice")
    }
    // pc gewinnt
    else if (
        (pcChoice == "schere" && userChoice == "papier") ||
        (pcChoice == "stein" && userChoice == "schere") ||
        pcChoice == "papier" && userChoice == "stein"
    ) {
        println("Pc gewinnt mit $pcChoice gegen $userChoice")
        // user gewinnt
    } else {
        println("Du hast gewonnen! $userChoice schlägt $pcChoice")
    }
}

fun logikWhen(pcChoice: String, userChoice: String) {
    when {
        (pcChoice == userChoice) -> {
            println("Unentschieden! Beide spielen $userChoice")
        }

        (pcChoice == "schere" && userChoice == "papier") ||
        (pcChoice == "stein" && userChoice == "schere") ||
        (pcChoice == "papier" && userChoice == "stein") -> {
            println("PC gewinnt!")
        }
        else -> println("User gewinnt")
    }
}













