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

    // Aufgabe 4: in Funktion ausgelagert
    cardStealing(handSpieler1,handSpieler2)
    // manuell spieler 1 eine karte abwerfen lassen, weil er sonst 4 hat:
    handSpieler1.removeFirst()
    println("Hand Spieler 1 $spieler1 nach dem klauen: $handSpieler1")
    cardStealing(handSpieler2,handSpieler1)
    println("Hand Spieler 2 $spieler2 nach dem klauen: $handSpieler2")



    // Aufgabe 5
     /*
     Programmiere eine Benutzerinteraktion
    Beide Spieler sollen nacheinander eine Zahl zwischen 1 und 3 eingeben können
    Die entsprechende Karte soll entfernt werden
    Die oberste Karte aus dem Stapel soll gezogen werden
    Gib jeweils auf der Konsole aus, welche Karte abgeworfen wurde und welche gezogen wurde
      */


    println("Spieler 1 $spieler1, eelche Karte willst du abwerfen? \nBitte Zahl zwischen 1 und 3 eingeben...")
    var input = readln().toInt()-1 // minus(1)
    println("Spieler 1 hat die Karte $input ausgewählt, sie wird abgeworfen...")
    // karte abwerfen
    handSpieler1.removeAt(input)
    println("Neue Hand Spieler 1: $handSpieler1")

    println("Spieler 2 $spieler2, eelche Karte willst du abwerfen? \nBitte Zahl zwischen 1 und 3 eingeben...")
    var input2 = readln().toInt()-1 // minus(1)
    println("Spieler 2 hat die Karte $input2 ausgewählt, sie wird abgeworfen...")
    // karte abwerfen
    handSpieler2.removeAt(input2)
    println("Neue Hand Spieler 2: $handSpieler2")

    handSpieler1.add(cards.removeFirst())
    println("Neue Hand $spieler1: $handSpieler1")

    handSpieler2.add(cards.removeFirst())
    println("Neue Hand $spieler2: $handSpieler2")


    // Aufgabe 6:
    // Rechne den Gesamtwert der Karten für jeden Spieler aus. Nutze dafür die cardValues Map

    // 1. Variable, in die ich Werte speichere
    var valuesPlayer1: Int = 0
    var valuesPlayer2: Int = 0

    // 2. Rechnung beginnen
    // lange Variante:
    // Variable mit dem Inhalt der Karte aus der Hand
    var inhalt = handSpieler1[0]
    // Wert aus der Map in Variable speichern
    var value: Int = cardValues[inhalt]!!

    // Wert in die Values Variable addieren
    valuesPlayer1 = valuesPlayer1 + value
    valuesPlayer1 = valuesPlayer1 + cardValues[handSpieler1[1]]!!
    valuesPlayer1 = valuesPlayer1 + cardValues[handSpieler1[2]]!!

    println("Wert der Hand von Player 1 $spieler1: $valuesPlayer1")

}

/**
 * lässt einen spieler eine Karte aus der hand des anderen spielers klauen
 * @param diebHand, der klauende
 * @param opferHand, der beklaute
 */
fun cardStealing(diebHand: MutableList<String>, opferHand: MutableList<String>){

    // eine zufällige Karte vom Opfer auswählen
    var randomCard: String = opferHand.random()
    println("Zufällige Karte aus Opferhand: $randomCard")
    // diese karte vom opfer entfernen
    opferHand.remove(randomCard)
    // diese karte dem dieb geben
    diebHand.add(randomCard)

    println("Dieb had $randomCard von Opfer gestohlen.")
    println("Dieb hand: $diebHand")
}
