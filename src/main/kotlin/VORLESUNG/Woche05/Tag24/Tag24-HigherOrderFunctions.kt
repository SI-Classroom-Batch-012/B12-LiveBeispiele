package VORLESUNG.Woche05.Tag24


fun main() {
    // WICHTIGSTE HIGHER ORDER FUNCTIONS / LAMBDAS


    // count: ideale Lösung mit it, erspart uns Tipparbeit und Kopfzerbrechen über Parameternamen
    val text = "Das sind zwei as"
    val searchedChar = 'a'
    val aCounter: Int = text.count { letter: Char ->
        letter == searchedChar
    }

    val bCounter: Int = text.count {
        it == 'b' }

    println("---")


    println("---")
    // filter
    val reviews = listOf(1,2,3,4,5,4,3,4,5,4,3,2,1,2,3)

    val goodReviewsList: List<Int> = reviews.filter { review -> review >= 4 }
    println("Liste mit guten Reviews (mit .filter Lambda gefiltert): $goodReviewsList")

    // zum Vergleich: filter mit Schleife
    val goodReviews: MutableList<Int> = mutableListOf()
    for (review in reviews){
        if (review >= 4) {
            goodReviews.add(review)
        }
    }
    println("Liste mit guten Reviews (mit for gefiltert): $goodReviews")
    var sortedReviews = goodReviews.sortedBy { it }
    println("Sortierte Reviews: $sortedReviews")


    println("---")
    // sortedBy: sortiert entweder aufsteigend (mit it.eigenschaft: nach einer Eigenschaft (wie length)
    val fruits = listOf("Melone", "Apfel", "Birne","Kirsche", "Orange", "Kiwi")

        // einfach nur it: wird aufsteigend sortiert (abc, numerisch)
        var sortedFruits = fruits.sortedBy { fruit -> fruit } // alternative: fruit.sortedBy{it}
        println(sortedFruits)

        // it.length: wird nach der Länge sortiert (kürzeste Frucht zuerst)
        var sortedByLength = fruits.sortedBy { fruit -> fruit.length } // oder einfach: it.length
        println(sortedByLength)


        // sortedBy mit zahlen
        val allReviewsSorted = reviews.sortedBy { it }
        println("Alle Reviews sortiert: $allReviewsSorted")


    println("---")

    // sortedByDescending: descend = absteigen, sortiert absteigend
    var sortedDescFruits = fruits.sortedByDescending { fruit -> fruit }
    println("Absteigend sortiert: $sortedDescFruits")
    val allReviewsDescSorted = reviews.sortedByDescending { it }
    println("Absteigende Reviews: $allReviewsDescSorted")



    // forEach: geht jedes Element durch und wir können darauf zugreifen und zB drucken. nicht bearbeiten! das geht nur mit map
    fruits.forEach { it }

    // EXPERIMENT:
    // nur für jede 2. Frucht:
    var everySndFruit: MutableList<String> = mutableListOf()
    fruits // hier soll nur noch jedes 2. Element drinstehen --> wie mach ich das?
    for (index in fruits.indices){
        if (index % 2 == 0)
            everySndFruit.add(fruits[index])

    }

    println("------------------------")
    println(everySndFruit)
    everySndFruit.forEach{ println(it) }

    println("EXPERIMENT MIT FILTER INDEXED")
    fruits.filterIndexed { index, fruit -> index % 2 ==0 }.forEach { print(" $it ") }
    println(" ")

    // Ende Experiment

    // map: führt Operation in den { } für jedes Element aus. damit können wir Elemente bearbeiten
    var modifiedFruits: List<String> = fruits.map { it + " ist eine Frucht" }
    println(modifiedFruits)

    var modifiedReviews: List<Int> = reviews.map { it*2 }
    println(modifiedReviews)


    println("---")
    // minBy: sucht kleinstes Element raus
    var smallestFruit = fruits.minBy { it.length }
    println(smallestFruit)

    var smallestReview = reviews.minBy { it }
    println(smallestReview)


    println("---")
    // maxBy: sucht größte Frucht nach Länge raus
    var biggestFruit = fruits.maxBy { it.length }
    println(biggestFruit)

    var biggestReview = reviews.maxBy { it }
    println(biggestReview)

    println("---")
    // any: true oder false: gibt es irgendein ein Element, das die Bedingung erfüllt? (Zahl gerade)
    var isCocoInFruits: Boolean = fruits.any { it == "Kokosnuss"}
    var isKiwiInFruits: Boolean = fruits.any { it == "Kiwi"}

    println("---")
    // all: true oder false: erfüllen ALLE Elemente in der Liste die Bedingung? (durch 2 teilbar)
    var areReviewsAllEven: Boolean = reviews.all { it%2==0 } // false, es sind nicht alle reviews gerade
    var areAllFruitsKiwis: Boolean = fruits.all { it == "Kiwi" } // false, es sind nicht alle fruechte == kiwi

    println("---")


    val evenNumbersTimesTwo = reviews.filter{ it % 2 == 0 }
    evenNumbersTimesTwo.map { it*2 }
    println(evenNumbersTimesTwo)

    // mehrere Lambdas in Kombination benutzen: gerade zahlen rausfiltern, erhöhen
    val evenNumbersTimesTwoCombined = reviews.filter{ it % 2 == 0 }.map { it*2 }
    println(evenNumbersTimesTwoCombined)

    // nur woerter die länger als 5 sind
    // alphabetisch sortieren
    // alle in ALL CAPS schreiben
    val specialFruits = fruits.filter { it.length > 5 }.sortedBy { it }.map { it.uppercase() }
    println(specialFruits)

}