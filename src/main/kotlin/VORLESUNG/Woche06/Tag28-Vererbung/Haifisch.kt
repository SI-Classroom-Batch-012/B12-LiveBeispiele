package VORLESUNG.Woche06.`Tag28-Vererbung`

// Haifisch erbt von Fisch. Age als Default Wert kann auch direkt im Haifisch Konstrukkor angegeben werden
class Haifisch(name: String, age: Int = 1): Fish(name,age) {

    // eat() vom Fisch überschreiben, sodass stattdessen dieses eat hier benutzt wird:
    override fun eat() {
        println("Der Hai $name frisst nur Fleisch. Mit regulärem Futter wird das nichts.")
    }

}