package VORLESUNG.Woche08

import kotlin.math.roundToInt

fun roundToTwoDecimalPlaces(value: Double): Double {
    return (value * 100.0).roundToInt() / 100.0
}

fun main() {
    println(roundToTwoDecimalPlaces(10.938497))

}