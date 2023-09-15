package VORLESUNG.Woche01

import kotlin.math.PI

fun main(){

    // Tag 1: IntelliJ, Github
        // Wie pulle ich ein neues Projekt?
            // im Browser auf Github auf das Projekt, das gepullt werden soll -> rechts auf den Code-Button klicken -> Link kopieren -> in IntelliJ: File > New > Project from Version Control

        // Wie pulle ich in ein vorhandenes Projekt?
            // oben auf Git > Pull > Pull

        // Wie mache ich einen Commit?
            // Links auf den Github Reiter (unter dem Ordner)
            // Dateien auswählen
            // vernünftige Commit Message schreiben, die beschreibt, was ihr gemacht habt
            // commit und push

        // Was ist die beste Vorgehensweise bei Commits?
            // Warnungen ignorieren
            // jede Aufgabe einzeln committen
            // generell: mehrere kleine Commits, statt einen riesigen -> dann findet man einzelne Zwischenschritte besser
            // später beim App Entwickeln: pro Feature (bzw je nach Umfang auch in einzelne Teilschritte aufteilen)



    // Tag 2: Variablen und Datentypen

        // Wann MUSS ich den Datentypen angeben? -> wenn eine leere Variable angelegt wird, kann der Compiler nicht aus dem Kontext/Inhalt erschließen, um welchen Datentypen es sich handelt.
        var firstName: String = "Dominik"

        // String
        var city: String = "Herne"
        println("$firstName lebt in $city.")
        firstName = "Markus"
        city = "Wissmar"
        println("$firstName lebt in $city.")

        // Wann kann ich NICHT neue Werte in eine Variable speichern, nachdem sie angelegt wurde? -> Konstante
        val syntaxCity: String = "Berlin"
    //syntaxCity = "Hamburg" // einkommentieren für Compilerfehler, weil Konstanten (val) nicht veränderbar sind

        // Int -> Integer, ganze Zahl ohne Nachkommastellen
        val thirty: Int = 30
        // Int Rechnung
        val birthYear: Int = 1990
        val currentYear: Int = 2023

        // man kann auch das Ergebnis einer Rechnung in eine Variable speichern
        val ageCalc = currentYear - birthYear
        println("Wenn du $birthYear geboren bist und wir gerade das Jahr $currentYear haben, bist du $ageCalc Jahre alt.")



        // Double -> Zahl mit Nachkommastellen, präziser als Int
        // Umfang Kreis: 2 * r * PI
        val radius = 9.0
        val umfang: Double = 2 * radius * PI // mit Ints und Doubles gemeinsam rechnen: ergibt Double
        println("Der Umfang eines Kreises mit dem Radius $radius ist $umfang")

        // Boolean -> true oder false, Wahrheitswert. Brauchen wir später sehr oft, gerade noch nicht so
        var isFriday: Boolean = true
        isFriday = false
        val isNiceDay: Boolean = true
        // Variable in eine andere Variable schreiben
        isFriday = isNiceDay // isFriday ist jetzt true, weil isNiceDay true ist




    // Tag 3: Operationen und Typkonvertierung

        // Rechnen
        // siehe oben mit radius etc

        // Typ konvertieren: QuadratRechner Programm, Formel: Seitenlänge * Seitenlänge
        print("Hi, bitte eine Seitenlänge eingeben, um die Fläche eines Quadrats zu berechnen... \n") // \n -> bedeutet Zeilenumbruch, brauchen wir bei println nicht weil da ein Zeilenumbruch automatisch drin ist
        val side = readln().toDouble()
        val result = side*side
        println("Die Flaäche eine Quadrats mit seitenlänge $side ist $result")


        // String-Konkatenation (Verkettung) und Interpolation (escapen mit $)
        var string1: String = "Hello "
        var string2: String = "World!"
        //Variante 1
        println("1. Variante:" + string1+string2)
        // Variante 2
        println("2. Variante: "+ string1+ " " + string2)
        // Variante 3
        println("3. Variante: $string1$string2")
        println("4. Variante: ${string1+string2}")


    // Tag 4: Debugging

    firstName = "Simon"
    city = "Hamburg"
    println("$firstName lebt in $city.")



}
