package CHECKPOINTS.Woche05


//For Schleife
// for(variablenname (nennt ihn so wie ihr wollt, aber passend)  in liste/sequence/collection)
// for(film in filmeliste)
//for (song in musikliste)
//for (i in zahlenreihe)


// for(variablenname in liste/sequence/collection) {
//
// //ausühbarer Code/Funktion/Anweisung
// print(variable)
//print(film)
//print(i+1)
// rechnen(variable+1)
//
//}

// for(film in filmeliste) { (harry potter, batman, joker)
// if(film == "harry potter") -- richtiger film
// else mach iwas anderes
//
//}


//SYNTAX
// for(variablenname(eigenschaft des einzelnen elements) in liste/sequence/collection) {
//
// //ausühbarer Code/Funktion/Anweisung
//
//}

// liste mit string -- string
// liste mit integer -- integers
// liste mit char -- char


fun printRange() {
    for(number in 1..9) {
        //number = 1
        //number = 2
        //number = 3
        if(number == 2) {
            println("jo hab ne 2 gefunden")
        }
        println(number) //ein listwert bzw. Integerwert, da die liste jetzt aufgesplittet
    }

    var list = (1..9).toList()
    println(list)
}

fun printspecrange() {
    var numberlist = (1..9).toList()
    for(number in 3 until numberlist.size) {
        println(number)
    }
}

//for(variable in (startwert) until (endwert)){
// anweisung
//}

fun forsteps() {
    var numberlist = (1..9).toList()
    for (number in numberlist.indices step 2) {
        println(number.toString())
    }
}

//for(variable in liste step anzahlüberspringungen){
// anweisung
//}

fun filme(){
    val lieblingsFilme: List<String> = listOf(
        "Batman",
        "Breaking Bad",
        "Attack on Titan",
        "Planet der Affen"
    )

    for(film in lieblingsFilme) {
        // film == batman
        if(film == "Breaking Bad" || film == "Batman") { //wenn filmname gleich breaking bad ist oder filmname gleich batman, dann geh weiter in der if funktion
            println(film)//batman wurde gefunden
        }
    }
}



fun main() {
    //printRange()
    //printspecrange()
    //forsteps()
    filme()

}


