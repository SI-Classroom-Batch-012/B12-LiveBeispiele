package VORLESUNG.Woche06.Tag27Konstruktoren

// breed: temporäre Variable, nur im Konstruktor verfügbar
class Cat(var name: String, var alter: Int, breed: String, var owner: Human, var color: String = "black") {

    var isSterilized: Boolean = false
    init {
        println("Instanz der Klasse Katze namens $name erstellt!")
        println("Die Katze $name ist von der Rasse $breed")
    }

    constructor(name: String, alter: Int, breed: String, owner: Human, isSterilized: Boolean) : this(name,alter,breed,owner,"white"){
        this.isSterilized = isSterilized
    }

    constructor(name: String): this(name,0,"not available", Human("Max Mustermann",20)){
        println("Instanz mit dem 3. Konstruktor (nur Name uebergeben erstellt")
        println("Das bedeutete: alter ($alter), Rasse ($this.breed) und Besitzer sind Default werte. nur der name ist individuell. ")
    }
}

fun main() {
    // primaerer konstruktor
    var betty: Cat = Cat("Betty",12,"BKH", Human("Taylor",23), "brown")

    var mensch: Human = Human("John", 30)

    // primaerer konstruktor
    var alfie: Cat = Cat("Alfie", 8,"Hauskatze",mensch)
    alfie.color // black

    // primaerer konstruktor
    var kitty = Cat("Kitty",3,"Perser", mensch, "white")
    kitty.color // white

    // sekundaerer konstruktor
    var sterilizierteKatze: Cat = Cat("Mauzi",9,"Perser",mensch,true)
    alfie.isSterilized // immer false
    println(sterilizierteKatze.isSterilized) // true

    var nurNameKatze: Cat = Cat("Kaya")
    var agathe = Cat("Agathe")
    var roman = Cat("Roman")



}