package VORLESUNG.Woche08.Enums

enum class AugenFarbe {
    BLAU, GRUEN, BRAUN
}


class Person(var name: String, var augenFarbe: AugenFarbe) {}

fun main(){
    var personA = Person("Gordon", AugenFarbe.BLAU )
    var personB = Person("Zufall", AugenFarbe.values().random())
}