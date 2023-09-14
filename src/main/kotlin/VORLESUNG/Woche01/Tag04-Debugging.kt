package VORLESUNG.Woche01

fun main(){

    println("Bitte deinen Namen eingeben:")
    val userName = readln()
    println("Hey $userName!")

    println("Wie alt bist du?")
    val userAge = readln()
    println("Okay, du bist $userAge Jahre alt.")

    println("Lasst uns ausrechnen, wie alt du in 2050 sein wirst!")
    val ageAsNumber = userAge.toInt()
    val ageIn2050 = ageAsNumber+27
    println("$userName's Alter in 2020: $ageIn2050")

}