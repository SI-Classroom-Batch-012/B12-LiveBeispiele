package VORLESUNG.Woche04.Tag17Verzweigungen

import com.sun.org.apache.xpath.internal.operations.Bool
import kotlin.math.exp

fun main() {

// Die wichtigsten Boolean-Operationen: Vergleichsoperationen
    // == : gleich. schreibt man zwischen 2 Variablen, gibt true zurück, wenn sie gleich sind
    val expectedUserName: String = "john_snow"
    val enteredUserName: String = readln()
    if (expectedUserName == enteredUserName){
        println("Erfolgreich eingeloggt, der eingegebene Username $enteredUserName ist identisch zum erwarteten Namen $expectedUserName")
    } else {
        println("Falscher Username....")
    }

    // != : ungleich. Schreibt man zwischen 2 Variablen, gibt true zurück, wenn sie NICHT gleich sind
    println("Passwort eingeben...")
    val enteredPasswort = readln()
    val actualPasswort = "1234"
    val inCorrectPasswort: Boolean = enteredPasswort != actualPasswort
    val correctPasswort: Boolean = enteredPasswort == actualPasswort


    // < : kleiner. gibt true zurück, wenn die Variable links vom < kleiner als die rechts ist
    var x: Boolean = 90 < 100 // true
    var y: Boolean = 90 < 101 // true
    if (x == y) {
        println("X und Y sind gleich, nämlich beide $x")
    } else{
        println("X ($x) und Y ($y) sind nicht gleich.")
    }


    // <= : kleiner-gleich. gibt true zurück, wenn die Variable links vom <= kleiner ODER GLEICH die rechte ist
    val price: Double = 22.0
    println("Gib dein Budget ein...")
    val budget: Double = readln().toDouble()
    val productAffordable: Boolean = price <= budget // true
    if (productAffordable){
        println("Du hast $budget Euro dabei, kannst dir also ein Produkt für $price Euro leisten")
    } else {
        println("Du hast $budget Euro dabei, kannst dir also ein Produkt für $price Euro NICHT leisten.")
    }

    // > : größer
    var ab18: Boolean = readln().toInt() > 18 // wenn man 18 eingibt false, da 18 nicht groößer als 18 ist, bräuchte <=

    val ab182: Boolean = readln().toInt() >= 18 // wenn man 18 eingibt true, da 18 groesseer/gleich 18 ist


// Verknüpfungsoperationen

    // Logisches UND: gibt true zurück, wenn beide Seiten true sind

    val hasAccount: Boolean = true
    val isLoggedIn: Boolean = true

    val hasProfilePicUploaded: Boolean = false

    val isUserActive: Boolean = hasAccount && isLoggedIn // true, sofern beide seiden vom && true sind
    val userHasPhoto: Boolean = hasAccount && hasProfilePicUploaded // false, da es kein Profilbild gibt


    // Logisches ODER: gibt true zurück, wenn mindestens eine der Seiten true ist
    val isWeekend: Boolean = false
    val isHoliday: Boolean = false
    val isFreeDay: Boolean = isWeekend || isHoliday // false, da beides false ist
    println("Ist es Wochenende? $isWeekend, Ist es ein Feiertag? $isHoliday --> haben wir frei? $isFreeDay")

    // Logisches NICHT: macht den Boolean, vor den man es schreibt, zum Gegenteil.
    var isRaining: Boolean = true
    var isNotRaininn: Boolean = !isRaining



    // Logisches XOR: gibt true zurück, wenn genau 1 der Seiten true ist


    // in Operator: gibt true zurück, wenn ein Element IN einem String, Liste, Range, etc vorhanden ist:
    val gesuchtesElement: Int = 9
    val list = listOf(1,2,4,7,8,9,5,3)
    var neunInList = gesuchtesElement in list // true, 9 kommt in liste vor alternative: list.contains(gesuchtesElement)
    print(neunInList)




}