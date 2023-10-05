fun main() {
    rangeAngeben()
    val userName1: String? = null
    val userName2: String? = "Alice"
    println(nutzerGrüßen(userName1))
}

// range
fun rangeAngeben() {
    val closedRange = 0..99
    for (number in closedRange)
        println(number)
}

// elvis operator dient dazu einen Wert zurückzugeben, wenn ein Ausdruck oder eine Variable null ist
// val elvis = nullableValue ?: defaultValue
fun nutzerGrüßen(name: String?): String {
    val userName = name ?: "User"
    return "Hallo, $userName!"
}

/*
fun funktionsName(parameter: parameterTyp): rückgabeTyp {
    // Funktionskörper
    // Hier werden Operationen ausgeführt
    return ergebnis // Der Wert, der von der Funktion zurückgegeben wird
}
 */

/*
// Hauptunterschied zwischen einer Map und einer Liste die Art und Weise,
// wie sie Elemente speichern und zugreifbar machen.
// Eine Liste ist eine geordnete Sammlung von Elementen,
// auf die Sie mithilfe von Indizes zugreifen können,
// während eine Map eine Sammlung von Schlüssel-Wert-Paaren ist,
// auf die Sie mithilfe der Schlüssel zugreifen

// mutable list + listenfunktionen
fun main() {
    // Erstellen einer leeren mutable Liste von Ganzzahlen
    val mutableList = mutableListOf<Int>()

    // Elemente zur Liste hinzufügen
    mutableList.add(1)
    mutableList.add(2)
    mutableList.add(3)

    // Die Liste ausgeben
    println(mutableList)
    print(funktion2())
}
// add() -> Fügt ein Element am Ende der Liste hinzu.
// random() -> zufälligen Index im Bereich der Listengröße zu generieren
// sorted() -> Elemente einer Liste in aufsteigender Reihenfolge zu sortieren (Zahlen und Wörter)


// mutable map + mapfunktionen

fun funktion2() {
    // Erstellen einer leeren Mutable Map von Strings (Schlüssel) zu Integers (Werten)
    val map = mutableMapOf<String, Int>()

    // Schlüssel-Wert-Paare zur Map hinzufügen
    map["Alice"] = 25
    map["Bob"] = 30
    map["Charlie"] = 28

    map.size

    // Die Map ausgeben
    println(map)
}

// average() -> Durchschnitt der Elemente in einer Sammlung, gibt einen Double-Wert zurück
// toList() -> wandelt Arrays, Sets, Maps in eine Liste um
// max() -> den größten Wert in einer Sammlung von Elementen zu finden
// sice -> Anzahl der Elemente in der Sammlung effizient abzurufen
// sum() -> die Summe aller Elemente in einer Sammlung von Zahlen zu berechnen
// remove() -> Element zu entfernen

// addieren von 2 zahlen
fun addNumbers(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}

// elvis operator
// wird verwendet, um einen Wert auszudrücken, der entweder der Wert einer Variable ist,
// wenn sie nicht null ist, oder ein Standardwert, wenn die Variable null ist.
val result = nullableValue ?: defaultValue

// Beispiel zu elvis operator
val name: String? = null
val displayName = name ?: "Gast"
println(displayName) // Gibt "Gast" aus, da name null ist.

//Null-Sicherheitsoperator -> ?
// wird verwendet, um sicher auf Eigenschaften oder Methoden zuzugreifen, ohne eine NullPointerException zu riskieren,
// wenn das Objekt, auf das zugegriffen wird, null ist

// Beispiel zu ? Operator
val text: String? = null
val length = text?.length // length wird null sein, da text null ist.

// Null-Assertion-Operator !!
// wird verwendet, um auszudrücken, dass ein Ausdruck nicht null ist.
// Wenn der Ausdruck null ist, wird jedoch eine NullPointerException ausgelöst
val text: String? = null
val length = text!!.length // Wird eine NullPointerException auslösen, da text null ist.

// nullpointerexception -> es wird auf ein Objekt zugegriffen was es nicht gibt

// range angeben
var range = (2..29)
// 2 bis einschließlich 29
*/
