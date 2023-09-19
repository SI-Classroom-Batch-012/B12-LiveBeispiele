package CHECKPOINTS.Woche02

fun main() {

    // Wie erstelle ich eine Liste

    var names : List<String> = listOf("Marianne", "Lukas", "Maike", "Bassam")

    // Wie ändere ich eine Liste in eine MutableList

    var name = names.toMutableList()


    // Wie bekomme ich ersten/letzten Teil einer Liste

    println(name.first())
    println(name.last())

    // Wie kriege ich den Index eines bestimmten Wertes einer Liste?

    val indexOf = name.indexOf("Lukas")
    println(indexOf)

    // Wie kann ich überprüfen ob eine Wert Teil einer Liste ist?

    val isIncluded = name.contains("Bassam")
    println(isIncluded)

    // Wie kann ich Werte einer Liste hinzufügen?

    name.add("Eduard")

    // Wie kann ich Werte einer Liste entfernen?

    name.remove("Eduard")

    // Wie kann ich eine Liste sortieren?

    println(name.sort())

    // Wie kann ich eine Liste durchmischen?

    println(name.shuffle())

    // Wie kann ich zwei Listen zusammenfügen?

    var liste = mutableListOf("Luc", "Marcel", "Philipp")
    //name.addAll(liste)
    var concludedList = (name + liste).toMutableList()
    println(concludedList)

    //Leere eine Liste komplett
    name.clear()

}