package CHECKPOINTS.Woche04


// Die FilmListe hat alle unsere Filme
val filmListe = mutableListOf<String>(
    "The Dark Knight",
    "The Shawshank Redemption",
    "Schindler's List",
    "The Godfather",
    "The Matrix",
)

// Die Preisliste speichert den Preis zu jedem Filmtitel
val filmToPrice = mutableMapOf<String, Double>(
    "The Dark Knight" to generateRandomPrice(),
    "The Shawshank Redemption" to generateRandomPrice(),
    "Schindler's List" to generateRandomPrice(),
    "The Godfather" to generateRandomPrice(),
    "The Matrix" to generateRandomPrice(),
)

fun generateRandomPrice(): Double {
    val euro = (2..4).random()
    val cent = (0..99).random()
    return euro + cent.toDouble() / 100
}

fun filmHinzufuegen(filmName: String){
    filmListe.add(filmName)
    filmToPrice[filmName] = generateRandomPrice()
}

fun filmEntfernen(filmName: String){
    filmListe.remove(filmName)
    filmToPrice.remove(filmName)
}


fun filmPreisZurueckgeben(filmName: String): Double{
    return filmToPrice[filmName]!!
}

fun guenstigsterFilm(): Double{
    return filmToPrice.values.min()
}

/**
 * Funktion zum Verkaufen von einem Film
 * @param filmName der Name des Films, der verkauft werden soll
 * @param einkauferKonto wie viel Geld auf dem Konto des Käufers ist
 * @return Gibt true zurück, wenn der Film erfolgreich verkauft wurde, ansonsten false.
 */
fun filmVerkaufen(filmName: String, einkauferKonto: Double): Boolean{
    val preisVomFilm: Double = filmPreisZurueckgeben(filmName)

    // Check, ob genug Geld auf dem Konto liegt
    if(preisVomFilm <= einkauferKonto){
        filmEntfernen(filmName)
        return true
    }else {
        return false
    }
}

fun main(){
    val benutzerNiklasKonto: Double = 10.0

    filmHinzufuegen("Oppenheimer")
    filmEntfernen("Oppenheimer")

    println("Welchen Film willst du kaufen? :")
    val eingabe = readln()
    println("OK. Der Film $eingabe kostet ${filmPreisZurueckgeben(eingabe)}")
    println("Du hast $benutzerNiklasKonto € Auf deinem Konto.")

    val erfolgreichVerkauft = filmVerkaufen(eingabe, benutzerNiklasKonto)

    if(erfolgreichVerkauft){
        println("Du hast den Film gekauft")
    }else{
        println("Du hast den Film nicht gekauft")
    }
}

