package VORLESUNG.Woche02

fun main(){

    // mutable (= veränderbare) Liste anlegen

    var fruitList: MutableList<String> = mutableListOf("Apfel", "Kirsche", "Birne")

    var filmList: MutableList<String> = mutableListOf("Barbie", "Oppenheimer", "The Nun 2")
    println(filmList)

    var mutableNumbersList: MutableList<Int> = mutableListOf(12,53,77,44,89,1,4)
    var mutableDoublesList: MutableList<Double> = mutableListOf(1.0,9.0,88.9,5.5)

    mutableNumbersList[0] = mutableNumbersList.first() + mutableNumbersList[3]
    println(mutableNumbersList[0]) // in 0 steht jetzt eine 56 drin, das ergebnis von zeile 15
    println(mutableNumbersList)

    var result: Double = mutableNumbersList.first() + mutableDoublesList.first()
    mutableDoublesList[0] = result
    // mutableNumbersList[0] = result // <- das hier geht nicht, in eine Liste an Ints kann kein Double geschrieben werden

    // add: automatisch Element ans Ende der Liste hinzufügen
    var film: String = "One Piece: Der Film"
    filmList.add(film)
    println(filmList)

    // add mit Index: film wird am gegebenen Index eingefügt
    filmList.add(1,film)
    println(filmList)
    filmList.add("Pokemon: Der Film")
    println(filmList)


    // removeAt: mit spezifischem Index
    filmList.removeAt(filmList.size-2)
    println(filmList)
    // remove: ohne Index, Element muss angegeben werden
    // wenn Element nicht existiert, gibt remove false zurück
    var didRemoveWork = filmList.remove("Barbie")
    println(filmList)
    println(didRemoveWork)

    // sort
    println("Unsortierte FruitList: $fruitList")
    fruitList.sort()
    println("Sortierte fruitlist: $fruitList")


    // reverse
    fruitList.reverse()
    println("Umgedrehte FruitList: $fruitList.")

    // clear
    fruitList.clear()
    println("Entleerte FruitList: $fruitList")

}


