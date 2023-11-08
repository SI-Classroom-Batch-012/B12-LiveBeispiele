package VORLESUNG.Woche08.Enums

class Held (
    var name: String,
    var lp: Int,
    var dmg: IntRange
){
    val maxLP = lp

    override fun toString(): String {
        return "$name \n  LP: $lp/$maxLP \n  DMG: $dmg"
    }

}


fun main(){

    var held1 = Held("Bruno Mars", 50, 5..10)
    var held2 = Held("Sarah Connor", 45, 7..12)


//    println(held1.toString())
//    println("${held1.toString()}")
    println("$held1")
    println()
    println(held2)




}