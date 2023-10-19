package VORLESUNG.Woche06.Tag29Kapselung.Supermarkt

class Obst(name: String, preis: Double, val vitaminGehalt: String): Lebensmittel(name,preis) {

    constructor(name: String,vitaminGehalt: String): this(name, 0.0, vitaminGehalt)

    constructor(name: String): this(name,"vitaminreich")

    fun schnippeln(zeit: Int){
        println("es wird $zeit Minuten geschnippelt")
    }

    fun getRandomPrice() {
        preis = listOf(4.99,0.99,2.99).random()
    }

    init {
        getRandomPrice()
    }

    override fun printInfo() {
        println("---Obst Infos---")
        super.printInfo()
        printVitamine()

    }

    private fun printVitamine(){
        println("Vitamingehalt: $vitaminGehalt")

    }
}