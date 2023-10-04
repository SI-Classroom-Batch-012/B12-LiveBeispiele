package VORLESUNG.WiederholungPA02Karten

fun main(){

    // Aufgabe 1: Kartenstapel mischen
    cards.shuffle()

    // Aufgabe 2: Spielernamen eingeben
    println("Spieler 1, bitte gib deinen Namen ein...")
    val player1Name = readln()
    println("Spieler 2, bitte gib deinen Namen ein...")
    val player2Name = readln()
    println()

    // Aufgabe 3: Karten ziehen
    val player1Cards: MutableList<String> = mutableListOf()
    val player2Cards: MutableList<String> = mutableListOf()
    println("$player1Name zieht eine Karte...")
    player1Cards.add(cards.removeFirst())
    println("$player2Name zieht eine Karte...")
    player2Cards.add(cards.removeFirst())
    println("$player1Name zieht eine Karte...")
    player1Cards.add(cards.removeFirst())
    println("$player2Name zieht eine Karte...")
    player2Cards.add(cards.removeFirst())
    println("$player1Name zieht eine Karte...")
    player1Cards.add(cards.removeFirst())
    println("$player2Name zieht eine Karte...")
    player2Cards.add(cards.removeFirst())
    println()
    println("${player1Name}'s Karten: $player1Cards")
    println("${player2Name}'s Karten: $player2Cards")
    println()

    // Aufgabe 4: Spieler stehlen Gegner-Karte
    val player1Card = player1Cards.random()
    val player2Card = player2Cards.random()
    println("$player1Name hat die Karte $player2Card von $player2Name gestohlen")
    player2Cards.remove(player2Card)
    player1Cards.add(player2Card)
    println("$player2Name hat die Karte $player1Card von $player1Name gestohlen")
    player1Cards.remove(player1Card)
    player2Cards.add(player1Card)
    println()
    println("️${player1Name}'s Karten: $player1Cards")
    println("${player2Name}'s Karten: $player2Cards")
    println()

    // Aufgabe 5: Spieler dürfen Karte neu ziehen
    println("$player1Name, wirf eine Karte ab! Welche willst du abwerfen? 1 / 2 / 3")
    val indexPlayer1 = readln().toInt() - 1
    val removedCardPlayer1 = player1Cards.removeAt(indexPlayer1)
    val newCardPlayer1 = cards.removeFirst()
    player1Cards.add(newCardPlayer1)
    println("$player1Name hat die Karte $removedCardPlayer1 abgeworfen und die Karte $newCardPlayer1 gezogen")
    println()
    println("$player2Name, wirf eine Karte ab! Welche willst du abwerfen? 1 / 2 / 3")
    val indexPlayer2 = readln().toInt() - 1
    val removedCardPlayer2 = player2Cards.removeAt(indexPlayer2)
    val newCardPlayer2 = cards.removeFirst()
    player2Cards.add(newCardPlayer2)
    println("$player2Name hat die Karte $removedCardPlayer2 abgeworfen und die Karte $newCardPlayer2 gezogen")
    println()

    // Aufgabe 6: Wer hat bessere Karten?
    var player1HandValue = 0
    player1HandValue += cardValues[player1Cards[0]]!!
    player1HandValue += cardValues[player1Cards[1]]!!
    player1HandValue += cardValues[player1Cards[2]]!!
    var player2HandValue = 0
    player2HandValue += cardValues[player2Cards[0]]!!
    player2HandValue += cardValues[player2Cards[1]]!!
    player2HandValue += cardValues[player2Cards[2]]!!

    println("$player1Name's Karten $player1Cards haben einen Wert von: $player1HandValue")
    println("$player2Name's Karten $player2Cards haben einen Wert von: $player2HandValue")
    println()












}