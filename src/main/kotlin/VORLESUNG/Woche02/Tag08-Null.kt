package VORLESUNG.Woche02

fun main(){
    // nullable Variable anlegen: braucht ? (nullable bedeutet: es darf null in der Variable stehen)

    var nullableName: String? = null
    println(nullableName)
    nullableName = "Harry"
    println(nullableName)
    nullableName = null
    println(nullableName)

    // auch konstanten können null sein:
    val constInt: Int? = null


    // NullPointerException
    var name: String? = "Jason" // nullable String variable,
    var jasonLength = name?.length
    println(jasonLength)
    name = null // wird auf null gesetzt
    var nameLength = name?.length
    println(name)



    // SAFE CALL: den benutzen wir best practice mässig immer, umgeht programm absturz, falls null drin steht, gibt einfach null zurück und läuft dann weiter
    var integer: Int? = 9
    var integerToDouble: Double? = integer?.toDouble()
    integerToDouble = null
    integer = null
    var x: Int? = integerToDouble?.toInt()



    // NON NULL ASSERTED CALL: garantiert dem Compiler: keine Sorge, hier steht kein null drin.
    // Gefahr: bringt Programm zum abstürzen, falls doch null in der Variable steht.
    // Zum gezielten Fehler suchen nutzbar
    var double: Double? = null
   // var doubleToInt: Int = double!!.toInt() // führt zum Absturz, da null in double steht

    // nullable Variablen können zu jedem Zeitpunkt wieder auf null gesetzt werden
    double = null


    // null in Listen
    // Strings
    val movieList: MutableList<String?> = mutableListOf("Oppenheimer", null, "Barbie", "Meg 2")
    println(movieList)
    movieList[1] = "The Nun 2"
    println(movieList)
    movieList[1] = null
    movieList[0] = movieList[0] + " ist ein Film."
    println(movieList)
    movieList[1] = movieList[1] + " ist auch ein Film."
    println(movieList)

    // Ints
    val numbersList: MutableList<Int?> = mutableListOf(1,2,3,4,null,6,7,8,9)
    println(numbersList)
    numbersList[0] = numbersList[0]!!+10
    println(numbersList)
    numbersList[4] = numbersList[4]?.plus(10)
    println("Wir haben versucht, null+10 zu rechnen, hat es geklappt? " + numbersList)











}