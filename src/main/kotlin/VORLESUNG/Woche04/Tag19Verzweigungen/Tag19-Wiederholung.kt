package VORLESUNG.Woche04.Tag19Verzweigungen


// if else: alter

fun randomBoolean(): Boolean {
    var x = listOf(true,false).random()
    println(x)
    return x
}


// when: mit return type - seasons

fun seasons(month: Int): String {
    // Programm, dass mir je nach eingegeber Zahl die passende Jahreszeit zurückgibt: 1,2,12 = Winter, 3,4,5 Frühling, 6,7,8 Sommer, 9 10 11 Herbst

    when(month){
        1,2,12 -> return "Winter"
        in 3..5 -> return "Frühling"
        in 6..8 -> return "Sommer"
        in 9..11 -> return "Herbst"
        else -> return "ungültige Eingabe"
    }

}

fun main(){

    var jahreszeit: String = seasons(9)

    println("Bitte Alter eingeben...")
    val alter = readln().toIntOrNull()

    if (alter != null) {
        if (alter >= 18) {
            println("Du bist alt genug, komm rein...")
            println("....")
        } else {
            println("Du bist zu jung, werd erstmal erwachsen.")
        }
    } else println("Du hast etwas eingegeben, was zu null führt...")

    if(randomBoolean()){
        println("Der zufällige Wert ist true")
    } else {
        println("Der zufällige Wert ist false")
    }

    var list = listOf(1,2,3)
    var sndList = list
    var thrdList = listOf(1,2,3)

    println("Listenreferenzen gleich?") // === bedeutet: gleiche Referenz
    println(list === sndList) // true, sndList verweist auf die gleiche Stelle im Speicher
    println(list === thrdList) // false, thrdList ist eine andere Liste trotz gleichem Inhalt
    println(list == thrdList) // true, weil gleicher Listeninhalt

}


