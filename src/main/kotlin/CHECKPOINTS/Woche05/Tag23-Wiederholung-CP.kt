package CHECKPOINTS.Woche05

import java.lang.NumberFormatException


// For schleife
// for (variable in liste/sequence/collection) {}

fun printrange() {
    for (number in 1..9) {
        print(number)
    }
}

fun printSpecRange() {
    for (number in 1 until 9) {
        print(number)
    }
}


fun printSpecRange2() {
    var charlist = ('a'..'z').toList()
    for (number in 3 until charlist.size) { //26 <= x < 26
        print(charlist[number])
    }
}

fun forInFor() {
    var numberlist = (1..9).toList()
    var charlist = ('a'..'z').toList()

    for (number in numberlist) { // erste Iteration mit 1
        print(number)
        for (char in charlist) {
            print(char)
        }
        print("\n")
    }
}

fun forLoopAbc() {
    var numberlist = (1..9).toList()
    var charlist = ('a'..'z').toList()
    for (number in numberlist) {
        print(number)
        print("${charlist[number]}\n")
    }
}

fun forSteps() {
    var numberlist = (1..9).toList()

    for (i in numberlist.indices step 2) {
        print(i)
    }
    println()
    for (i in 0..9 step 3) {
        print(i)
    }
}


// While(Bedingung) {}

// solange die Bedingung erfüllt ist, läuft die Schleife weiter, bis sie nicht mehr erfüllt ist

fun whileExample1() {
    var count: Int = 9
    var limit: Int = 10

    while (count <= limit) {
        println("Number: $count")
        count++
    }
}

fun whileSonnig() {
    var sonnig = true
    while (sonnig) {
        print("Sonne yeah")
        sonnig = false
    }
}

fun whileAndFor() {
    var count: Int = 10
    var limit: Int = 1

    while (count >= limit) {
        for (i in 1..9 step 2) {
            print(i)
        }
        println("Number: $count")
        count--
    }
}

// DoWhile
// do {} while (Bedingung)

// erst läuft der code, dann wird die Bedingung angeschaut


fun doWhileExample1() {
    var count: Int = 1
    var limit: Int = 10

    do {
        println("Number: $count")
        count++
    } while (count <= limit)
}

fun readInput() {

    var sum: Int = 0
    var input: String
    println("Enter an integer every time the line pops up. Stop the calculation by entering \"0\"")
    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")
}

fun useTryCatch() {
    try {
        print("Gib eine Zahl ein:")
        val z = readln().toInt()
        println("Du hast die Zahl $z eingegeben.")
        //val l = mutableListOf(1,2)
        //println(l[3])
    }

    //val zahl: Int
    catch (e: NumberFormatException) {
        println("ACHTUNG!")
        println("Diese Fehlermeldung wurde geworfen: ${e}")
        throw e
        //println("Bitte probiere es noch einmal.")
        //useTryCatch()
        // Funktionen aufrufen
        // printlns
        // Fenster anzeigen
    } catch (e1: IndexOutOfBoundsException) {
        println("Du hast einen index benutzt, der nicht auf die Liste angewendet werden kann. $e1")
    } finally {
        println("Ich werde immer erreicht.")
    }

}

fun nutzeTryCatchFunktion() {
    try {
        useTryCatch()
    } catch (e: Exception) {
        println("Es wurde eine Exception geworfen.")
    }

}


fun main() {
    printrange()
    println()
    printSpecRange()
    println()
    printSpecRange2()
    println()
    forInFor()
    println()
    forLoopAbc()
    println()
    forSteps()
    println()
    whileExample1()
    println()
    whileSonnig()
    println()
    whileAndFor()
    println()
    doWhileExample1()
    println()
    //readInput()
    //useTryCatch()
    nutzeTryCatchFunktion()
}