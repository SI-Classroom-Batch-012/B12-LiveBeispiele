package VORLESUNG.Woche06.`Tag28-Vererbung`

// Wiederholung Konstruktoren
class Student(var name: String) {

    // damit die PK studenten auch ein alter haben, ist immer default wert 0
    // var age = 0
    init {
        // PK = Primaerer Konstruktor
        println("PK: Instanz der Klasse Student mit Namen $name initialisiert.")
    }

    fun greeting(){
        println("Hi, ich bin $name!")
    }

    constructor(name: String, age: Int) : this(name){
        println("SK: Instanz mit SK erstellt, Name: $name, Alter: $age")
    }

    constructor(name: String, age: Int, matrikelNr: Int): this(name){ // this (name, age) wäre auch moeglich, dann wuerden wir in den SK springen beim Instanziieren
        println("Dritter Konstruktor: Student mit matrikelnr $matrikelNr erstellt.")
    }

}

fun main() {
    // mit PK
    var student: Student = Student("Johnny")
    var student2: Student = Student("Michelle")


    student.greeting()

    // mit SK
    var sekStudent: Student = Student("Alice",20)

    // mit drittem Konstruktor
    var drittStudent: Student = Student("Mark",20,12345)






}