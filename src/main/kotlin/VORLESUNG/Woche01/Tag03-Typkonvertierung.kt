package VORLESUNG.Woche01

fun main(){

    println("Willkommen beim Taschenrechner! Wir können eine Zahl deiner Wahl * 3 rechnen. \n Bitte Zahl eingeben:")
    var number: Int = readln().toInt() // es muss ein Integer eingegeben werden, sonst kommt es zum Absturz.
    var result = number*3
    println("Deine Zahl $number * 3 ist $result")

    println("Beispiel toDouble: (Zahl eingeben)")
    var numberDouble: Double = readln().toDouble()
    println("Zahl $numberDouble war ursprünglich ein String aber wurde zum Double konvertiert. \n Jetzt können wir damit rechnen, zB: $numberDouble+10 = ${numberDouble+10}")

    // man kann die Konvertierungen auch verketten, dann fangen wir ab, falls ein Double eingegeben wird
    // var numberChain: Int = readln().toDouble().toInt()


    var stringNumber: String = 10.toString()

    // konvertierte Strings konkatenieren

    var number2: Int = 90

    // Int number2 kann man auch zum String konvertieren
    // conv = konvertiert
    var convNumber2: String = number2.toString()

    println("Konkatenation heißt: Es wird mit + nicht plus gerechnet, sondern Daten aneinander gehängt. Number2 ($number2) +10 = " + number2+10)




}