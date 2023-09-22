package VORLESUNG.Woche02

fun main(){

// LISTEN
    println("----Listen----")
    // mutable Liste anlegen
    val primeNumbers: MutableList<Int> = mutableListOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    println("PrimeNumbers vor dem Löschen des 1. Elements:")
    println(primeNumbers)

    // 1. erstes Element in Variable speichern
    var firstPrime: Int = primeNumbers[0] // hier steht die 2 drin
    // 2. erstes Element löschen: Element angeben
    //primeNumbers.remove(firstPrime) // die 2 übergeben als das Element, das gelöscht werden soll
    //println("PrimeNumbers nach dem Löschen des 1. Elements:")
    //println(primeNumbers)
    // erstes Element löschen: Index angeben
    //primeNumbers.removeAt(0)
    // 7 rausnehmen: primeNumbers.removeAt(3) (über den Index) oder primeNumbers.remove(7) (über das Element)
    //println("PrimeNumbers nach dem Löschen des neuen 1. Elements:")
    //println(primeNumbers)

    // mehrere Elemente gleichzeitig löschen: removeAll
    //primeNumbers.removeAll(listOf(11,13,29))
    //println(primeNumbers)

    // removeFirst(): efferent das 1. Element und gibt es zurück = man kann es in Variable speichern
    var firstNumber: Int = primeNumbers.removeFirst()
    println("mit removeFirst in firstNumber gespeichert: $firstNumber")
    println(primeNumbers)


    // dieses Element zu einer anderen Liste hinzufügen
    var newList: MutableList<Int> = mutableListOf()
    newList.add(firstNumber)
    println("Neue Liste: " + newList)
    newList.add(primeNumbers[0])
    println("Neue Liste mit weiterer Zahl (nach add): " + newList)


    // Zufälliges Element löschen:
    // 1. Variante:
        // 1. zufälliges Element auswählen,
        var randomPrime: Int = primeNumbers.random()
        // 2. löschen
        primeNumbers.remove(randomPrime)
    // 2. Variante in einem Schritt: Funktionsaufruf an remove übergeben
        primeNumbers.remove(primeNumbers.random())


    // mehrere Elemente miteinander addieren



    // Liste random durchmischen, drucken




// MAPS
    println("----Maps----")
    // mutable Map anlegen
    val primeMap: MutableMap<String,Int> = mutableMapOf(
        "1. Primzahl" to 2,
        "2. Primzahl" to 3,
        "3. Primzahl" to 5,
        "4. Primzahl" to 7,
        "5. Primzahl" to 11,
        "6. Primzahl" to 13,
        "7. Primzahl" to 17,
        "8. Primzahl" to 19,
        "9. Primzahl" to 23,
        "10. Primzahl" to 29
    )


    // Primzahlen aus der Map addieren




    // Komplexere Map, die je einen Key auf eine Liste an Values mappt:
    println("---- Map, in der String auf Liste an Strings gemappt ist ----")
    var lordeList: MutableList<String> = mutableListOf("Royals", "Ribs", "Solar Power")
    var music: MutableMap<String,MutableList<String>> = mutableMapOf(
        "Taylor Swift" to mutableListOf("Blank Space", "Shake It Off", "Anti-Hero"),
        "Lorde" to lordeList,
        "Die Ärzte" to mutableListOf("Schrei nach Liebe", "Hurra", "1/2 Lovesong")
    )

//    println(music)
//    println(music.keys)
//    println(music.values)

    // Operationen an Listen in Maps
    // Element hinzufügen

    // Element entfernen


    // neuen Key und Value in die Map einfügen

    // Key und dessen Value entfernen

    // Existiert ein bestimmter Key?

    // existiert ein bestimmes Element im Value eines Keys?




}