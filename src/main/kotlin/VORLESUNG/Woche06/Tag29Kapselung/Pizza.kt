package VORLESUNG.Woche06.Tag29Kapselung

class Pizza(var name: String, var ingredients: List<Ingredient>, var price: Double,) {

    init {
        println("Pizza $name mit dem PK initialisiert")

    }


    constructor(name: String) : this(
        name,
        listOf(
            Ingredient("Salami",0.4,9.0),
        Ingredient("Mozarella", 0.39,9.0)
        ),
        10.99) {
        println("Pizza $name mit SK initialisiert")
    }
}

class Ingredient(var name: String, var price: Double, kcal: Double){

}

fun main() {
    var mozarella: Pizza = Pizza(name ="Mozarella", ingredients = listOf(Ingredient("Salami",0.49, 10.0), Ingredient("Mozarella", 0.39, 10.0)), price = 9.99)

    var salami = Pizza(name = "Salami")

    var ingredients: List<Ingredient> = listOf(Ingredient("Salami",0.49,10.0), Ingredient("Mozarella", 0.39,20.0))

    var pizza = Pizza("Alfredo", ingredients, 10.99)

    println(pizza.name)
    println(pizza.ingredients) // druckt die speicheradressen aus, wir muessen auf die eigenschaften extra zugreifen
    println(pizza.ingredients[0].name)
    println(pizza.ingredients[0].price)
    println(pizza.price)

    println("Zutaten ausdrucken:")
    for (ingredient in ingredients){
        println(ingredient.name + " " + ingredient.price)
    }
}