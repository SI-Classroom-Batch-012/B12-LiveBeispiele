package VORLESUNG.Woche03.Tag13Parameter

fun main(){
     var nameMap: Map<String, Int> = mapOf(
         "Jonas" to 11,
         "Marie" to 19,
         "Jennie" to 50
         )

    // Selber geschriebene Parameter-Funktion mit Argumenten aufrufen

        // 1. Variante: direkt die Werte mit den gefragten Datentypen übergeben
        greetPerson("John", 20, "Berlin", 19283)
        greetPerson("Marie", 30, "Hamburg", 21334)
        greetPerson("Jonas", 5, "Lissabon", 28136)

        // 2. Variante: Werte in Variablen packen, diese Variablen übergeben
        var name = "Taylor"
        var age = 13
        var city = "London"
        var plz = 12947
        greetPerson(name,age,city,plz)


        // 3. Variante: direkt Ergebnisse von Funktionsaufrufen übergeben, ohne sie in Variablen zwischenzuspeichern
        println("Namen und danach Alter eingeben...")
        greetPerson(readln(), readln().toInt(), readln(), readln().toInt())
        println(nameMap["Jonas"])

        // 4. Variante: man kann auch direkt auf einen Wert in einer Map zugreifen und den übergeben, bei Listen gilt dasselbe
        greetPerson("Jonas", nameMap["Jennie"]!!, "Bonn", 129847)

        var result = sum1()
        println(result)


    greet("Finn")
    greet(name)
    greet("Leon")
    // kein Argument -> Default Wert Anonym wird genommen
    greet()
    greet("Marcel")


}

/**
 * Begrüßt eine Person mit ihrem Namen.
 * @param name Der Name der Person, die begrüßt werden soll. Standardmäßig ist der Name "Anonym".
 */
// Default Parameter: wenn ich nichts übergebe, wird auf den Default zurück gefallen
fun greet(name: String = "Anonym"){
    println("Hallo, $name")
}

/**
 * Begrüßt eine Person mit ihrem Namen, Alter, Wohnort und Postleitzahl.
 *
 * @param name Der Name der Person, die begrüßt werden soll.
 * @param age Das Alter der Person.
 * @param city Der Wohnort der Person.
 * @param plz Die Postleitzahl des Wohnorts.
 */
fun greetPerson(name: String, age: Int, city: String, plz: Int){
//    city = "Berlin" // -> nicht möglich, parameter sind immer konstant (zumindest value types, also int, double, boolean, string)
    println("Hallo, $name")
    println("$name lebt in $city mit der PLZ $plz")
    println("$name ist $age Jahre alt.")
    println("$name ist seit $age Jahren sehr nett.")
}
