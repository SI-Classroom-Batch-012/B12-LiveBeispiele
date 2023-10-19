package VORLESUNG.Woche06.Tag29Kapselung.Supermarkt

class Fleisch(name: String, preis: Double, val tierArt: String, override val isVegan: Boolean = false): Lebensmittel(name, preis) {

    constructor(name: String,tierArt: String): this(name,0.0,tierArt)

    protected fun printTierArt(){
        println("Tierart: $tierArt")
    }

    // extra Schnittstelle, um private/protected Funktionen aufzurufen
    override fun printInfo() {
        println("Infos zum Fleisch:")
        super.printInfo() // super = ruf printInfo von Mutterklasse Lebensmittel auf
        printTierArt()
    }

    fun braten(){
        println("Das Fleisch $name wird gebraten...")
    }






}