package VORLESUNG.Woche03

import kotlin.math.PI
import kotlin.math.roundToInt

fun main(){
    printGreeting()
    println("Es folgt der Funktionsaufruf von calculateAge()")
    calculateAge()
    println("Funktionsaufruf beendet.")
    radiusToSurface()

}

// greeting
fun printGreeting() {
    println("Hi, wie ist dein Name?")
    val name: String = readln()
    println("Soso, dein name ist also $name. Hallo!")
}



