package CHECKPOINTS.Woche01

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(){

    // Integer: Ganzzahl ohne Nachkommastelle
    var age: Int = 21
    val number: Int = 10
    println(number)
    println(age)

    age = 22
//    number = 22
    println("Wir haben was verändert")
    println("Neue number: $age")
    println()


    // Double: Zahl mit Nachkommastelle
    var sizeMeter: Double = 1.83
    println("Meine Größe ist: $sizeMeter m")
    println()


    // String: Zeichenkette
    var name: String = "Niklas"
    var ageString: String = "21"
    ageString = "22"

    // Boolean: Wahrheitswert: wahr oder falsch
    var ofAge: Boolean = true // false
    println("Nicht mehr minderjährig: $ofAge")
    println()


    // Strings einlesen und Ausgeben
    print("Gib bitte etwas ein: ")
    var eingabe: String = readln()
    println("Deine Eingabe: $eingabe")
}