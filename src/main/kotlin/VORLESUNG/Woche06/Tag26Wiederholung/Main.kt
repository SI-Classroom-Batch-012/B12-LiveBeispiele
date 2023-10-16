package VORLESUNG.Woche06.Tag26Wiederholung

import kotlin.random.Random

fun main() {

    // TODO Grade oder Ungrade Zahl

    println("Gebe eine Zahl ein")
    val userInput = readln().toInt()
    if (userInput % 2 == 0) {
        println("$userInput Ist gerade")
    } else {
        println("Ist ungerade")
    }


    // TODO Setzte einen Wetteinsatz. Schleife verlassen wenn Wetteinsatz geringer ist als Kontostand

    var balance: Int = 100

    var bet: Int
    do {
        println("Dein Kontostand ist: $balance€ Bitte gebe ein Wetteinsatz geriner als $balance€ ein")
        bet = readln().toInt()


    } while (bet > balance)
    println("Es wurde $bet€ von dir gesetzt. Lets go")


    // TODO Quersumme einer Zahl herausfinden. 55 Quersumme davon ist = 10

    println("Bitte gebe eine Zahl ein")
    val number = readln()
    var sum = 0
    for (char in number) {
        if (char.isDigit()) {
            sum += char.toString().toInt()
        }
    }
    println("Quersummer von $number ist $sum")


    // TODO Überprüfe ob ein Wort ein palindrom ist

    println("Bitte  gebe eine Wort ein")
    val input = readln().lowercase().trim()
    if (input == input.reversed()) {
        println("Ist ein Palindrom")
    } else {
        println("Ist kein Palindrom")
    }


    //TODO If else in When umformen

    val month = Random.nextInt(1, 12) // ein zufälliger Monat zwischen 1 und 12
    val season = if (month == 12 || month == 1 || month == 2) {
        "Winter"
    } else if (month == 3 || month == 4 || month == 5) {
        "Spring"
    } else if (month == 6 || month == 7 || month == 8) {
        "Summer"
    } else if (month == 9 || month == 10 || month == 11) {
        "Fall"
    } else {
        "Unknown"
    }

    val saison = when (month) {
        1, 12, 2 -> "Winter"
        3, 4, 5 -> " Frühling"
        in 9..11 -> "Herbst"
        in 6..8 -> "Sommer"
        else -> " Falscher Planet"

    }
    println(saison)


}




