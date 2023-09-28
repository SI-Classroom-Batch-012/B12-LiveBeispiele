package VORLESUNG.Woche03.Tag14Kdocs

fun main() {
    println(calculateAge())

    val ageBornIn90: Int = calculateAge(1990)
    println(ageBornIn90)

    println("Im Jahr 2050 bist du ${ageBornIn90+27} Jahre alt")

}

/**
 * Berechnet das Alter einer Person basierend auf dem Geburtsjahr.
 *
 * @param birthYear Das Geburtsjahr der Person. Standardwert ist 2000.
 * @return age Das Alter der Person.
 */
fun calculateAge(birthYear: Int = 2000): Int {
    var age = 2023-birthYear
    return age
}
