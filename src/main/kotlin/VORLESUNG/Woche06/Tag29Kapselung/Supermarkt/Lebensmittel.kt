package VORLESUNG.Woche06.Tag29Kapselung.Supermarkt

open class Lebensmittel(val name: String, protected var preis: Double, open val isVegan: Boolean = true) {

    init {
        println("Lebensmittel $name erstellt!")
        println("Das Lebensmittel ist ${if (isVegan) {""} else {"nicht"}} vegan. ")
    }

    /**
     * Sekundaerer Konstruktor
     * @param name
     * @param preis
     * @param kcal
     */
    constructor(name: String,preis: Double, kcal: Int): this(name,preis,false){
        println("SK initialisiert ($name)")

    }

    // Schnittstelle, um an protected Preis von aussen ranzukommen
    fun getPreiss(): Double {
        return this.preis
    }

    private fun printInternalInfo(){
        println("Geheime Daten in printInternalInfo ausdrucken:")
        println("Produkt: $name, Preis: $preis")
    }

    open fun printInfo(){
        println("Geheime Daten auspacken:")
        printInternalInfo()
    }

}

fun main() {
    var lm = Lebensmittel("Pizza",10.99)
    // lm.preis // preis ist protected
    var preis = lm.getPreiss() // preis kommt hier raus

    var sekPizza = Lebensmittel("Mozarella",9.99,9)
    sekPizza.getPreiss()

    // lm.printInternalInfo() // private, geheim
    lm.printInfo()

    var rind: Fleisch = Fleisch("Rind",3.33,"Kuh")

    var rindSek: Fleisch = Fleisch("Milki", "Milka Kuh")
    rind.printInfo()
    rind.braten()
    //rind.printTierart() // ist protected, geht nicht


    // Supermarkt erstellen
    var supermarkt = Supermarkt(mutableListOf())

    supermarkt.printLebensmittel()
    supermarkt.printFleisch()

    // Obst PK
    var kiwi = Obst("Kiwi",0.50,"viele Vitamine")

    // Obst SK
    var banane = Obst("Banane","kalium haltig")
    banane.printInfo()





}