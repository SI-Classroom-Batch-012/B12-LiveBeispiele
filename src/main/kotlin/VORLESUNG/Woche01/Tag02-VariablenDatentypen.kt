package VORLESUNG.Woche01


fun main(){
    // Variable neu anlegen: Schlüsselwort var
    var firstName: String = "Ron"
    println(firstName)
    // Variable aktualisieren: einfach über den Variablennamen
    firstName = "Harry"
    //println(firstName)

    //println("Harry") <- mann kann auch einen String, der nicht in Variable verpackt ist, drucken

    var lastName: String = "Potter"

    // Harry Potter drucken
        // 1. Variante
        println("$firstName $lastName")

        // 2. Variante
        print(firstName)
        print(" ")
        print(lastName)
        println()

        // 3. Variante
        println(firstName + " " + lastName)


    // Konstanten: Variablen, die NICHT veränderbar sind
    val weekDays: Int = 7
    // weekDays = 8 // <-- zum ausprobieren Einkommentieren, funktioniert nicht

    val pi: Double = 3.14 // Pi ist eine mathematische Konstante

    // Ergebnis von readln() in Variable speichern
    println("Bitte gib ein Wort ein...")
    val input: String = readln()
    println("Dein Wort: $input")


    // DATENTYPEN
        // String
        var greeting: String
        // 100 Zeilen Code möglich
        greeting = "Hi"

        println(greeting)

        // Integer: Int
        var age: Int = 30
        println("Mein Alter ist: $age")
        var calc: Int = 10 + 13 // 23
        println("Ergebnis der Rechnung 10 + 13 = $calc")

        // In einer Variable können auch andere Variablen bzw deren Ergebnis gespeichert werden
        var calcWithVariables: Int = calc + age
        println("Rechung: $age + $calc ergibt $calcWithVariables")

        // Double
        val number: Double = 9.0
        val calcDouble: Double = 10.0 - 3.0
        val calcDouble2: Double = number + age

        // Boolean
        var isItRaining: Boolean = true
        println("Is it Raining? -> $isItRaining")
        // die Sonne kommt raus, es regnet nicht mehr
        isItRaining = false
        println("Is it Raining? -> $isItRaining")


        var alter: Int = 30
        // jedes Jahr wird die Person älter
        alter = alter + 1








}

