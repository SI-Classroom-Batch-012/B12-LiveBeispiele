package VORLESUNG.Woche03.Tag14Kdocs

/**
 * Druckt den Pfannkuchen-Back-Prozess in die Konsole aus
 * @param persons Anzahl der Personen, die Pfannkuchen essen wollen
 */

fun pancakes(persons: Int){
    println("${persons*2} Eier mit ${100*persons} gramm Mehl mischen...")
    println("${persons*50} g Zucker dazugeben...")
    // ... mehr anweisungen
    println("Fertig sind die Pfannkcuhen für $persons Personen!")
}

fun main() {
    pancakes(4)
    pancakes(2)
}