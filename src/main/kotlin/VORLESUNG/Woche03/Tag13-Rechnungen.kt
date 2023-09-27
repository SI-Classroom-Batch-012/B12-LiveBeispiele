package VORLESUNG.Woche03

fun main(){
    println(add(10,20))
    println(add(100,99))
    println(add(101,37))
    println(add(readln().toInt(), readln().toInt()))
    var x: Int = 10
    var y: Int = 99
    add(x,y)
    add(11.0,1.0)
    add(99.5,33.4)

}

// add: Rechnen mit Parametern, ich will die beiden Zahlen, die ich als Parameter übergebe, addieren und das Ergebnis zurückgeben
fun add(x: Int, y: Int): Int{ // dank der Parameter kann ich immer verschiedene Zahlen übergeben und verschiedene rechnungen machen
    return x+y
}


// add: andere Signatur, gleiche Benennung möglich, solange die Parameter unterschiedliche Datentypen haben
fun add(number1: Double, number2: Double): Double {
    return number1+number2
}

fun sum1() : Int { // statisch, addiert immer dieselben zahlen, deshalb etwas sinnlos. lieber numbers als parameter nehmen
    var number1 = 20
    var number2 = 30
    return number1+number2
}


