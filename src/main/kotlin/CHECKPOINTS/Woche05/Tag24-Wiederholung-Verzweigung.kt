package CHECKPOINTS.Woche05

import com.sun.org.apache.xpath.internal.operations.Bool
import java.lang.NumberFormatException


// IF SYNTAX
/*

if(BEDINGUNG) {
    Code wenn bedingung wahr
} else if (BEDINGUNG 2) {
    Code wenn bedingung 2 wahr
} else {
    Code wenn keine Bedingung wahr ist
}

 */

// TRY CATCH SYNTAX
/*
try {
    Fehleranfälliger Code
} catch(e: Exception){
    Code der ausgeführt wird, wenn es Fehler geworfen wurde
}
 */

fun main() {
    // Aufgabe Gerade/Ungerade
    var zahlGeradeUngerade: Int = 0

    print("Gibt eine Zahl ein: ")

    try {
        zahlGeradeUngerade = readln().toInt()
    } catch (e: NumberFormatException){
       println("Ungültige Eingabe!")
    }

    if (zahlGeradeUngerade % 2 == 0) {
        println("$zahlGeradeUngerade ist gerade")
    } else {
        println("$zahlGeradeUngerade ist ungerade")
    }

    // Aufgabe Minderjährig, Erwachsen, Rentner
    print("Gib dien Alter ein: ")
    val alter: Int = readln().toInt()

    if(alter < 0){
        println("Das geht nicht?")
    } else if(alter < 18){
        println("Du bist noch minderjährig")
    } else if(alter < 67){
        println("Du bist erwachsen")
    } else{
        println("Du bist im Rentenalter")
    }

    // Aufgabe Passwort
    // Mindestens 5 Zeichen, enthält Ausrufezeichen oder Fragezeichen, mindestens 1 Großbuchstabe
    print("Passwort eingeben: ")
    val passwort: String = readln()


    val laengerAlsFuenf: Boolean = passwort.length >= 5
    val enthaeltAusr: Boolean = passwort.contains("!")
    val enthaeltFrag: Boolean = passwort.contains("?")


//    var enthaeltGrossbuchstabe: Boolean = false
//    for(zeichen in passwort){
//        if(zeichen.isUpperCase()){
//            enthaeltGrossbuchstabe = true
//            break
//        }
//    }
    var enthaeltGrossbuchstabe: Boolean = passwort.any{ it.isUpperCase() }

    if(laengerAlsFuenf && (enthaeltFrag || enthaeltAusr) && enthaeltGrossbuchstabe){
        println("Gültiges Passwort.")
    }else {
        println("Ungültiges Passwort.")
    }


    // Aufgabe Taschenrechner
    while (true){
        print("Erste Zahl: ")
        val zahl1: Double? = readln().toDoubleOrNull()
        print("Zweite Zahl: ")
        val zahl2: Double? = readln().toDoubleOrNull()
        print("Operator: ")
        val operator: String = readln()

        if(zahl1 == null || zahl2 == null)
            break
//            continue

        when (operator) {
            "+" -> println(zahl1 + zahl2)
            "-" -> println(zahl1 - zahl2)
            "*" -> println(zahl1 * zahl2)
            "/" -> {
                if (zahl2 != 0.0) {
                    println(zahl1 / zahl2)
                } else {
                    println("Man kann nicht durch 0 teilen!")
                }
            }
            else -> println("Ungültiger Operator")
        }
        println()
    }
}