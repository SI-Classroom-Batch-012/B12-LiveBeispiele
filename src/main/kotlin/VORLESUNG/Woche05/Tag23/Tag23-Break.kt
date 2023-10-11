package VORLESUNG.Woche05.Tag23
fun main() {
    // Break mit Liste
    val animals: List<String> = listOf("Tiger", "Löwe", "Gepard", "Maus", "Leopard", "weißer Tiger")

    // findMouseInList mit for Schleife
   // findMouse(animals)

    // continue beispiel: tiere drucken, die keine tiger sind
    for (a in animals){
        if (a.contains("Tiger")){
            continue
        } else {
            println("Dieses Tier ist kein Tiger: $a")
        }
    }



    // Break mit Map: selbes Prinzip, aber gesteigerte Komplexität
    val animalMap = mapOf(
        "Tiger" to true,
        "Maus" to false,
        "Löwe" to true,
        "Leopard" to true,
        "Gepard" to true,
    )
    println("-------")

    // findMouseInMap
    // wiederhole: durch map durchgehen, sowohl key als auch value ansprechen
    findMouseMap(animalMap)


    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    //findSeven(numbers)

    println("-------")
    chess()

}

private fun findMouseMap(animalMap: Map<String, Boolean>) {
    for ((tier, status) in animalMap) {
        // wenn animal keine maus ist (= status ist true)
        if (status == true) {
            // tier drucken
            println("$tier gefunden, das keine Maus ist")
        } else {
            println("Maus gefunden! Schleife abbrechen...")
            break
        }
    }
}

private fun findMouse(animals: List<String>) {
    for (tier in animals) {
        if (tier == "Maus") {
            println("Maus gefunden! Schleife abbrechen...")
            break
        }
        println("Tier, das keine Maus ist: $tier")
    }
}

fun findSeven(numbers: List<Int>) {
    var i = 0
    while (i < numbers.size) {
        if (numbers[i] == 7) {
            println("7 an stellt $i gefunden! Abbrechen...")
            break
        }
        println("An der Stelle $i steht keine 7. Die Zahl ist: ${numbers[i]}")
        i++
    }
}

// 3. Schachbrett: Abbrechen, sobald wir bei H8 sind

fun chess(){
    var abc: CharRange = 'A'..'Z'

    for (letter in abc){
        if (letter > 'H'){
            break
        }
        for (number in 1..8) {
            print("$letter$number")
        }
        println("")
    }
}


fun doWhilePasswortMitBreak() {
    // user will sich einloggen, darf 3x versuchen, wird danach ausgesperrt.
    // variablen, die folgendes darstellen:
    // anzahl versuche,
    var anzahlVersuche: Int = 0
    // maximale anzahl an versuchen,
    var maxAnzahlVersuche: Int = 3
    // wurde passwort richtig eingegeben

    // logik: eingabe des Users pruefen.
    do {
        println("passwort eingeben...")
        try {
            val passwort = readln().toInt()
            // prüfen: ist das passwort korrekt?
            if (passwort == 1234) {
                println("Passwort ist korrekt! Willkommen.")
                break
            } else {
                println("Falsches Passwort, bitte nochmal versuchen...")
            }
            anzahlVersuche++
        } catch (e: Exception){
            println("Fehler in doWhilePasswort(): $e")
            throw e
        }

    } while (anzahlVersuche < maxAnzahlVersuche) // !passwortRichtig ist das gleiche wie passwortRichtig == false

    if (anzahlVersuche >= maxAnzahlVersuche) {
        println("Du hast das Passwort $anzahlVersuche male falsch eingegeben, Login gesperrt....")
    }
}


