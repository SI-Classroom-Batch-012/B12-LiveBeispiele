package VORLESUNG.Woche06

import kotlin.math.sin

// Main, in der wir alle Klassen instanziieren (= konkrete Objekte erstellen)
fun main() {
    var x: Int = 0
    x = 1

    // Instanziierung der Klasse Person:
    // 2 konkrete Instanzen (emily und dennis) anlegen
//    var emily: Person = Person()
//    var dennis: Person = Person()
//
//    emily.name = "Emily"
//    emily.age = 19
//    emily.eyeColor = "blau"
//    emily.password = "passwort"
//
//
//    println("1. Instanz von Person: Emily")
//    println("Name: ")
//    println(emily.name)
//    println("Alter: ")
//    println(emily.age)
//    println("Augenfarbe: ${emily.eyeColor}")
//    // Emily gruesst uns:
//    emily.greeting()
//    println("-----")
//
//
//    println("2. Instanz von Person: Dennis")
//    println("Name: ")
//    dennis.greeting()
//    dennis.name = "Dennis"
//    dennis.age = 30
//    println("----")
//    dennis.greeting()
//    println("----")
//    dennis.printAllInfo()
//    println(maya.name)
//    maya.login("1234")
//    emily.login("1234")
//





    var maya: Person = Person()
    maya.name = "Maya"
    maya.hund.bark()

   println("----- Klasse Hund----")

    var dogNamedLuzie: Dog = Dog()
    println(dogNamedLuzie.name)
    dogNamedLuzie.bark()
    dogNamedLuzie.name = "Luzie"

    // in Mayas Hund die Variable dogNamedLuzie reinschreiben, sodass der Hund jetzt Luzie heißt
    maya.hund = dogNamedLuzie
    maya.hund.bark()

    maya.hund.name = "Peter"
    maya.hund.bark()
    println(maya.favoriteSinger.name) // Ed Sheeran

    // namen von maya's lieblingssänger ändern
    maya.favoriteSinger.name = "Taylor Swift"
    maya.favoriteSinger.singSong()

    var singer: Singer = Singer()
    println(singer.name)
    singer.singSong()



}