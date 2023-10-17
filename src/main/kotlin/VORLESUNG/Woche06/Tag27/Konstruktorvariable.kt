package VORLESUNG.Woche06.Tag27

class Person(var firstName: String, var lastName: String) {


    // gehoert zum primaeren Konstruktor dazu
    init {
        // init logik, wird immer aufgerufen, sobald eine Instanz Person erstellt wird
        println("Person mit 1. Konstruktor instanziiert!")
    }

    constructor(firstName: String): this(firstName,"Default Last Name"){
        // init logik
        println("Person namens $firstName mit dem sekundaeren Konstruktor instanziiert!")
    }

}

fun main() {
    var person: Person = Person("Max", "Mustermann")
    var sekundaerePerson = Person("Lars")
    println(sekundaerePerson.firstName)
    println(sekundaerePerson.lastName)

}

