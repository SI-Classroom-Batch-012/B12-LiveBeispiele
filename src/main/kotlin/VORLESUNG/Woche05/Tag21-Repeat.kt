package VORLESUNG.Woche05

fun main() {
    // repeat mit Int
    repeat(2){
        println("Hello World!")
        println("Es ist ein guter Tag")
        // andere Funktion aufrufen...
    }

    // repeat mit Variable und Counter
//    var counter = 1
//    var weekDays = 7
//    repeat(weekDays){
//        println("Es ist heute der ${it+1}. Wochentag.")
//        println("Counter: $counter")
//        counter++ // das gleiche wie counter += 1, das gleiche wie counter = counter + 1
//    }


    // repeat über Liste mit it.
    // it = von Kotlin bereitgestellte implizierte Indexvariable,
    // enthält automatisch erst den Index 0, zählt dann automatisch hoch
    var herbstKleidung = mutableListOf("Wollsocken", "Winterschuhe", "gefütterte Jeans", "Daunenjacke", "Schal")
    repeat(herbstKleidung.size){
        println("$it. Element in der Liste: ${herbstKleidung[it]}")
    }
}