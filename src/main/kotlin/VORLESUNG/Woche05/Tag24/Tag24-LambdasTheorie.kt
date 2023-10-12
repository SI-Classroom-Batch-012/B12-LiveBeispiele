package VORLESUNG.Woche05.Tag24

fun greaterFive(nr: Int): Boolean {
    val result: Boolean = nr > 5
    println("$nr is greater than 5? -> $result")
    return result
}

fun main() {
    // Aufruf von greaterFive
    greaterFive(9)

    // Gegenüberstellung: greaterFour als Lambda
    // Lambda kann in einer Variable gespeichert werden:
    var greaterFour = { nr:Int -> (nr>4) }

    // Lambda mit println: kein Einzeiler mehr
    var greaterSix = { nr:Int ->
        val isGreater = (nr>6)
        println("Ist die Zahl $nr > 6? -> $isGreater")
    }

    var three = greaterFour(3)
    println("Ist three groesser als 4? -> $three")

    var seven = greaterSix(7)

    // Lambda, das Int zurück gibt
    var addNrWithTwo = { nr: Int -> nr+2 }

    val x = addNrWithTwo(10)

    val planets = listOf("Mein ", "Vater ", "erklaert ", "mir ", "jeden ", "Sonntag ", "unsere ", "neun ", "Planeten")
    // Planeten Liste mit for-Schleife durchgehen

    for (planet in planets){
        println(planet)
    }

    println("---- Lambda aufruf in Higher Order Function: ----")
    // Gegenüberstellung
    // Planeten Liste mit ForEach Lambda:
    planets.forEach {
        println(it)
    }

    // lange Variante:
    planets.forEach { planet ->
        println(planet)
    }





}