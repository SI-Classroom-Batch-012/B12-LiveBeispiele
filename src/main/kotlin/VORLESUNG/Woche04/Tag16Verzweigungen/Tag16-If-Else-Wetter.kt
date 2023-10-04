package VORLESUNG.Woche04.Tag16Verzweigungen

fun main() {
    val regen = false
    val wind = false
    val sonne = false

    // if-else Verzweigungen
    if (regen) {
        println("Ohje, nimm besser deinen Regenschirm mit!")
    } else {
        println("Du musst dir keine Sorgen machen, es wird heute nicht nass.")
    }

    if (wind) {
        println("Es ist so stürmisch! Pack dir deine Windjacke ein!")
    } else {
        println("Was ein Glück! Die Sturmmeldung bleibt heute aus.")
    }

    // Verknüpfte Bedingungen
    if (regen && !sonne && wind) {
        println("Mist. Regen und keine Sonne und Wind, was ein schreckliches Wetter.")
    }


    // if-elseif-Verzweigungen
    if(sonne) {
        println("Mhhh wie schön, endlich etwas Sonnenschein.")
    } else if (regen) {
        println("Na prima, dann wohl doch der Regenschirm.")
    } else if (wind) {
        println("Brruhh, ich spüre den Wind überall!")
    } else {
        println("In den Else-Teil komme ich nur, wenn alles vorher false war.")
    }


    // Unterschiedliche Möglichkeiten Bedingungen zu formulieren
    val mail = "markus@macht.de"

    if(mail.contains('@') && (mail.endsWith(".de") || mail.endsWith(".com"))) {
        println("MAIL")
    }

    val alter = 18
    if(alter >= 18) {
        println("Du darfst den Kurs ab 18 besuchen.")
    } else {
        println("Du musst leider noch warten.")
    }

    // when-Verzweigung
    val anzahlGaeste = readln().toInt()

    when(anzahlGaeste) {
        0 -> {
            println("Hast du überhaupt schon jemanden eingeladen?")
        }
        1,2,3,4,5,6,7,8,9 -> {
            println("Das ist eine angenehme Zahl, nicht zu groß.")
        }
        10 -> {
            println("Wow! Das ist die perfekte Party!!!")
        }
        else -> {
            println("Okay, wir brauchen definitiv eine größere Location!")
        }
    }

    val aktion = readln().toInt()

    when(aktion) {
        1 -> {
            println("Kontostand anzeigen")
        }
        2 -> {
            println("Geld abheben")
        }
    }

    val aufgabe = readln()

    when(aufgabe) {
        "abheben" -> {
            println("Du kannst jetzt Geld abheben.")
        }
        "einzahlen" -> {
            println("Du kannst jetzt Geld einzahlen.")
        }
        else -> {
            println("Diese Aktion steht leider nicht zur Verfügung.")
        }
    }
}


























    //val anzahlGaeste = 10

    /*
    when(anzahlGaeste) {
        1,2,3,4,5,6,7,8,9 -> {
            println("Wir müssen noch mehr Leute einladen!")
        }
        10 -> {
            println("Das ist die perfekte Party!")
        }
        else -> {
            println("Oh Oh, wir brauchen einen größeren Raum!")
        }
    }
     */


