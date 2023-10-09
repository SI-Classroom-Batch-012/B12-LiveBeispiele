package VORLESUNG.Woche04.Tag20Wiederholung
fun main(){

   // triggerNullPointerEx(null)

   // println("Bitte eine Zahl eingeben")
   // triggerNumberFormatEx(readln())

    try {
        triggerIndexOutOfBounds(listOf(1,2))

    } catch (e: Exception){
        println("Fehler bei Aufruf in der Main: $e")
    }

    triggerArithmeticEx()

    println("Hier kommen wir nur rein, wenn die Fehler korrekt abgefangen wurden und das Programm trotz Fehlern durchläuft")


}

fun triggerNullPointerEx(string: String?) {
    try {
        val length = string!!.length
        println("Die Länge ist $length")
    } catch (e: Exception) {
        println("Fehler in der Funktion triggerNullPointerEx! $e")
        // weiterer Code
    }
}

fun triggerNumberFormatEx(zahl: String ) : Int {
    try {
        return zahl.toInt()
    }
    catch (e: Exception){
        println("Fehler in triggerNumberFormatEx: $e")
        println("Bitte gib eine andere Zahl ein:")
        var input = readln()
        triggerNumberFormatEx(input)
        // alternative: return 0 // statt dem gewollten Int einfach 0 returnen, damit das Programm weiterlaufen kann
    }
    return 0
}

fun triggerIndexOutOfBounds(list: List<Int>){
    try{
        val element = list[5]
        println("Das 5. Element in der Liste ist: $element")
    } catch (e: Exception) {
        println("Fehler in triggerIndexOutOfBoundsEx! $e")
        throw e // Fehler werfen: Programm stürzt dann doch ab
        var x = 9 // unerrreichbarer Code: throw ist wie return, danach wird aus dem Block rausgesprungen
    }
}

fun triggerArithmeticEx() : Int {
    var result = 0
    try {
        result = 10 / 0
        println("Ergebnis der Rechnung: $result")
        return result
    } catch (e: Exception) {
        println("Oh nein, Fehler! $e")
        // Standardmäßig -1 in result schreiben, falls was schief läuft
        result = -1

    }

    println("Hier kommen wir nur an, wenn das Programm nicht abstürzt")
    println("Result ist jetzt $result")
    return result
}


