open class Tier (var name: String, var alter: Int) {

   /* constructor(text: String){
        val daten = text.split(",")

        this.name = daten[0]
        this.alter = daten[1].toInt()
    }*/


    open fun save(): String{
        return "$name,$alter"
    }
}