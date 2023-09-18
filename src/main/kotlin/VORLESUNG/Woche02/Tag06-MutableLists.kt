package VORLESUNG.Woche02

fun main(){

    // mutable (= veränderbare) Liste anlegen

    var fruitList: MutableList<String> = mutableListOf("Apfel", "Kirsche", "Birne")

    var filmList: MutableList<String> = mutableListOf("Barbie", "Oppenheimer", "The Nun 2")
    println(filmList)

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


    // reverse

    // clear







}




//    var moneyList: MutableList<Int> = mutableListOf(100,200,300)
//    println(moneyList)
//    moneyList.first()-50 //TODO
//    println(moneyList)