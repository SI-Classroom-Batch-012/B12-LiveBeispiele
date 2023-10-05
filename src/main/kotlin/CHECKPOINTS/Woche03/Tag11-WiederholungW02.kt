package CHECKPOINTS.Woche03

fun main() {

    /*
     WOCHE 2:
        -> Lists und MutableLists
        -> Listenfunktionen
        -> Maps und Sets
        -> null
     */

    // Listen anlegen
    val movies: MutableList<String> = mutableListOf("The Shining", "Psycho", "Parasite", "Godfather")
    println(movies)

//     non-mutable
//    val moviesAlt: List<String> = listOf("Taxi Driver")
//    moviesAlt.add("Pulp Fiction")

    // Element holen
    println("Das 2. Element: ${movies[1]}")
//    println("Das 3. Element: ${movies.get(2)}")


    // Element hinzufügen (nur mutable)
    movies.add("Shawshank Redemption")
    movies.add(1, "Pulp Fiction")
    println(movies)


    //  Element ändern (nur mutable)
    movies[5] = "2001: A Space Odyssey"
    println(movies)


    // Element entfernen (nur mutable)
    val remove: Boolean = movies.remove("Psycho")
    val removeAt: String = movies.removeAt(0)
    println(".remove() Ergebnis: $remove")
    println(".removeAt() Ergebnis: $removeAt")
    println(movies)
    println()


    // Weitere Funktionen mit Hilfe der Folien/Google
    // first, last, min, max, average, indexOf, random, sort/sorted,
    // contains, isEmpty, subList, slice, reverse/reversed, clear
//    val random: String = movies.random()



    // Map anlegen
    val movieRatings: MutableMap<String, Double> = mutableMapOf(
        "The Shining" to 4.0,
        "Psycho" to 3.8,
        "Parasite" to 4.6,
        "The Godfather" to 4.3
    )
    println(movieRatings)


    // Element holen
    val ratingParasite: Double? = movieRatings["Parasite"]
    val ratingBarbie: Double? = movieRatings["Barbie"]
    println("Bewertung von Parasite: $ratingParasite")
    println("Bewertung von Barbie: $ratingBarbie")


    // Element hinzufügen (nur mutable)
    movieRatings["Barbie"] = 5.0
    println(movieRatings)


    // Element ändern (nur mutable)
    movieRatings["Psycho"] = 4.1
    println(movieRatings)


    // Element entfernen (nur mutable)
    val removeMap: Double? = movieRatings.remove("Psycho")
//    val removeMapPair: Boolean = movieRatings.remove("Parasite", 4.6)
    println(".remove(Key) Ergebnis: $removeMap")
//    println(".remove(Key, Value) Ergebnis: $removeMapPair")
    println(movieRatings)


    // nur keys/values
    println("Keys: ${movieRatings.keys.toList()}")
    println("Values: ${movieRatings.values.toList()}")

    // Funktionen
    // containsKey, containsValue, clear



    // null

    // Bei gültiger Eingabe Int, ansonsten null
    print("Gib eine Zahl ein: ")
    val number: Int? = readln().toIntOrNull()

    // safe-call ?. auf nullable Variable
    val newNumber: Int? = number?.minus(5)
    println("Safe-call: $number - 5 = $newNumber")

    // assert-call !!. auf nullable Variable
    val newNumber2: Int = number!!.minus(5)
    println("Assert-call: $number - 5 = $newNumber2")


    // Umwandeln von nullable
    val movie1Rating: Double = movieRatings["Parasite"]!!
    val movie2Rating: Double = movieRatings["The Shining"]!!
    val totalRating: Double = movie1Rating + movie2Rating
    println("Rating von Movie1 + Movie2: $totalRating")




}

