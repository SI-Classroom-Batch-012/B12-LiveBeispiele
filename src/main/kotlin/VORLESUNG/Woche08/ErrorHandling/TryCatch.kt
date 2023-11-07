package VORLESUNG.Woche08.ErrorHandling

fun main() {


    val gameMenu = listOf(
        "Weiter Spielen",
        "Neues Spiel",
        "Einstellungen",
        "Spiel Beenden"
    )

    for (option in gameMenu) {
        println(option)
    }
    println("Wählen sie aus (0-3)")


    var auswahl: String

    auswahl = gameMenu[indexEinlesen(0, gameMenu.size-1)]


    println("[$auswahl]")
    println("....")

}


fun indexEinlesen(min: Int = 0, max: Int): Int {
    var index: Int
    do {
        println("Geben sie eine Zahl zw. $min und $max ein.")

        try {
            index = readln().toInt()
        } catch (e: NumberFormatException){
            println("AUFPASSEN! Du musst einen gültigen Integer eingeben")
            index = -1
        }

    } while (index !in min..max)

    return index
}