package CHECKPOINTS.Woche05

// Lambda
// Break & Continue

fun main() {
    val names: List<String> = listOf("Anna", "Max", "Sarah", "David", "Lisa", "Daniel", "Maria", "Peter","Laura", "Thomas")


    // LAMBDA - ANONYME FUNKTIONEN
    // isEven - check ob Zahl gerade ist
    val isEven = { x:Int -> x % 2 == 0 }

    print("Eingabe Zahl: ")
    val eingabe: Int = readln().toInt()
    if(isEven(eingabe)){
        println("Eingabe ist gerade")
    }else {
        println("eingabe ist ungerade")
    }
    println("-----")

    // minimum characters - check, ob ein Text mindestens von länge min ist
    val minChar = {text: String, min: Int -> text.length >= min}
    for(name in names) {
        if (minChar(name, 5)) {
            println(name)
        }
    }
    println("-----")


    // HIGHER ORDER FUNCTIONS - FUNKTIONEN HÖHERER ORDNUNG
    // sortieren - Liste nach Anfangsbuchstaben, Endbuchstabe, Länge, etc sortieren
    val lengthSortedNames = names.sortedBy { it.length }
    val lastCharSortedNames = names.sortedBy { it.last() }
    println(lengthSortedNames)
    println(lastCharSortedNames)
    println("-----")

    // for each - Code auf jedes Element der Liste anwenden, ähnlich zu for-in Schleife
    names.forEach{
        if(minChar(it, 5))
            println(it)
    }
    println("-----")


    // BREAK & CONTINUE
    val numbers: List<Int> = (1..10).toList()
    val longNumbers: List<Int> = (1..1_000_000).toList()

    // break - Abbrechen bei Werten
    for(number in numbers){
        if(number == 5)
            break
        println(number)
    }
    println("-----")

    // continue - Überspringen von Werten
    for(number in numbers){
        if(isEven(number))
            continue
        println(number)
    }
    println("-----")

    // break - Erster Wert teilbar durch 12 und 13, break um unnötige Rechnungen zu sparen
    for(number in longNumbers){
        println(number)
        if((number % 12 == 0) && (number % 13 == 0)){
            break
        }
    }






}

