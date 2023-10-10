package VORLESUNG.Woche05.Tag22

fun main() {

    // repeat
   // useRepeat(100)

    // while: Counter hochzählen
    whileSchleife()

    // do While
    //doWhilePasswort()


    // Unterschied do while / while
    // while: Bedingung muss stimmen, sonst kommen wir niemals in die Schleife
    var i = 10
    while (i < 10) {
        println("$i ist < 10")
        i++
    }

    // do while: wird immer mind 1x ausgefuehrt, auch wenn die Bedingung nicht true ist
    do {
        println("$i ist < 10")
        i++
    } while (i < 10)

    // Fehler abfangen: falls bei doWhilePasswort kein int eingegeben wird
    // Schleifenvariable: wir kommen nur aus der Schleife raus, wenn passwordWrong = true ist. sonst springen wir immer wieder zurück
    var passwordWrong = true
    while (passwordWrong){
        try {
            doWhilePasswort()
            passwordWrong = false
        } catch (e: Exception){
            println("Fehler! $e")
            // throw e wirft den Fehler
        }
    }


}

fun doWhilePasswort() {
    // user will sich einloggen, darf 3x versuchen, wird danach ausgesperrt.
    // variablen, die folgendes darstellen:
    // anzahl versuche,
    var anzahlVersuche: Int = 0
    // maximale anzahl an versuchen,
    var maxAnzahlVersuche: Int = 3
    // wurde passwort richtig eingegeben
    var passwortRichtig: Boolean = false

    // logik: eingabe des Users pruefen.
    do {
        println("passwort eingeben...")
        val passwort = readln().toInt()
        // prüfen: ist das passwort korrekt?
        if (passwort == 1234) {
            println("Passwort ist korrekt! Willkommen.")
            passwortRichtig = true
        } else {
            println("Falsches Passwort, bitte nochmal versuchen...")
        }
        anzahlVersuche++

    } while (anzahlVersuche < maxAnzahlVersuche && !passwortRichtig) // !passwortRichtig ist das gleiche wie passwortRichtig == false

    if (anzahlVersuche >= maxAnzahlVersuche) {
        println("Du hast das Passwort $anzahlVersuche male falsch eingegeben, Login gesperrt....")
    }
}

fun whileSchleife() {
    var i: Int = 0
    while (i <= 10) {
        println("$i gefunden, wird verdoppelt...")
        i = i*2
        println(i)
        i++
    }
}

fun useRepeat(i: Int) {
    repeat(i){
        println("${it+1}. Durchlauf: $it")
    }
}


