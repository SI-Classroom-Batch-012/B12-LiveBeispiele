package VORLESUNG.Woche06.Tag30Wiederholung

class Fahrzeugverleih {

    private var alleFahrzeuge: MutableList<Fahrzeug> = mutableListOf(

    )
    private var alleLandahrzeuge: MutableList<Landfahrzeug> = mutableListOf(

    )

    private var alleWasserFahrzeuge: MutableList<Wasserfahrzeug> = mutableListOf(

    )

    init {
        alleFahrzeuge.addAll(
            mutableListOf(
            Fahrzeug("BMW"),
            Wasserfahrzeug("Schiff",90.0,800.0),
            Wasserfahrzeug("Segelboot"),
            Landfahrzeug("Buggy"),
            Landfahrzeug("Bus"),
//            Zweirad("motorrad"),
//            Zweirad("Fahrrad"),
//            Zweirad("Roller"),
//            Yacht("Spirit of the Sun"),
//            Yacht("Sea Lion",99,450.0),
            )
        )

        println("----Alle Fahrzeuge----")
        alleFahrzeuge.forEach {
            print(it.bezeichner)
            println(", maxKmh: ${it.getMaxGeschwindigkeit()}")

        }

        println("----Alle Landfahrzeuge----")
        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug is Landfahrzeug){
                println(fahrzeug.bezeichner)
                alleLandahrzeuge.add(fahrzeug)
            }

        }

    }

    fun addFahrzeug(fahrzeug: Fahrzeug) {
        alleFahrzeuge.add(fahrzeug)

        if (fahrzeug is Wasserfahrzeug){
            alleWasserFahrzeuge.add(fahrzeug)
        }
        if (fahrzeug is Landfahrzeug) {
            alleLandahrzeuge.add(fahrzeug)
        }
    }

    fun removeFahrzeug(fahrzeug: Fahrzeug) {
        alleFahrzeuge.remove(fahrzeug)

        if (fahrzeug is Wasserfahrzeug){
            alleWasserFahrzeuge.remove(fahrzeug)
        }
        if (fahrzeug is Landfahrzeug) {
            alleLandahrzeuge.remove(fahrzeug)
        }
    }

    fun vermieten(fahrzeug: Fahrzeug){
        if (!fahrzeug.istVermietet) {
            println("${fahrzeug.bezeichner} wird vermietet.")
            fahrzeug.istVermietet = true
        } else {
            println("${fahrzeug.bezeichner} ist bereits vermietet.")
        }
    }
    fun zurueckGeben(fahrzeug: Fahrzeug){
        if (fahrzeug.istVermietet) {
        println("${fahrzeug.bezeichner} wird jetzt zurueck gegeben.")
        fahrzeug.istVermietet = false
        } else {
            println("${fahrzeug.bezeichner} ist gar nicht verliehen!")
        }
    }

    fun getVermieteteFahrzeuge(): List<Fahrzeug> {
        var vermietet = alleFahrzeuge.filter { it.istVermietet }
        return vermietet
    }

    fun getVerfeugbareFahrzeuge(): List<Fahrzeug> {
        var vermietet = alleFahrzeuge.filter { !it.istVermietet }
        return vermietet
    }









}