fun main(){
    /* Was ist eine Variable?
        - sagt dem Programm, was wir wollen/woran wir arbeiten wollen
        - Träger von Informationen im Programm
        - kleinste Einheit im Programm und ein Behälter für jedwede Information
        - beschrifteter (= Variablenname) Karton, in den wir Daten packen.
    */

    // Variablen mit Datentypen anlegen
    /*
    Was sind Datentypen?
    - unsere Daten/Variablen sind immer von einem bestimmten Typ. Wir kennen 4 Basic Typen: Int, Double, String, Boolean
     */

    // Strings sind Zeichenketten
    //TODO var variablenname : Datentyp = inhalt

    var name: String = "Marianne"
    println(name)
    name = "Joachim"

    var isRaining: Boolean = true
    isRaining = false

    var number: Int = 10
    number = 11

    var nr: Double = 10.0
    nr = 100.0

    println("Bitte Namen eingeben...")
    // readln(): gibt immer einen String zurück, kann aber konvertiert werden
    name = readln()
    println(name)

    // leere Variablen nur mit Datentyp, ohne Inhalt anlegen
    println("Bitte Vornamen eingeben...")
    var vorname: String = readln()
    println("Bitte Email eingeben...")
    var email: String = readln()
    var telefonnummer: Int = readln().toInt()
    var geburtsjahr: String = readln()
    var reiseziel: String = readln()
    // Boolean: immer true oder false, wahr oder nicht wahr, 1 oder 0
    var vegetarisch: Boolean = readln().toBoolean()

    println("---------Boarding Pass---------")
    // $ im String: Interpolation bzw "escapen", nach dem $ wird der Text als Variable erkannt
    // \n im String: Zeilenumbruch
    println("Name: $name \nVorname: $vorname")
    println("Vorname: $vorname")
    println("email: $email")
    println("Telefonnr: $telefonnummer ")
    println("Geburtsjahr: $geburtsjahr")
    println("Ziel: $reiseziel ")
    println("Vegetarisch: $vegetarisch")







}