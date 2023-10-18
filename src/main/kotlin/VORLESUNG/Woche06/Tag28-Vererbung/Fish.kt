package VORLESUNG.Woche06.`Tag28-Vererbung`

open class Fish(name: String, var age: Int): Animal(name, false,true) {

    init {
        println("Klasse Fisch: Fisch $name erstellt!")
    }

    // final: darf nicht ueberschrieben werden
    override fun eat(){
        println("Unser Fisch $name isst Algen und ist satt.")

    }

    override fun makeSound(){
        println("Fisch macht gluck gluck gluck...")
    }

    override fun printInfo(){
        println("Dieses Tier ist ein FISCH!")
        // super: ruft funktion aus der elternklasse auf
        super.printInfo()
        println("Alter: $age")
    }

    // Funktionen duerfen nicht die gleichen Namen wie im Animal haben, nur, wenn man die Funktion aus dem Animal bewusst ueberschreibt.

}