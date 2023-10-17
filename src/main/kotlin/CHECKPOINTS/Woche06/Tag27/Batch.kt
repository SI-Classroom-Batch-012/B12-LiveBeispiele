package CHECKPOINTS.Woche06.Tag27

//TODO: Eine Klasse Batch erstellen mit den Attributen batchNr(Int), roomNr(String), module(String) und member(?)
//TODO: Schreibe dazu 1 Funktionen, die überprüft ob eine Person Mitglied eines Batches ist

class Batch(var batchNr: Int, var roomNr: String, var module: String, var member: MutableList<Person>) {

    fun isMember(person: Person){
        if(member.contains(person)) {
            println("Die Person ${person.name} ist Mitglied des Batches!")
        } else {
            println("Die Person ${person.name} ist nicht Mitglied des Batches!")
        }
    }
}

fun main() {
    var person1 =  Person("Maxim", 85.9, 1.90)
    var person2 =  Person("Charles", 72.5, 1.75)
    var person3 =  Person("Xavier", 79.1, 1.77)
    var batch1 = Batch(1, "32c", "Grundlagen Kotlin",
        mutableListOf(person1, person2)
    )
    batch1.isMember(person1)
    batch1.isMember(person3)
}