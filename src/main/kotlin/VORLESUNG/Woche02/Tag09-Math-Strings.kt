package VORLESUNG.Woche02

import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt


fun main(){

    // Kotlin.Math Package
    // sqrt -> square root, Wurzel. zB: 7*7 bzw 7^2 ist 49, heisst die Wurzel von 49 ist 7
    var root: Double = sqrt(49.0)
    println("Die Wurzel aus 49 ist $root")


    // pow -> to the power of, zB 3 hoch 2 ist 9 3^2 (^ = hoch)
    var result: Double = 7.0.pow(2) // hier wird 7 hoch 2 also 7^2 gerechnet.
    println("Das Ergebnis von 7 hoch 2 ist = $result")

    //min und max

    println("Bitte 2 Zahlen eingeben")
    var x: Int = readln().toInt()
    var y: Int = readln().toInt()

    var maximum: Int = max(x,y)
    println("Die größere Zahl zwischen $x und $y ist $maximum")
    var minimum: Int = min(20,99)
}