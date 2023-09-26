package VORLESUNG.Woche03

fun main(){

    snackAutomat()

}

fun snackAutomat() {
    val snackMachine = mapOf(
        "A1" to "Schokoriegel",
        "A2" to "Chips",
        "A3" to "Gummibärchen",
        "B1" to "Nüsse",
        "B2" to "Popcorn",
        "B3" to "Kekse",
        "C1" to "Cola",
        "C2" to "Limonade",
        "C3" to "Wasser"
    )

    println("Bitte gib deine Wahl ein...")
    // 1. user gibt zahlenkombi ein
    val choice: String = readln().uppercase()

    // 2.automat spuckt (per println) auswahl aus
    // var x = liste[0] // das 1. Element in der Liste wird in x gespeichert

    var chosenSnack: String = snackMachine[choice]!!

    println("Viel Vergnügen mit $chosenSnack")
}






