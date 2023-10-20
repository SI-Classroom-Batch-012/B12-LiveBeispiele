package CHECKPOINTS.Woche06.Tag30

class Officeworker( name: String,
                    age: Int,
                    height: Double,
                    weight: Int,
    hasWeapon: Boolean = false) : Policeman(name, age, height, weight, hasWeapon) {


    override fun work() {
        super.work()
        this.weight -= 1
    }
}