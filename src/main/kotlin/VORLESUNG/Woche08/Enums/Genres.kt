package VORLESUNG.Woche08.Enums


enum class Genre {
    Action, Drama, Comedy;

    override fun toString(): String {
        return name.uppercase()
    }
}

class Movie(
    val titel: String,
    val genre: Genre,
) {

    override fun toString(): String {
        return "$titel, $genre"
    }
}

class Serie(
    val titel: String,
    val genre: Genre,
    var staffeln: Int
)

fun main() {


    val movie1 = Movie("Inception", Genre.Action)
    val movie2 = Movie("Django Unchained", Genre.Drama)
    println(movie1.genre)
    println(movie2)


    val serie1 = Serie("Friends", Genre.Comedy, 10)
    val serie2 = Serie("Stranger Things", Genre.Drama, 4)
    val serie3 = Serie("The Last of Us", Genre.Action, 1)
}