package VORLESUNG.Woche01

fun main(){

    // Mathematische Operationen:

    // Plus (Addition) mit Ints, Ergebnis nennt sich Summe
    var intSum = 30+70
    println("intSum = $intSum")

    var number1: Int = 13
    var number2: Int = 3
    var intSumWithVar: Int =  number1 + number2
    println("intSumWithVar = $intSumWithVar")

    // Minus (Subtraktion) mit Doubles, Ergebnis nennt sich Differenz, deshalb doubleDiff
    var ergebnisGeteiltMitDouble = 10.0 - 3.0
    println("doubleDif = $ergebnisGeteiltMitDouble")

    // Dominiks Frage: Punkt vor Strich Rechnung
    var result = 16/(2*2)
    println("Punkt vor Strich: $result")

    // weiteres Beispiel: Punkt vor Strich ohne Klammer
    var resultWoBracket = 20/2+2 // Ergebnis: 12
    println("Result2 = $resultWoBracket")

    var resultWithBracket = 20/(2+2) // Ergebnis: 5
    println("Result Mit Klammern = $resultWithBracket")


    var intNumber: Int = 40
    var doubleNumber: Double = 60.5
    var intDoubleResult: Double = intNumber + doubleNumber // Ergebnis von Int und Double ist immer Double
    println("Ergebnis $intNumber + $doubleNumber = $intDoubleResult")


    // Modulo: Rest einer Division
    //
    var moduloResult = 5 % 2 // Ergebnis: 5/2 = 2 geht 2mal rein und erreicht 4, es fehlt noch 1 bis zur 5 --> 1 kommt raus
    println("ModuloResult: $moduloResult")

    var evenNumber = 20
    var result2 = evenNumber%2 // Ergebnis: 0,  20/2 = 10, die 10*2 ergbit 20 --> kein Rest, Ergebnis ist 0
    println("Ist $evenNumber gerade? Wenn ja, ist result2=0, stimmt das? -> $result2")

    // Strings konkatenieren
    var hello: String = "Hello "
    var world: String = "World"

    var helloWorld: String = hello+world+ " " + 30+ " " + 1.0 // ist das gleiche wie "$hello$world 30 1.0"
    println(helloWorld)






}