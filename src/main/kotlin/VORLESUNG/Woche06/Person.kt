package VORLESUNG.Woche06

/**
 * class Person
 * @property name Der Name der Person
 * @property age Das Alter
 * @property eyeColor: Die Augenfarbe
 * @property password: Das Passwort
 */
class Person {

    // Daten/Attribute: Default Initialisierung, d.h.: jede Instanz dieser Klasse Person wird genau diese Eigenschaften haben, es sei denn, wir ueberschreiben sie
    var name: String = getRandomName()

    private fun getRandomName(): String {
        return listOf("Hans", "Peter", "Maya").random()
    }

    var age: Int = 0
    var eyeColor: String = "brown"
    var password: String = "1234"
    // Klassen koennen auch andere Klassen als Atrribute haben
    var hund: Dog = Dog()
    var favoriteSinger: Singer = Singer()



    fun greeting(){
        println("Hi, mein Name ist $name und ich bin $age Jahre alt. Wie geht's?")
    }

    fun printAllInfo(){
        println("Name: $name")
        println("Alter: $age")
        println("EyeColor: $eyeColor")
    }

    fun login(passwort: String){
        if (passwort == password){
            println("Erfolreich $name eingeloggt!")
            printAllInfo()
        } else println("Passwort falsch, Login von $name abbrechen...")

    }


}