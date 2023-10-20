package VORLESUNG.Woche06.Tag30Wiederholung

class Wasserfahrzeug(bezeichner: String, maxKmh: Double, price: Double): Fahrzeug(bezeichner,maxKmh,price,0) {

    constructor(bezeichner: String): this(bezeichner,50.0,3333.99)

    override fun printInfo() {
        println("----Wasserfahrzeug PrintInfo----")
        super.printInfo()
    }

    override fun getMaxGeschwindigkeit(): Double {
        // Geschwindigkeit in Knoten statt kmH
        return maxKmh*0.53
    }

    override fun testDrive() {
        println("Wasserfahrzeug $bezeichner wird test gefahren...")
    }
}