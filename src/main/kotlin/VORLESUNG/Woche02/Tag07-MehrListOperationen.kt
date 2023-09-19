package VORLESUNG.Woche02

fun main(){

    // liste anlegen: ShoppingList
    val shoppingList: List<String> = listOf(
        "Milch",
        "Apfel",
        "Kirschen",
        "Mangos",
        "Kaffee",
        "Tee"
    )
    val lastElement: String = shoppingList.get(shoppingList.size-1)

    // liste in mutable (veränderbare) liste umwandeln, in neuer variable speichern:
    val mutableShoppingList: MutableList<String> = shoppingList.toMutableList()


// LESENDE OPERATIONEN: AUF LISTS UND MUTABLE LISTS

    // size, also Länge der Liste, in variable speichern
    var length = shoppingList.size // Länge der Liste = 6

    // index vs size:
    // size in lastIndex speichern
    var lastIndex: Int = length-1
    

    // alternative zum Inhalt des letzten index: last()
    var lastElement2: String = shoppingList.last()


    // alternative zu shoppingList[0]: first()
    var firstElement: String = shoppingList[0]
    var firstElement2: String = shoppingList.first()

    // min: gibt "kleinstes" Element raus
    var min: String = shoppingList.min()
    mutableShoppingList.remove("Apfel")
    var minMutable: String = mutableShoppingList.min()


    // max
    var max: String = shoppingList.max()


    // Experiment mit Booleans: false ist "kleiner" als true (false -> 0, true -> 1)
    val boolList: List<Boolean> = listOf(true,false,true,false)
    val minBool = boolList.min()



    // indexOf() - erstes Vorkommen eines Elements in der Liste
    // Vorbereitung: Ein Element doppelt in die Liste fügen
    mutableShoppingList.add("Mangos") // Mangos jetzt an Index 2 und Index 5


    // indexOf()
    var firstMangoIndex: Int = mutableShoppingList.indexOf("Mangos") // index: 2


    // lastIndexOf() - letztes Vorkommen eines Elements in der Liste
    var lastMangoIndex: Int = mutableShoppingList.lastIndexOf("Mangos") // lastMangoIndex: 5


    // contains: gibt true zurück, wenn das gesuchte Element in der Liste ist
    val containsPizza: Boolean = shoppingList.contains("Pizza") // false
    val containsMilk: Boolean = shoppingList.contains("Milch") // true

    // containsAll : siehe contains, aber: nicht ein einzelnes Element, sondern ganze Liste
    var pizzaMilkList: List<String> = listOf("Milch", "Pizza")
    var containsMilkPizza: Boolean = shoppingList.containsAll(pizzaMilkList) // false
    var containsFruits: Boolean = shoppingList.containsAll(listOf("Apfel", "Mangos", "Kirschen")) // true


    // subList: gibt liste vom 1. index in den Klammern bis AUSschliesslich den 2. Index aus
    var subListShopping: List<String> = shoppingList.subList(0,4)
    println("Sublist: $subListShopping")

    // slice: kann eine Int Range (x..y) oder eine Liste übergeben bekommen, das obere Ende der Range ist EINbegriffen (nicht wie bei subList)
    var intRange: IntRange = 0..4
    println(intRange)
    var sliceShopping: List<String> = shoppingList.slice(0..4)
    println("Slice: $sliceShopping")

    // reversed: erstellt eine Kopie der shoppingList, kehrt darin die Reihenfolge um
    var reversedShoppingList: List<String> = shoppingList.reversed()

    // shuffled: erstellt eine Kopie der shoppingList, mischt sie durch
    var shuffledShoppingLit: List<String> = shoppingList.shuffled()


// SCHREIBENDE OPERATIONEN: NUR MIT MUTABLE LISTS

    // remove: entfernt das 1. vorkommende, passende Element (nicht mehrere, falls mehrere passen)
    println(mutableShoppingList)
    mutableShoppingList.remove("Mangos")


    // removeAll: nimmt eine Liste an Elementen, die entfernt werden sollen, als Parameter. hiermit können doppelt vorkommende Elemente entfernt werden.
    //mutableShoppingList.removeAll(listOf("Mangos"))
    mutableShoppingList.add("Milch")
    mutableShoppingList.add("Milch")
    mutableShoppingList.add("Milch")
    mutableShoppingList.removeAll(listOf("Milch")) // removeAll entfernt ALLE vorkommnisse von milch


    // add: ohne Index, fügt ein Element am Ende der Liste hinzu
    mutableShoppingList.add("Kartoffeln")

    // add: mit Index: fügt ein Element am gegebenem Index  hinzu
    mutableShoppingList.add(0,"Apfelsaft")

    // clear: leert Liste komplett aus
    mutableShoppingList.clear()

    // addAll: fügt neue Liste in Liste ein
    var newShoppingList: List<String> = listOf("Mehl", "Eier", "Zucker", "Gelee", "Schokodrops", "Glasur", "Vanillezucker", "Zimt", "Rosinen", "Puderzucker")
    mutableShoppingList.addAll(newShoppingList)
    println("AdAll")
    println(mutableShoppingList)

    println("RemoveAt 0")
    // removeAt; entfernt Element an spezifischen Index
    mutableShoppingList.removeAt(0)
    println(mutableShoppingList)


    // removeLast: entfernt das letzte Element aus der Liste
    println("Remove Last:")
    mutableShoppingList.removeLast()
    println(mutableShoppingList)


    // removeFirst: entfernt das 1. Element (index 0) aus der Liste
    println("Remove First")
    mutableShoppingList.removeFirst()
    println(mutableShoppingList)



    // sort: sortiert liste aufsteigend
    println("Sort")
    mutableShoppingList.sort()
    println(mutableShoppingList)



    // shuffle: mischt liste durch
    println("Shuffle")
    mutableShoppingList.shuffle()
    println(mutableShoppingList)


}