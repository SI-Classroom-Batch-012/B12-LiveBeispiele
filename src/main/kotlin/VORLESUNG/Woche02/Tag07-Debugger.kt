package VORLESUNG.Woche02

fun main(){

    // IndexOutOfBoundsException
    val numbers: List<Int> = listOf(98,347,50,21,57,77,84,31)
    // diese Zeile:
    println(numbers[numbers.size-1])
    // ist das gleiche wie:
    println(numbers[7])

    // Werte der Variablen mit Debugger auslesen
    val number1 = 5
    val number2 = 3

    val sum = number1 + number2
    val product = number1 * number2

    println("Sum: $sum")
    println("Product: $product")


}