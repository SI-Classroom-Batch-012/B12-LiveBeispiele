package CHECKPOINTS.Woche06.Tag30


open class Policeman(
    name: String,
    age: Int,
    height: Double,
    weight: Int,
    hasWeapon: Boolean = true) : Person(name, age, height, weight){

     override fun work() {
        super.work()
        this.weight -= 3
    }

}

