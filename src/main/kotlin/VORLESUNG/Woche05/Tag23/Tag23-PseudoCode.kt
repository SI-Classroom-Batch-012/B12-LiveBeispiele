package VORLESUNG.`W05-Schleifen`.d03

import kotlin.math.sqrt

fun main(){
val lyrics = "Every night, I live and die\n" +
        "Feel the party to my bones\n" +
        "Watch the wasters blow the speakers\n" +
        "Spill my guts beneath the outdoor light\n" +
        "It's just another graceless night\n" +
        "I hate the headlines and the weather\n" +
        "I'm nineteen and I'm on fire\n" +
        "But when we're dancing, I'm alright\n" +
        "It's just another graceless night\n" +
        "\n" +
        "Are you lost enough?\n" +
        "Have another drink, get lost in us\n" +
        "This is how we get notorious, oh\n" +
        "'Cause I don't know\n" +
        "If they keep tellin' me where to go\n" +
        "I'll blow my brains out to the radio, oh-oh-oh (Tch-tch)\n" +
        "\n" +
        "All of the things we're taking\n" +
        "'Cause we are young and we're ashamed\n" +
        "Send us to perfect places\n" +
        "All of our heroes fading\n" +
        "Now I can't stand to be alone\n" +
        "Let's go to perfect places\n".lowercase()



    // erstmal: nur der buchstabe 'a', danach können wir weiter abstrahieren

    countLetter(lyrics,'a')
    countLetter(lyrics,'y')

    // wenn a vorkommt:
    // counter erhöhen


    // Anzahl jedes Buchstabens zählen
    var abc: CharRange = 'a'..'z'
    for (buchstabe in abc){
        var counter = 0
        for (char in lyrics){
            if (char == buchstabe){
                counter++
            }

        }
        Thread.sleep(500)
        println("Der Buchstabe $buchstabe kommt $counter mal im Song vor.")
    }
}

private fun countLetter(lyrics: String, letter: Char) {
    // vorkommen des buchstaben a zählen
    // counter variable, die as zählt
    var counter = 0

    // wiederhole: lyrics durchgehen
    for (char in lyrics) {
        if (char == letter) {
            counter++
//            if (counter == 5){
//                println(" 5 as gefunden, abbrechen...")
//                break
//            }
        }
    }
    println("Der Buchstabe $letter kommt $counter mal vor.")
}