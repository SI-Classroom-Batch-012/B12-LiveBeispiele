package VORLESUNG.Woche01

fun main(){

    // leerer String-Karton, auf dem name steht
//    var name: String // String nicht ausgegraut, weil es keinene Inhalt gibt, von dem aus erschlossen werden kann, um welchen Datentyp es sich handelt.
//
//    var firstName: String = "Jim"
//    println(firstName)
//    firstName = "Simon"
//    println(firstName)
//    firstName = "Artem"
//    println(firstName)
//
//    // name einen Wert zuweisen
//    name = "Markus"
//    println(name)
//    println("name eingeben:")
//    name = readln() // readln: Konsoleneingaben im Programm verwenden
//    println(name)
//
//    // Konstanten: Variablen, die NICHT veränderbar sind
//    val lastName = "Schmidt"
//    // lastName = "Meyer" // einkommentieren, um Compilerfehler zu sehen
//
//    var intNr: Int
//    var doubleNr: Double
//    var isRaining: Boolean
//
//    intNr = 10
//    doubleNr = 10.5
//    isRaining = false
//
//
    // String Interpolation / Escapen mit dem $

    var city: String = "Lisbon"
    var greetingWoDollar: String = "Willkommen in city"
    var greeting: String = "Willkommen in $city"
    println(greetingWoDollar)
    println(greeting)
    city = "Paris"
    println("Willkommen in $city")

    var number = 10
    println("Rechnung mit $number ergibt: $number+10*10")
    println("Rechnung mit $number ergibt: ${number+10*10}")

    // Int Thema
    var numberOfFriends: Int = 10
    numberOfFriends = numberOfFriends+1 // das gleiche, wie 11 reinschreiben
    numberOfFriends = 12
    // ...
    var sum: Int = 15+1
    var diff: Int = sum-1
    var mult: Int = diff*sum
    var quotient: Int = 1/2

    var sumDouble: Double = 15.0+1.0
    var diffDouble: Double = sumDouble-1.0
    var multDouble: Double = diffDouble * 13 // !! man darf mit Doubles und Ints zusammen rechnen, ergibt ein Double
    var quotientDouble: Double = 1.5/2.5
    quotientDouble = 0.0

    var isSunShining: Boolean = true
    isSunShining = false







}

/*
Fragen


    - kriege es nicht in meinen Kopf rein
    - Was ist eine Variable generell?
        - Karton, der ein Label (= einen Variablennamen) erhält
        - kann abgeändert werden, wenn sie keine Konstante ist (val)
        - beinhaltet Datum/Information, die wir gerade benötigen

    -




 */