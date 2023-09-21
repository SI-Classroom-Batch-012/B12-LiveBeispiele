package VORLESUNG.Woche02

fun main() {
    // Erzeugung von Strings
    val greeting: String = "Hallo, Kotlin!"
    val firstName: String = "Jonas"
    val age: Int = 30

    // String-Interpolation
    val message: String = "Mein Name ist $firstName und ich bin $age Jahre alt."


    // String-Länge
    val lengthMessage: Int = message.length


    // Zeichen in einem String abrufen
    var firstLetter: Char = message.first()
    // ein einzelnes Zeichen hat den Datentyp Char, Char steht für Character also Buchstabe
    var char: Char = 'B'
    var lastLetter: Char = message[message.length-1] // Arbeit mit dem Index ist bei Strings möglich


    // Teil eines Strings extrahieren (AUSschließlich der 2. Zahl)
    val firstWord: String = message.substring(0,4)
    println(firstWord)


    // Strings vergleichen
    val isEqual: Boolean = greeting == message // sind greeting und message gleich? wenn ja -> true, wenn nein -? false

    // Strings verketten
    val chained: String = greeting + " " + message


    // Strings in Groß- oder Kleinbuchstaben umwandeln
    val uppercase: String = chained.uppercase()
    val lowercase: String = chained.lowercase()


    // Prüfen, ob ein String leer ist oder nicht
    val isEmpty: Boolean = chained.isEmpty()

    // Prüfen, ob ein String einen anderen String enthält (contains)
    val containsHello: Boolean = chained.contains("Hallo")
    val containsBanana: Boolean = chained.contains("Banane")

    println()



    // Ersetzen von Teilen eines Strings
    val replaced: String = chained.replace("Jonas","Marianne")
    println(replaced)


    // Aufteilen eines Strings in Teile am übergebenen Element, gibt eine Liste mit den 2 rauskommenden Strings zurück
    val parts: List<String> = chained.split(" ")
    println(parts)
    println(parts[0])
    println(parts[1])
    println(parts[2])


    // Entfernen von Leerzeichen am Anfang und Ende eines Strings



    // Überprüfen, ob ein String leer oder null ist


    // Wiederholen eines Strings


    // Ausgabe

}
