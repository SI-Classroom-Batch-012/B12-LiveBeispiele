package VORLESUNG.Woche01

fun main(){

    // Konvertierung: muss in Variable gespeichert werden, wir sonst "vergessen"
    val x: Int = 9
    x.toString() // wird ohne speichern in eine Variable direkt vergessen
    val y = x.toString() // x wird nicht verändert, das Ergebnis von .toString() muss in eine weitere Variable gespeichert werden
    println("X + 1 = ${x+1}")
    println("Y = ${y+1}")


    val strNumber: String // Deklaration: leere Variable vom Typ String anlegen, hier MUSS der Datentyp dazu, weil der Compiler ihn sonst nicht erkennt
    strNumber = "101" // Initialisieren: Wert reinschreiben
    // kurze Syntax: Ein einziger Schritt, toInt() direkt in der Zuweisung verwenden
    val plusTen: Int = strNumber.toInt()+10 // 101 + 10 = 111
    // Was wird println ausgeben?
    println(plusTen)
    // längere Syntax: 2 Schritte, toInt() Ergebnis in einer Variable zwischenspeichern
    val intNumber: Int = strNumber.toInt()
    val result = intNumber+10
    println("Ergebnis IntNumber: $intNumber + 10 = $result")


    // Modulo: Überprüfen, ob eine Nutzereingabe gerade ist
    println("Bitte Zahl eingeben, um zu prüfen, ob sie gerade ist. \n (gerade bedeutet: Die Zahl ist durch 2 teilbar, das heißt der Rest ist 0)")
    val number: String = readln() // kurze Version: var number: Int = readln().toInt()
    val numberConv: Int = number.toInt()
    val resultMod = numberConv%2
    println("Die eingegebene Zahl $number modulo 2 ergibt den Rest $resultMod, 0 -> gerade, 1 -> ungerade")


}