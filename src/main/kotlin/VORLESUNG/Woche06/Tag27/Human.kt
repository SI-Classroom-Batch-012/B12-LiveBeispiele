package VORLESUNG.Woche06.Tag27

// Wiederholung: Klasse Human (Mensch) ohne Konstruktor mit Default Werten
// var variable: Datentyp --> normale Variable
// variable: Datentyp (ohne var davor) --> Konstruktorvariable, temporär, nicht außerhalb des Konstruktors oder der Klasse erreichbar
class Human(var name: String, var age: Int) {


    // init Block wird immer beim Instanziieren einer Klasse ausgefuehrt
    init {
        println("Instanz der Klasse Human namens $name erstellt!")
        if (age >= 18){
            println("Diese Instanz der Klasse Human ist volljährig, $age Jahre alt")
        } else {
            println("Diese Instanz der Klasse Human ist nicht volljährig")
        }
    }


}

fun main() {
    var mensch = Human("Betty White",99)
    var kind = Human("Harry Potter", 11)
    println(mensch.name)
    println(mensch.age)
    var defaultHuman = Human("Ron Weasley", 12)
}