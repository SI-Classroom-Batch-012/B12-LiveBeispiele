package CHECKPOINTS.Woche06.Tag30

fun main() {
    val person1 = Person("Xavier", 25, 1.80, 79)
    var police1 =  Policeman("Henk", 33, 1.79, 75)
    var police2 = Officeworker("Ken", 45, 1.90, 85)

    person1.work()
    println(person1.weight)

    police1.work()
    println(police1.weight)

    police2.work()
    println(police2.weight)

}