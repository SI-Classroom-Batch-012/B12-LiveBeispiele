package VORLESUNG.Woche03.Tag14Kdocs

fun main() {

    // Compilerfehler
    //val number: Int = "Hello"  // Fehler: Typeninkompatibilität, da String nicht in einen Int umgewandelt werden kann
    //println(number)

    // Exception produzieren: Double mit readln()
    println("Bitte Kommazahl eingeben...")
    // Beispiel von StackOverflow: "1,234" to get 1.234 than: p = p.replaceAll(",",".");
    var input = readln().replace(",",".").toDouble()

    println("Eingegebene Kommazahl: $input")
    var stringInput = input.toString().replace(".",",")
    println(input)
    println("Kommazahl wieder zum String gemacht: $stringInput")




}
