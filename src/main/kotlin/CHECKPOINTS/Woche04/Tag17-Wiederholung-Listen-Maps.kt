package CHECKPOINTS.Woche04

/* listen */
// eine geordnete sammlung von elementen
// immer vom gleichen datentyp
// unveränderliche datenstruktur, keine elemente hinzufügen, entfernen oder ändern

val fruits = listOf("Apfel", "Orange", "Kiwi")
val fruits2: List<String> = listOf("Banane", "Kirsche", "Feige")

val names = listOf("Maik", "Kevin", "Johnny")
val index1 = names[1]

val names1 = listOf("Max", "Alex", "Ben")
val size = fruits.size

/* mutable listen */
// ist veränderbar
// elemente hinzufügen oder entfernen

val mutableFruits = mutableListOf("Apfel", "Banane")
val added = mutableFruits.add("Kirsche")

val mutableFruits1 = mutableListOf("Apfel", "Banane", "Kirsche")
val removed = mutableFruits1.remove("Banane") // Gibt true zurück

val names3 = mutableListOf("x", "y", "z")
val removedFruit = names3.removeAt(1) // Gibt "Banane" zurück und entfernt es aus der Liste

/* maps */
// sammlung von schlüssel-wert-paaren, bei der jeder schlüssel eindeutig ist
// unveränderliche datenstruktur, keine neuen schlüssel-wert-paare hinzufügen oder löschen

/*
val mapName: Map<KeyType, ValueType> = mapOf(
    key1 to value1,
    key2 to value2,
    key3 to value3,
    // Weitere Schlüssel-Wert-Paare
)
*/

val fruitPrices: Map<String, Double> = mapOf(
    "Apfel" to 1.0,
    "Banane" to 0.5,
    "Kirsche" to 2.0)
val priceOfApple = fruitPrices["Apfel"] // Gibt 1.0 zurück

val fruitPrices2 = mapOf("Apfel" to 1.0, "Banane" to 0.5, "Kirsche" to 2.0)
val sizeFruit = fruitPrices2.size // Gibt 3 zurück

/* mutable maps */
// ist veränderbar, neue schlüssel-wert-paare hinzufügen oder löschen

val mutableFruitPrices = mutableMapOf("Apfel" to 1.0, "Banane" to 0.5)
val removedPrice = mutableFruitPrices.remove("Apfel")

val mutableFruitPrices2 = mutableMapOf("Apfel" to 1.0, "Banane" to 0.5)
val previousPrice = mutableFruitPrices2.replace("Apfel", 10.99)

fun main() {
    println(mutableFruitPrices2)
}