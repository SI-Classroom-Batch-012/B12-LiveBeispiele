package VORLESUNG.Woche02

fun main(){

    // Set: unsortierte Kollektion einzigartiger Elemente. D.h. Doppelungen desselben Werts werden nicht geprinted oder gezählt
    // set anlegen
    val animals: Set<String> = setOf("Tiger","Gorilla","Giraffe","Pinguin","Delphin","Löwe", "Löwe", "Tiger")
    println(animals)


    // mutable set anlegen
    val mutableSet: MutableSet<Double> = mutableSetOf(1.0,9.0,7.5,5.5,2.0)

    val mutableAnimals: MutableSet<String> = animals.toMutableSet()

    // mehr duplikate hinzufügen
    var didAddWork: Boolean = mutableAnimals.add("Orangutan")
    mutableAnimals.add("Flamingo")
    var didAddTigerWork: Boolean = mutableAnimals.add("Tiger") // wird nicht hinzugefügt, weil doppelung
    println(mutableAnimals)


    // size: enthält die duplikate nicht
    val animalSize: Int = mutableAnimals.size

    mutableAnimals.removeAll(listOf("Tiger", "Löwe")) // remove geht auch
    println(mutableAnimals)

    var tiger: String = animals.elementAt(0) // gibt so wie bei listen animals[0] das Element an Index 0 zurück
    var lastAnimal: String = animals.elementAt(animals.size-1)
    var firstAnimal: String = animals.first()
    var lastAnimal2: String = animals.last()


    println()

    // Konvertierung

    var animalList: List<String> = mutableAnimals.toList()
    println("Liste an Tieren: $animalList")
    println("Set an Tieren: $mutableAnimals")
    println(animalList[0]) // Liste: über Index erreichbar
    // println(mutableAnimals[0]) // Set: Element nicht über Index erreichbar, alternative: elementAt(0)

    var list: List<Int> = listOf(1,2,3,4,5,5,4,3,2,1,6,7,8,9)
    println("Liste an Zahlen: $list")
    var numberSet: Set<Int> = list.toSet()
    println("Set an Zahlen: $numberSet")



    // Sinn von Sets
    // Daten aus verschiedenen Quellen
    val source1 = listOf("A", "B", "C", "D", "E")
    val source2 = listOf("C", "D", "E", "F", "G")
    val source3 = listOf("E", "F", "G", "H", "I")

    // Eine leere Menge (Set) erstellen, um eindeutige Datensätze zu speichern
    val uniqueData = mutableSetOf<String>()

    // Daten aus verschiedenen Quellen zusammenführen, Doppelungen werden nicht hinzugefügt
    uniqueData.addAll(source1)
    uniqueData.addAll(source2)
    uniqueData.addAll(source3)

    // Eindeutige Datensätze anzeigen
    println("Eindeutiger Datensatz:")
    println(uniqueData) 

}