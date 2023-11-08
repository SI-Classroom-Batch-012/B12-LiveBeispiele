package VORLESUNG.Woche08.Enums

fun textInFarbe(text: String, farbe: Farbe): String{
    return farbe.farbCode + text + Farbe.reset.farbCode
}

/*

fun main(){

    val text = "Hallo Welt"

    println(text)
    println(textInFarbe(text, Farbe.gelb))
    println(textInFarbe(text, Farbe.gruen))


    val text2 = "${textInFarbe("Drache", Farbe.rot)} greift ${textInFarbe("Spieler 1", Farbe.gruen)} für ${textInFarbe("50", Farbe.blau)} an"
    println(text2)


}

*/

fun main(){

    // Beispiele für Farben
    val alleFarben = Farbe.entries
    val textFarbe: Farbe = alleFarben.random()
    val randomDifficulty = Difficulty.entries.random()

    println(textFarbe)
    println(randomDifficulty)

    println("Nicht farbiger Text " + Farbe.rot.farbCode + "Dieser Text ist Rot" + Farbe.reset.farbCode + "\nWeiterer Text")
    println("Noch ein weiterer Text")

    var beispielText = "Hi mein Name ist ..."
    beispielText = textInFarbe(beispielText, textFarbe)
    println(beispielText + " " + textInFarbe("Gordon", Farbe.rot))


    // Beispiele für Difficulty

    // TODO: Ein Wert eines Enums benutzen:
    val startDifficulty = Difficulty.EASY

    // TODO: Schwierigkeit via Konsole einlesen
    // Diese Variable wird vor der Schleife erstellt, damit sie danach noch existiert
    var difficulty: Difficulty
    do {
        println("Wählen sie ihre Schwierigkeit:")

        Difficulty.entries.forEachIndexed{ i, diff ->
            println("$i für $diff")
        }
        // Try Catch um Exceptions abzufangen
        try {
            val choice = readln().toInt()               // NumberFormatException
            difficulty = Difficulty.entries[choice]     // IndexOutOfBoundsException
            break
        } catch (e: Exception){
            println("ungültige Auswahl.")
        }
    } while (true)

    println("Sie haben die Schwierigkeit '${textInFarbe(difficulty.name, difficulty.farbe)}' gewählt.")


    var enemyName: String
    var enemyHP: Int
    var enemyDmg: Int

    when(difficulty){
        Difficulty.EASY -> {
            enemyName = "Skelett"
            enemyHP = 20
            enemyDmg = 5
        }
        Difficulty.MEDIUM -> {
            enemyName = "Skelett Magier"
            enemyHP = 25
            enemyDmg = 10
        }
        Difficulty.HARD -> {
            enemyName = "Dunklen Magier"
            enemyHP = 30
            enemyDmg = 10
        }
        Difficulty.INSANE -> {
            enemyName = "Schwarzer Drache"
            enemyHP = 50
            enemyDmg = 20
        }
    }

    Thread.sleep(6000)
    println("\n-------------------------------------------\n")
    // Beispiele für Richtung:

    // TODO: Einen Zufälligen Wert eines Enums bekommen, und dessen Eigenschaft anzeigen
    var zufallsRichtung = Richtung.entries.random()
    println("Die Richtung: $zufallsRichtung")
    println("Grad Anzahl: ${zufallsRichtung.grad}")

    // TODO: Eine Methode eines Enums benutzen
    // Nächste Richtung im Uhrzeigersinn:
    zufallsRichtung = zufallsRichtung.uhrzeigersinn()
    println("\nDie nächste Richtung im Uhrzeigersinn: $zufallsRichtung")
    println("Grad Anzahl: ${zufallsRichtung.grad}")


}
