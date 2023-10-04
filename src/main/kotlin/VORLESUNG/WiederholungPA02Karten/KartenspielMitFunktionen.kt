package VORLESUNG.WiederholungPA02Karten

/*
In der Variable cards ist ein Kartenset in Form einer Liste gespeichert.
Beispiel:
    "♥️7" steht für die Karte "Herz Sieben"
    "♥️A" steht für die Karte "Herz Ass"
 */
val cards: MutableList<String> = mutableListOf(
    "♥️7", "♦️7", "♠️7", "♣️7",
    "♥️8", "♦️8", "♠️8", "♣️8",
    "♥️9", "♦️9", "♠️9", "♣️9",
    "♥️10", "♦️10", "♠️10", "♣️10",
    "♥️B", "♦️B", "♠️B", "♣️B",
    "♥️D", "♦️D", "♠️D", "♣️D",
    "♥️K", "♦️K", "♠️K", "♣️K",
    "♥️A", "♦️A", "♠️A", "♣️A",
    "🃏JOKER"
)


/*
In der Variable values sind die Werte der Karten in einer Map gespeichert.
Beispiel:
    "♥️7" to 1 steht für einen Wert von 1 für die Karte "Herz Sieben"
    "♥️A" to 8 steht für einen Wert von 8 für die Karte "Herz Ass"
Bei einem Vergleich der Werte würde also das "Herz Ass" gewinnen
 */
val cardValues: Map<String, Int> = mapOf(
    "♥️7" to 1, "♦️7" to 1, "♠️7" to 1, "♣️7" to 1,
    "♥️8" to 2, "♦️8" to 2, "♠️8" to 2, "♣️8" to 2,
    "♥️9" to 3, "♦️9" to 3, "♠️9" to 3, "♣️9" to 3,
    "♥️10" to 4, "♦️10" to 4, "♠️10" to 4, "♣️10" to 4,
    "♥️B" to 5, "♦️B" to 5, "♠️B" to 5, "♣️B" to 5,
    "♥️D" to 6, "♦️D" to 6, "♠️D" to 6, "♣️D" to 6,
    "♥️K" to 7, "♦️K" to 7, "♠️K" to 7, "♣️K" to 7,
    "♥️A" to 8, "♦️A" to 8, "♠️A" to 8, "♣️A" to 8,
    "🃏JOKER" to 10
)

fun main() {
    // Zur Erinnerung
        // Beispiel Syntax: Liste anlegen
        var liste: List<String> = listOf("Jacke", "Hose","Schal","Mütze")
        var numbers: List<Int> = listOf(1,2,3,4,5)

    // Aufgabe 1: Karten mischen
    cards.shuffle()

    // Aufgabe 2: Spielernamen eingeben
    val spieler1 = inputPlayerName()
    val spieler2: String = inputPlayerName()

    // Aufgabe 3: Spielerhände erstellen
    // leere Hand
    val handSpieler1: MutableList<String> = mutableListOf()
    val handSpieler2: MutableList<String> = mutableListOf()

    // erste Karte vom cards Stapel ziehen, auf die Hand legen
        // lange Variante: Variable
        var firstCard: String = cards.removeFirst()
        handSpieler1.add(firstCard)

        // kurze Variante: ohne Variablen, spieler kriegen abwechselnd die oberste Karte
        handSpieler2.add(cards.removeFirst())
        handSpieler1.add(cards.removeFirst())
        handSpieler2.add(cards.removeFirst())
        handSpieler1.add(cards.removeFirst())
        handSpieler2.add(cards.removeFirst())

    println("$spieler1: $handSpieler1")
    println("$spieler2: $handSpieler2")


    // Aufgabe 4: in Funktion ausgelagert
    stealCard(spieler1,handSpieler1,spieler2,handSpieler2)
    stealCard(spieler2,handSpieler2,spieler1,handSpieler1)


    // Aufgabe 5
     /*
     Programmiere eine Benutzerinteraktion
    Beide Spieler sollen nacheinander eine Zahl zwischen 1 und 3 eingeben können
    Die entsprechende Karte soll entfernt werden
    Die oberste Karte aus dem Stapel soll gezogen werden
    Gib jeweils auf der Konsole aus, welche Karte abgeworfen wurde und welche gezogen wurde
      */

    replaceCard(spieler1,handSpieler1)
    replaceCard(spieler2,handSpieler2)
    handSpieler2.add(cards.removeFirst())


    // Aufgabe 6:
    // Rechne den Gesamtwert der Karten für jeden Spieler aus. Nutze dafür die cardValues Map
    calculateHandWorth(spieler1,handSpieler1)
    calculateHandWorth(spieler2,handSpieler2)


}

fun inputPlayerName(): String {
    println("Bitte Namen für deinen Spieler eingeben...")
    return readln()

}

fun calculateHandWorth(playerName: String, playerHand: MutableList<String>) {
    // 1. Variable, in die ich Werte speichere
    var values: Int = 0

    // 2. Rechnung beginnen
    // lange Variante:
    // Variable mit dem Inhalt der Karte aus der Hand
    var inhalt = playerHand[0]
    // Wert aus der Map in Variable speichern
    var value: Int = cardValues[inhalt]!!

    // Wert in die Values Variable addieren
    values = values + value
    values = values + cardValues[playerHand[1]]!!
    values = values + cardValues[playerHand[2]]!!

    println("Wert der Hand von $playerName: $values")
}

fun replaceCard(playerName: String, playerHand: MutableList<String>) {
    println("$playerName, welche Karte willst du abwerfen? \nBitte Zahl zwischen 1 und 3 eingeben...")
    var input = readln().toInt()-1 // minus(1)
    println("Spieler 1 hat die Karte ${input+1} (${playerHand[input]}) ausgewählt, sie wird abgeworfen...")
    // karte abwerfen
    playerHand.removeAt(input)
    playerHand.add(cards.removeFirst())
    println("$playerName zieht neue Karte vom Stapel...")
    println("Neue Hand $playerName: $playerHand")
}



/**
 * lässt einen spieler eine Karte aus der hand des anderen spielers klauen
 * @param dieb name des diebs
 * @param diebHand, der klauende
 * @param opfer name des opfers
 * @param opferHand, der beklaute
 */
fun stealCard(opfer: String, opferHand: MutableList<String>, dieb: String, diebHand: MutableList<String>, ){

    // eine zufällige Karte vom Opfer auswählen
    var randomCard: String = opferHand.random()
    println("Zufällige geklaute Karte von $opfer: $randomCard")
    // diese karte vom opfer entfernen
    opferHand.remove(randomCard)
    // diese karte dem dieb geben
    diebHand.add(randomCard)

    println("$dieb hat $randomCard von $opfer gestohlen.")
    println("$dieb: $diebHand")
    println("$opfer: $opferHand")
}
