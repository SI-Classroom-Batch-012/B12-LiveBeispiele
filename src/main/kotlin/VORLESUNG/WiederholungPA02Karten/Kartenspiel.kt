package VORLESUNG.WiederholungPA02Karten

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

fun main() {
    // Beispiel: Liste anlegen
    var liste: List<String> = listOf("Jacke", "Hose","Schal","Mütze")
    var numbers: List<Int> = listOf(1,2,3,4,5)

    // Aufgabe 1: Karten mischen
    cards.shuffle()

    // Aufgabe 2: Spielernamen eingeben
    println("Spieler 1, bitte Namen eingeben...")
    var spieler1: String = readln()
    println("Spieler 2, bitte Namen eingeben...")
    var spieler2: String = readln()

    // Aufgabe 3: Spielerhände erstellen
    // leere Hand
    val handSpieler1: MutableList<String> = mutableListOf()
    val handSpieler2: MutableList<String> = mutableListOf()

    // erste Karte vom cards Stapel ziehen, auf die Hand legen

    // lange Variante: Variable
    var firstCard: String = cards.removeFirst()
    handSpieler1.add(firstCard)

    // kurze Variante: ohne Variablen
    handSpieler2.add(cards.removeFirst())
    handSpieler1.add(cards.removeFirst())
    handSpieler2.add(cards.removeFirst())
    handSpieler1.add(cards.removeFirst())
    handSpieler2.add(cards.removeFirst())

    println(cards)
    println(handSpieler1)
    println(handSpieler2)









}
