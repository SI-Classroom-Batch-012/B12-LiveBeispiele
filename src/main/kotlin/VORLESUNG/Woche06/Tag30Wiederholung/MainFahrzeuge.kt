package VORLESUNG.Woche06.Tag30Wiederholung

fun main() {
    var fahrzeug: Fahrzeug = Fahrzeug("VW Bus",140.0,12000.99,4)
    fahrzeug.bezeichner = "Audi Bus"
    // ab jetzt steht Audi Bus im Bezeichner
    fahrzeug.printInfo()


    fahrzeug.getMaxGeschwindigkeit()
    // fahrzeug.maxKmh geht nicht, ist protected also nicht von aussen anfassbar. deshalb die getter Funktion in der obigen Zeile.

    var landfahrzeug: Landfahrzeug = Landfahrzeug("Toyota A+",180.0,15000.00)
    println("---Test----")
    landfahrzeug.printInfo()

    var landFahrSek: Landfahrzeug = Landfahrzeug("Mercedes")

    var motorrad: Motorrad = Motorrad("Harley")
    motorrad.printInfo()
    println(motorrad.anzahlRaeder)

    var boot: Wasserfahrzeug = Wasserfahrzeug("Titanic",70.0,20000.0)
    boot.getMaxGeschwindigkeit()


    var sixt: Fahrzeugverleih = Fahrzeugverleih()

    sixt.addFahrzeug(boot)

    sixt.vermieten(boot)
    println(boot.istVermietet)
    sixt.zurueckGeben(boot)
    println(boot.istVermietet)

    motorrad.istVermietet = false
    // if else syntax in einem println()
    println("${motorrad.bezeichner} ist ${if(motorrad.istVermietet) "" else "nicht"} vermietet.")
    // ich will motorrad zu meinen Fahrzeugen hinzufuegen, darf aber nicht, weil alleFahrzeuge private ist. --> brauche eine setter Funktion, mit der ich da rankann. haben bereits addFahrzeug
    sixt.addFahrzeug(motorrad)

    motorrad.istVermietet = true
    boot.istVermietet = true

    var vermietet = sixt.getVermieteteFahrzeuge()
    vermietet.forEach { println(it.bezeichner) }



}