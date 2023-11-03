package VORLESUNG.W02.D04

fun main(){

// Set: unsortierte Kollektion einzigartiger Elemente. D.h. Doppelungen desselben Werts werden nicht geprinted oder gezählt

    // set anlegen

    var animals: Set<String> = setOf()
    var animalSet: MutableSet<String> = mutableSetOf("Tiger", "Pinguin", "Giraffe", "Gorilla", "Orangutan", "Delphin", "Löwe")
    println(animalSet)

    // mehr duplikate hinzufügen
    animalSet.add("Tiger")
    animalSet.add("Giraffe")
    animalSet.add("Zebra") // hängt Zebra NICHT hinten dran
    println(animalSet.elementAt(0))
    println(animalSet)
    var tiger = animalSet.elementAt(0)

    // set zur liste konvertieren
    var mutableListAnimals = animalSet.toMutableList()
    println(mutableListAnimals)

    // liste mit duplikaten zu set konvertieren
    var listWithDuplicates = listOf("A", "B", "C", "B", "A")
    var listToSet = listWithDuplicates.toSet()
    println(listToSet)



    println(animalSet)
    // size: enthält die duplikate nicht
    animalSet.size
    println()

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