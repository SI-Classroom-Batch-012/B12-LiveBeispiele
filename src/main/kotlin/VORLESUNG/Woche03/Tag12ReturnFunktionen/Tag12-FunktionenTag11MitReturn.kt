package VORLESUNG.Woche03.Tag12ReturnFunktionen

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToInt


fun main(){
    var age = calculateAgeReturn()
    println("Println in der main: auch hier kommen wir an age ($age) dran.")

    var name = getName()
    println("Das Ergebnis von getName ist $name")


    println("Das Ergebnis von getSurface ist ${getSurface()}")

    println("Umfang des Kreises: ${getUmfang()}")

}

/**
 * Berechnet das Alter des Users basierend auf dessen Geburtsjahr
 * @return das Ergebnis von 2023-birthYear
 */
fun calculateAgeReturn(): Int {
    println("Please enter birth year...")
    // user soll geburtsjahr eingeben
    val birthYear: Int = readln().toInt()
    // daraus soll alter errechnet und ausgegeben werden
    val age: Int = 2023-birthYear
    println("You were born in $birthYear, your age in 2023 is: $age")
    return age

}

/**
 * Liest einen Namen ein und druckt diesen mit einem Gruß aus
 * @return name, der eingegebene Name
 */
fun getName(): String {
    println("Hi, wie ist dein Name?")
    val name: String = readln()
    println("Soso, dein name ist also $name. Hallo!")
    return name
}

/**
 * Berechnet die Fläche eines Kreises anhand des vom User eingegebenen Radius
 * @return flaeche, das Ergebnis von radius*radius*PI
 */
fun getSurface(): Double {
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
    return flaeche

}

/**
 * Berechnet den Umfang eines Kreises basierend auf dem eingegebenen Radius.
 * @return Der berechnete Umfang des Kreises.
 */
fun getUmfang(): Double {
    println("Bitte Radius deines Kreises eingeben...")
    val radius: Double = readln().toDouble()
    var result: Double = 2*radius* PI
    // result runden:
    result = (result*100).roundToInt() / 100.0
    println("Der Umfang des Kreises ist: $result")
    return result
}
