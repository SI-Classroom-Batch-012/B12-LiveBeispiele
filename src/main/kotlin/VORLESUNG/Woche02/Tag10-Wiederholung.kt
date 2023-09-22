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
    println("Zufällig ausgewählte Zahl: $randomPrime")
    println("primeNumbers ohne diese Zahl: $primeNumbers")
    // 2. Variante in einem Schritt:
        // Funktionsaufruf an remove übergeben, statt das Ergebnis davon erst in eine Variable zu speichern
        primeNumbers.remove(primeNumbers.random())

    // mehrere Elemente miteinander addieren
    var number: Int = primeNumbers[0]
    var number2: Int = primeNumbers[1]
    var firstThreePrimesAdded: Int = number + number2 + primeNumbers[2]
    println("Addition der ersten 3 verbleibenden Primzahlen aus primeNumber (also $number + $number2 + ${primeNumbers[2]}) = $firstThreePrimesAdded")

    // Liste umgekehrt speichern
    println("reversed:")
    primeNumbers.reverse()
    println(primeNumbers)

    // Liste random durchmischen, drucken
    println("shuffle:")
    primeNumbers.shuffle()
    println(primeNumbers)



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
    println(primeMap)


    // Primzahlen aus der Map addieren
    var lastTwoPrimesAdded: Int = 0 // darf nicht nullable sein, denn dann kann man nicht damit rechnen
    lastTwoPrimesAdded = lastTwoPrimesAdded + primeMap["9. Primzahl"]!! // !! -> "keine sorge ist auf keinen Fall null"
    println("LastTwoPrimesAdded: 1. Schritt 0 + ${primeMap["9. Primzahl"]} = $lastTwoPrimesAdded")
    var prim10: Int? = primeMap["10. Primzahl"]
    lastTwoPrimesAdded = lastTwoPrimesAdded + prim10!!
    println("LastTwoPrimesAdded: 2. ${primeMap["9. Primzahl"]} + $prim10 = $lastTwoPrimesAdded")







    // Komplexere Map, die je einen Key auf eine Liste an Values mappt:
    println("---- Map, in der String auf Liste an Strings gemappt ist ----")
    var lordeList: MutableList<String> = mutableListOf("Royals", "Ribs", "Solar Power")
    var music: MutableMap<String,MutableList<String>> = mutableMapOf(
        "Taylor Swift" to mutableListOf("Blank Space", "Shake It Off", "Anti-Hero"),
        "Lorde" to lordeList,
        "Die Ärzte" to mutableListOf("Schrei nach Liebe", "Hurra", "1/2 Lovesong")
    )

    println(music)
    println(music.keys)
    println(music.values)

    // Operationen an Listen in Maps
    // Element hinzufügen
    // put: überschreibt vorherige Werte, geht also nicht
    //music.put("Taylor Swift", mutableListOf("Karma"))
    //println(music["Taylor Swift"])
    // set geht ebenfalls nicht, überschreibt auch alles andere
    //music.set("Taylor Swift", mutableListOf("Lavender Haze"))
    println(music["Taylor Swift"])

    var karmaAdded: Boolean = music["Taylor Swift"]!!.add("Karma")
    println("Karma erfolgreich hinzugefügt? -> $karmaAdded")
    println(music["Taylor Swift"])
    music["Taylor Swift"]!!.addAll(listOf("Lavender Haze", "Out of the Woods", "Style", "Snow at the Beach"))
    println(music["Taylor Swift"])


    // Element entfernen: Royals aus Lorde entfernen
    // music.remove("Lorde") -> entfernt Lorde komplett, wir wollen aber nur einen Song von ihr entfernen
    music["Lorde"]!!.remove("Royals")
    println(music["Lorde"])


    // neuen Key und Value in die Map einfügen
        // 1. Variante
        music.put("Michael Jackson", mutableListOf("Billie Jean", "Thriller", "Earth Song"))
        println(music)
        // 2. Variante: wenn der key nicht existiert, wird automatisch ein neuer Eintrag erstellt
        music["Adele"] = mutableListOf("Hello", "Someone Like You", "Rolling in the Deep")
        println(music)


    // Key und dessen Value entfernen
    music.remove("Michael Jackson")
    println(music)

    // Existiert ein bestimmter Key?
    val michaelExists: Boolean = music.containsKey("Michael Jackson")
    println("Gibt es Michael Jackson noch? -> $michaelExists")

    // exisitert ein Value, also eine Liste an bestimmten Songs, in music?
    val allSongsExists: Boolean = music.containsValue(mutableListOf("Surprise Me", "Rumors")) // existiert nicht, false

    // existiert ein bestimmes Element im Value eines Keys?
    val songExists: Boolean = music["Taylor Swift"]!!.contains("Style")
    println("Existiert Style in der Taylor Swift Values Liste? -> $songExists")

}