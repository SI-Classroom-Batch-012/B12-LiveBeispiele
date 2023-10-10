package VORLESUNG.Woche05.Tag22


fun main() {
    // Animal beispiel: for in schleife / for each schleife
    var animalList = mutableListOf("Tiger", "Löwe", "Bär", "Maus")
    for(tier in animalList){
        println(tier)
        println(tier) // wichtig zu verstehen: es wird 2x das gleiche geprintet
        if (tier == "Tiger"){ // wenn Tiger vorkommt xmal drucken
            println(tier)
            println(tier)
            println(tier)
            println(tier)

        } else if (tier == "Maus"){ // wenn maus vorkommt 2x drucken
            println(tier)
            println(tier)
        }
    }
    // WICHTIG: liste ist mit for in schleife nicht veränderbar!! man kommt an die Elemente, kann sie aber nicht bearbeiten
    val liste = mutableListOf(1,2,3,4,5,6,1,2,3,4)
    for (number in liste){
        println(number)
        // number++ // geht nicht, würde Listenelement modifizieren. das geht nur mit der for i Schleife
    }


    // for i Schleife / Schleife mit Index: damit kann ich auf Elemente zugreifen und sie bearbeiten

    for (index in animalList.indices) {
        println(index)
        animalList[index] = animalList[index] + " ist ein Tier"
        println(animalList[index])
    }
    println(animalList)



    //pizzaFor()

    var pizzaList = pizzaFor()
    // pizza sorten vorkommen zählen mit for in schleife
//    countPizzaTypeForIn(pizzaList,"Hawaii")
//    countPizzaTypeForIn(pizzaList,"Salami")
//    countPizzaTypeForIn(pizzaList,"Tonno")
//    countPizzaTypeForIn(pizzaList,"Mozarella")

    countPizzaTypeForI(pizzaList,"Hawaii")



    // nach buchstaben im string suchen mit for schleife


}

private fun pizzaFor(): MutableList<String> {
    val pizzaOrder: MutableList<String> = mutableListOf()
    // Pizza Beispiel mit for
    for (pizza in 1..100) {
        pizzaOrder.add(PIZZAS.random())
    }

    println(pizzaOrder)
    return pizzaOrder
}






// basic for schleife, die jedes listenelement ausgibt mit in: Pizza

// for schleife, um pizza sorte zu zählen: ohne indizes, wir greifen direkt auf jedes Listenelement zu

// pizza sorten vorkommen zählen mit for in schleife

fun countPizzaTypeForIn(pizzaList: List<String>, searchedPizza: String) {
    println("Wir suchen nach $searchedPizza...")
    var counter = 0
    for (pizza in pizzaList) {
        // logik, die bestimmt, welche pizza gezählt wird
        if (pizza == searchedPizza) {
            // println("Salami gefunden!")
            counter++
        }
    }
    println("Die $searchedPizza kommt $counter Mal in der pizzaList vor!")
}

// pizza sorten vorkommen zählen mit for i schleife: über den Index
fun countPizzaTypeForI(pizzaList: MutableList<String>, searchedPizza: String) {
    println("Wir suchen nach $searchedPizza...")
    var counter = 0
    for (index in pizzaList.indices) {
        // logik, die bestimmt, welche pizza gezählt wird
        if (pizzaList[index] == searchedPizza) {
            // println("Salami gefunden!")
            pizzaList[index] = pizzaList[index] + " ist die gesuchte Pizza"
            counter++
        }
    }
    println("Die $searchedPizza kommt $counter Mal in der pizzaList vor!")
    println(pizzaList)
}




// mit Indizes: wir greifen auf den Index zu, nicht das Element, das darin liegt:


// buchstaben zählen



