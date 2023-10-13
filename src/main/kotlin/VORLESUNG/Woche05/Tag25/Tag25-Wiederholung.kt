package VORLESUNG.Woche05.Tag25

fun main() {

    // repeat
    repeat(5){// läuft 5x durch, aber fängt bei 0 an zu zählen
        println("Iteration: ${it+1}")
        // jede art von funktionsaufruf machen
    }

    println("----While ---")

    // while
    var count = 1
    while (count <= 10){
        println("Iteration: $count")
        count++ // count = count+1

    }
    println("Counter ist größer als 10 ($count), Schleife wurde abgebrochen.")

    println("---Do While --")
    // do while
    var counter = 11
    do {
        println("Iteration: $count")
        count++ // count = count+1

    } while (count <= 10)


    println("--For Schleife mit Range---")

    // for mit range
    for (i in 1 .. 5){ // 1 bis inklusive 5, 1 bis exklusive 5 wäre 1 until 5
        println("Iteration $i")
    }

    // for in mit liste
    println("---For in mit Liste---")
    val namesList = mutableListOf("Anna", "Berta", "Corinna", "Daphne", "Elsa")
    for (name in namesList){
        println(name)
        // name = name + " blabla" // geht nicht, nur mit for i Schleife können wir Elemente bearbeiten
    }
    println("---For i mit Liste ----")

    // for i mit liste
    for (index in namesList.indices){
        namesList[index] = namesList[index] + " ist ein schöner Name"
        println(namesList[index])
    }


    val numbers = mutableListOf(1.0,2.0,3.0,4.0)

    // schreibt das ergebnis der rechnung für jedes einzelne element in die neue liste numbersTimesTwo
    var numbersTimesTwo = numbers.map { it*2.0 }
    println(numbersTimesTwo)

    println("--Was passiert bei map unter der Haube?--")
    // map unter der Haube
    var newNumbersTimesTwo: MutableList<Double> = mutableListOf()
    for (i in numbers.indices){
        newNumbersTimesTwo.add(numbers[i]*2)
        println(newNumbersTimesTwo)
    }




}