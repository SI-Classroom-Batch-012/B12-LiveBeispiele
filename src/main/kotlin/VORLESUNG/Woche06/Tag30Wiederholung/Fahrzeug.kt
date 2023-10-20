package VORLESUNG.Woche06.Tag30Wiederholung

open class Fahrzeug(var bezeichner: String, protected val maxKmh: Double, protected var preis: Double,  open val anzahlRaeder: Int, open var istVermietet: Boolean = false) {

    // unintialisierte Variable muss im init Block initialisiert werden, da wir beim erstellen der Instanz keine leeren Werte haben duerfen.
    var beschreibung: String
    init {
        this.beschreibung = "Ein sehr schoenes Fahrzeug."
        println("----Primaerer Konstruktor Fahrzeug (Mutter)----")
        printInfo()
    }

    constructor(bezeichner: String): this(bezeichner,100.0,9999.99,4){
        println("Fahrzeig mit SK und Default Werten initialisiert.")
    }

    // Schnittstelle, um an protected Informationen zu kommen
    open fun getMaxGeschwindigkeit(): Double {
        return this.maxKmh
    }

    open fun printInfo(){
        println("--Fahrzeug Details--")
        println(beschreibung)
        println("Name: $bezeichner")
        println("Maximalgeschwindkeit: $maxKmh km/h")
        println("Preis: $preis")
        println("Anzahl an Rädern: $anzahlRaeder")
        println("Ist vermietet: $istVermietet")

    }

    open fun testDrive(){
        println("Das Fahrzeug $bezeichner wird Probe gefahren...")

    }

}