package CHECKPOINTS.Woche06.Tag30

open class Person(var name: String,
                  var age :Int,
                  var height: Double,
                  var weight: Int) {

    open fun work() {
        this.weight -= 2
    }
}