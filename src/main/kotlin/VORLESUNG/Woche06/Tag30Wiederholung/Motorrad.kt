package VORLESUNG.Woche06.Tag30Wiederholung

class Motorrad(bezeichner: String, override val anzahlRaeder: Int = 2): Landfahrzeug(bezeichner) {


    override fun printInfo() {
        println("PrintInfo aus dem Motorrad:")
        super.printInfo()
    }


}