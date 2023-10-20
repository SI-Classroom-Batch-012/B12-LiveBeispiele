package VORLESUNG.Woche06.Tag30Wiederholung

open class Landfahrzeug(bezeichner: String, maxKmh: Double, price: Double, override val anzahlRaeder: Int = 4) : Fahrzeug(bezeichner,maxKmh,price,anzahlRaeder) {

    constructor(bezeichner: String) : this(bezeichner,150.0,8000.00){
        println("---Sekundärer Konstruktor Landfahrzeug---")
        printInfo()

    }


    override fun testDrive(){
        println("Landfahrzeug $bezeichner wird Test gefahren...")
    }




}