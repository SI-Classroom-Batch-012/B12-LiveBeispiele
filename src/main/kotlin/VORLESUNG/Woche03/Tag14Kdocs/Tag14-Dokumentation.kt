package VORLESUNG.Woche03.Tag14Kdocs

fun main() {
    greeting("Marcel")
    greeting(readln())
    var name = "Jonas"
    var x = 90
    var bla = 9
    greeting(name)
    greeting("eoghegoiahg[ ehig [eigh[iehg ")

}

/**
 * Druckt eine Begrüßung in die Konsole aus
 * @param name Name, der begrüßt werden soll
 */
fun greeting(name: String){
    var x= 0
    var bla = 10
    println("Hallo, $name!")
}




/**
 * Berechnet den Gesamtpreis für eine bestimmte Anzahl von Produkten unter Berücksichtigung eines Rabatts.
 *
 * @param anzahlProdukte Die Anzahl der zu kaufenden Produkte.
 * @param preisProProdukt Der Preis pro Produkt.
 * @param rabatt Der Rabatt, der auf den Gesamtpreis angewendet wird. Standardwert ist 0.0 (kein Rabatt).
 * @return Der Gesamtpreis nach Anwendung des Rabatts.
 */