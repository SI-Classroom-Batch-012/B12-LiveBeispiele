package VORLESUNG.Woche03.Tag12ReturnFunktionen



// summe berechnen, NICHT zurückgeben
fun sumWoReturn(){
    var sum = 10+10
    println("Rechnung 10+10: $sum")
}

// summe berechnen, zurückgeben
fun sum() : Int {
    var number1 = 20
    var number2 = 30
    return number1+number2
}

// selbe rechnung, kürzere schreibweise
fun shortSum(): Int {
    return 20 + 30
}

fun shortSumSum(): Int {
    return sum() + shortSum()
}

fun sumSum() : Int {
    var sum1 = sum()
    var sum2 = shortSum()
    var sumsum = sum1 + sum2
    return sumsum
}


//  random name

fun randomName() { // ohne return wert
    // liste mit vornamen anlegen
    val firstNames: MutableList<String> = mutableListOf("Johnny", "James", "Jason")
    // liste mit nachnamen anlegen
    val lastNames: MutableList<String> = mutableListOf("Smith", "Wayne", "Kennedy")
    // zufaelligen vornamen mit zufaelligen nachnamen kombinieren
    val randomFirstName: String = firstNames.random()
    val randomLastName: String = lastNames.random()
    val fullName: String = "$randomFirstName $randomLastName"
    // zuefaelligen vollen namen ausdrucken
    println("Der zufällige Name lautet: $fullName")
}

fun getRandomName(): String {
    // liste mit vornamen anlegen
    val firstNames: MutableList<String> = mutableListOf("Johnny", "James", "Jason")
    // liste mit nachnamen anlegen
    val lastNames: MutableList<String> = mutableListOf("Smith", "Wayne", "Kennedy")
    // zufaelligen vornamen mit zufaelligen nachnamen kombinieren
    val randomFirstName: String = firstNames.random()
    val randomLastName: String = lastNames.random()
    val fullName: String = "$randomFirstName $randomLastName"
    return fullName

}


// random greeting


// ist die Zahl gerade?
fun isNumberEven(): Boolean {
    println("Bitte eine Zahl eingeben...")
    // user gibt zahl ein
    val number: Int = readln().toInt()

    // prüfen, ob zahl gerade ist
    val isEven: Boolean = number%2 == 0 // jede gerade zahl modulo 2 = 0

    // zurückgeben, ob zahl gerade ist
    return isEven
    // return number%2 == 0

}



fun main(){
    println("Aufruf von isNumberEven():")
    val isEven: Boolean = isNumberEven()
    println("isEven ist $isEven")


//    var name = randomName() // kein return wert, der name kommt nicht in die main() nach außen
//    println("FEHLER WEGEN FEHLENDEM RETURN: Der Name $name wurde in der Funktion randomName() zufällig erstellt.")
//    var randomName = getRandomName() // return wert, der name wird uns hier in die main() nach außen gegeben
//    // zuefaelligen vollen namen ausdrucken
//    println("Der nach außen gegebene Name lautet: $randomName")
//




//    // das Ergebnis von der Rechnung in sum() wird "nach außen" (in den Scope, in dem sum() aufgerufen wurde) und es kann damit weiter gerechnet werden
//    var sumResult = sum()
//
//    // sum ohne return und Rückgabedatentyp, also bei der nichts nach außen gegeben wird:
//    var sumWoReturn = sumWoReturn()
//    println("Wert von sumWoReturn: $sumWoReturn, hier kommt keine Zahl raus, sondern der Default Unit Datentyp. Man kann damit nicht weiterarbeiten.")
//
//
//    // Wenn eine Funktion einen Return-Wert hat, kann direkt mit der Funktion weitergearbeitet werden
//    println("Direkt mit Funktionsaufruf drucken: ${sum()}")
//    println("Direkt mit kurzem Funktionsaufruf (Variablen werden dort eingespart) drucken: ${shortSum()}")
//    println("Mit Variable sumResult drucken: $sumResult")
//    println("Ergebnis der Funktion sumsum(), die mit den Ergebnissen von sum() und shortSum() arbeitet: ${sumSum()}")

}
