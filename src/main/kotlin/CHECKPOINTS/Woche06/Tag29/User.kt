package CHECKPOINTS.Woche06.Tag29


open class User(
    var name: String,
    var password: String,
    var age: Int
){
    override fun toString(): String {
        return "User(name=$name, password=$password, age=$age)"
    }

    fun rede(){
        println("Hallo, mein Name ist $name")
    }
}