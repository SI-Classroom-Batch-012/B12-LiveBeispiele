package CHECKPOINTS.Woche06.Tag27

//TODO: Eine Klasse Person erstellen mit den Attributen name(String), weight(Double) und height(Double)
//TODO: Schreibe dazu 2 Funktionen, die Erste soll den Namen der Person in einen vollständigen Satz ausgeben
//TODO: Die Zweite soll den BMI berechnen und ausgeben (Formel: Gewicht in KG / (Körpergröße in m)^2)

class Person(var name: String, var weight: Double, var height: Double) {
    fun tellName() {
        println("Hallo mein Name ist $name")
    }

    fun calcBMI() {
        var bmi = (weight / (height * height))

        println("Der BMI der Person $name ist $bmi!")
    }
}

fun main() {
   var person = Person("Xavier", 77.5, 1.80)
    person.tellName()
    person.calcBMI()
}