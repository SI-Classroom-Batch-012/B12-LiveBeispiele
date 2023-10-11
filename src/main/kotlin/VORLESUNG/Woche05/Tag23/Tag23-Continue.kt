package VORLESUNG.Woche05.Tag23

val CHARACTERS: MutableMap<String,Boolean> = mutableMapOf(
    "Harry Potter" to true,
    "Ron Weasley" to true,
    "Hermine Granger" to true,
    "Draco Malfoy" to false,
    "Ginny Weasley" to true,
    "Severus Snape" to false,
    "Luna Lovegood" to true,
    "Vincent Crabbe" to false,
    "Gregory Goyle" to false,
    "Albus Dumbledore" to true,
    "Lord Voldemort" to false
)



fun main(){
    // 1. gute Seite printen mit continue
    println("Diese Charaktere sind auf der Seite des Guten:")

//    for (character in CHARACTERS){
//        println(character)
//    }
//
//    for (character in CHARACTERS.keys){
//        println(character)
//    }
//
//    for (character in CHARACTERS.values){
//
//        println(character)
//    }

    printGoodGuys()




}

private fun printGoodGuys() {
    for ((character, status) in CHARACTERS) {
        // nur die guten ausdrucken:
        // wenn status gut (true ist): drucken
        if (status == true) {
            println("$character ist gut.")
            // wenn nicht: überspringen
        } else {
            continue
        }
    }
}



