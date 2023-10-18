package VORLESUNG.Woche06.`Tag28-Vererbung`

open class Animal(var name: String, var canFly: Boolean, var canSwim: Boolean) {

    init {
        println("Tier namens $name in der Klasse Animal initialisiert!")
    }

    open fun eat(){
        println("Animal $name frisst... lecker.")
    }

    open fun makeSound(){
        println("Animal $name macht Geräusche")
    }

    open fun printInfo(){
        println("Infos zu unserem Animal:")
        println("Name: $name")
        println("Kann das Tier fliegen? -> $canFly")
        println("Kann das Tier schwimmen? -> $canSwim")
    }

    open fun move(){
        println("Unser Tier $name bewegt sich...")

    }

    fun notOpen(){
        println("Diese Funktion ist not open. Kann nicht ueberschrieben werden.")
    }

}

fun main(){
    var tiger = Animal("Tigris", false,false)
    tiger.printInfo()
    tiger.makeSound()
    tiger.eat()

    var fish = Fish("Nemo",12)
    fish.makeSound()
    fish.eat()
    fish.printInfo()
    fish.age
}