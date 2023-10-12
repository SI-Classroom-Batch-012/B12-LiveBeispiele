package VORLESUNG.Woche05.Tag24

fun main() {

    // Fisch Aufgabe mit do while
    val fischSorten: List<String> = listOf("Aal", "Hering", "Barsch", "Hecht", "Dose")
    //fishDoWhile(fischSorten)


    // Fisch aufgabe mit for
    val gefangeneFische: MutableList<String> = mutableListOf()

    for (i in 1..20){
        var nextFish = fischSorten.random()
        // logik für die dose
        if (nextFish == "Dose"){
            println("Dose geangelt, der See ist verdreckt, wir gehen lieber nach Hause")
            break
        }
        if (nextFish == "Aal"){
            println("Aal gefangen, wir essen keinen Aal... wird wieder zurück geworfen")
            continue
        }
        gefangeneFische.add(nextFish)
        println("$nextFish gefangen!")
    }
    println("Unsere gefangenen Fische: $gefangeneFische")

}

private fun fishDoWhile(fischSorten: List<String>) {
    val gefangeneFische: MutableList<String> = mutableListOf()

    do {
        var nextFish = fischSorten.random()
        gefangeneFische.add(nextFish)
        println("$nextFish gefangen!")
    } while (nextFish != "Dose")

    println("Folgende Fische gefangen, bis Dose kam: $gefangeneFische")
}