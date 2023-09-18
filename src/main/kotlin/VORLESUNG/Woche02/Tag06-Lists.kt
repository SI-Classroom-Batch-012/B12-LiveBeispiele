package VORLESUNG.Woche02

fun main(){

    // zur Erinnerung: Variable anlegen
    val firstName: String = "Marietta"

    // leere Liste anlegen
    val emptyList: List<Int> = listOf()
    println(emptyList)


    // isEmpty
    println("Ist die emptyList leer? -> ${emptyList.isEmpty()}")


    // befüllte liste anlegen
    val nameList: List<String> = listOf("Adam", "Eva", "Jonathan", "Bernd", "Klaus", firstName, "Eva")

    // veränderbare Kopie von nameList erstellen:
    val mutableNameList = nameList.toMutableList()

    println(nameList)
    println("Länge der Liste nameList: ${nameList.size}") // tatsächliche Länge (index unabhängig) der Liste

    // ist befüllte liste leer?
    println("Ist die nameList leer? -> ${nameList.isEmpty()}")


    // über [] auf den index zugreifen, inhalt in variable speichern
    var firstNameInList: String = nameList[0]
    println("1. Name in der nameList: $firstNameInList")
    // firstNameInList = nameList[5] <- kann überschrieben werden, einkommentieren zum ausprobieren

    // Inhalt überschreiben: geht bei List nicht! -> einkommentieren zum Ausprobieren
    // nameList[0] = "Zacharias"

    // ohne variable direkt den inhalt ausdrucken


    // auf das erste Element zugreifen: 2 Varianten

        // Variante 1: über den index
        var var1: String = nameList[0]

        // Variante 2: first()
        var var2: String = nameList.first()


    // auf letzte Element zugreifen: 2 Varianten

        // Variante 1: über den index
        var lastIndex: Int = nameList.size-1 // für Index Zugriff immer size-1, da der Index bei 0 anfängt zu zählen, während size bei 1 anfängt zu zählen = 1 zu lang sein wird
        var lastVar1: String = nameList[lastIndex]

        // Variante 2: last()
        var lastVar2: String = nameList.last()


    var numbersList: List<Int> = listOf(12,53,77,44,89,1,4)

    // indexOf: Gibt den 1. Index des übergebenen Elements an
    var indexOfVar = numbersList.indexOf(0) // es gibt keine 0 in der numbersList, deshalb wird -1 ausgegeben
    println("Index der Zahl 0 in numbersList: $indexOfVar")

    var indexOfNames = nameList.indexOf("Eva")
    println("Index von Eva: $indexOfNames")

    // lastIndexOf
    println("2. Index von Eva: ${nameList.lastIndexOf("Eva")}")


    // min

    // max

    // contains

    // get

    // subList

    // reversed

    // sorted








}