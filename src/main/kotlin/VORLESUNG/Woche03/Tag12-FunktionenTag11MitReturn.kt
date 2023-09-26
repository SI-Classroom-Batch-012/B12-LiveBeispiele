package VORLESUNG.Woche03

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToInt

fun main(){


}

fun calculateAgeReturn(){
    println("Please enter birth year...")
    // user soll geburtsjahr eingeben
    val birthYear: Int = readln().toInt()
    // daraus soll alter errechnet und ausgegeben werden
    val age: Int = 2023-birthYear
    println("You were born in $birthYear, your age in 2023 is: $age")
}


fun getGreeting() {
    println("Hi, wie ist dein Name?")
    val name: String = readln()
    println("Soso, dein name ist also $name. Hallo!")
}

fun getSurface(){
    println("Bitte gib den Radius deines Kreises ein:")
    // user gibt radius ein
    val radius: Double = readln().toDouble()
    // flaeche daraus berechnen
    var flaeche: Double = radius.pow(2)* PI // oder: radius*radius*PI
    // flaeche runden
    // Variante 1:
    flaeche = (flaeche*100).roundToInt() / 100.0
    // Variante 2:
    // var stringFlaeche: String = String.format("%.2f",flaeche)
    // println(stringFlaeche)
    // ergebnis ausdrucken
    println("Die Fläche deines Kreises mit einem Radius von $radius beträgt $flaeche")

}

fun getUmfang(){
    println("Bitte Radius deines Kreises eingeben...")
    val radius: Double = readln().toDouble()
    var result: Double = 2*radius* PI
    // result runden:
    result = (result*100).roundToInt() / 100.0
    println("Der Umfang des Kreises ist: $result ")
}
