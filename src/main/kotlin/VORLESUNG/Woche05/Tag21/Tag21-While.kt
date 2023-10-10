package VORLESUNG.Woche05.Tag21

fun main() {
    // Liste, über die wir mit Schleifen durchiterieren können
    val fruits = mutableListOf("Apples", "Oranges", "Cherries", "Watermelon", "Mango", "Strawberries")
    val colors = mutableListOf("red","green","blue","black")

    //simpleWhileUp()
    //simpleWhileDown()

    // Mango in der fruits Liste finden:
    findMango(fruits)
    findMango(colors)

    var mangoInList: Boolean = "Mango" in fruits


}

private fun findMango(list: MutableList<String>) {
    var i = 0
    var mangoFound: Boolean = false
    while (!mangoFound && i < list.size) { // inhalt der () muss true sein, sonst kommen wir nicht in den Schleifenkörper. mangoFound is false. heißt, es muss true sein, dass mangoFalse false ist
        println("${i + 1}.Gefundenes Element: ${list[i]}")
        // wenn das betrachtete obst = mango ist...
        if ("Mango" == list[i]) {
            println("Mango gefunden!")
            mangoFound = true
        }
        i++
    }
    println("Fruit Schleife beendet.")
    if (mangoFound) {
        println("Die Liste enthält eine Mango.")
    } else {
        println("Es gab keine Mango in der Liste...")
    }
}

private fun simpleWhileDown() {
    var i = 100
    println("wir zählen runter:")
    while (i >= 0) {
        Thread.sleep(500) // 500 millis = 1/2 sekunde, 1000 millis = 1 sek
        println(i)
        i--
    }
}

private fun simpleWhileUp() {
    var i = 1
    while (i <= 100) {
        println("${i}. Durchlauf: $i")
        i++ // ohne: Endlosschleife
    }
    println("i ist jetzt > 100, nämlich $i, daher sind wir aus der Schleife raus gesprungen")
}