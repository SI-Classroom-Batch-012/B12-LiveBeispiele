package VORLESUNG.W02.D04

fun main(){

    // WIEDERHOLUNG: NULL

    // nullable Variable (nullable bedeutet: kann null enthalten. Das ? macht's hinterm Datentyp möglich)
    var nullableNumber: Int? = 33

    // mit einer nullable Variable weiterarbeiten: wir brauchen einen SAFE CALL (?) oder einen NON NULL ASSERTED CALL (!!)

        // Safe Call: falls in nullableNumber null steht, wird einfach null statt dem gewollten Double zurück gegeben und das Programm läuft weiter
        nullableNumber?.toDouble()

        // Non Null Asserted Call: wir garantierem dem Compiler, dass hier nicht null drin steht. Ist die Variable dann doch null, stürzt das Programm ab.
        nullableNumber = null
       // nullableNumber!!.toInt()


    // WIEDERHOLUNG: LISTEN ANLEGEN
    var shrekMovies: List<String> = listOf("Shrek", "Shrek 2", "Shrek The Third", "Shrek 4ever after")
    var marvelMovies: MutableList<String> = mutableListOf("Iron Man", "The Incredible Hulk", "Iron Man 2", "Thor", "Captain America: The First Avenger", "The Avengers")

    // NEUER STOFF: MAPS

// Map anlegen
    // generelle formel: var mapName: Map<Key-Datentyp, Value-Datentyp> = mapOf(key1 to value1, key2 to value2, etc)

    var articles: Map<String,Double> = mapOf(
        "Banane" to 1.99,
        "Erdbeere" to 2.99,
        "Kaffee" to 5.99,
        "Zahnpasta" to 2.49,
        "Milch" to 1.49
    )

    println(articles)

// wichtige Map Operationen (lesend, auf Maps und MutableMaps anwendbar, Äquivalent zu vielen Listenoperationen)

    // size
    articles.size

    // isEmpty
    articles.isEmpty()

    // contains: will den Key, nicht den Value
    var containsCoffee: Boolean = articles.contains("Kaffee")

    // containsKey()
    var containsMilk: Boolean = articles.containsKey("Milch")

    // containsValue() : nur hier können wir direkt die Values durchsuchen
    var containsPrice: Boolean = articles.containsValue(1.49)

    // get(key)  (äquivalent zu articles[key]) -> gibt den value des keys zurück
    var valueBeiMilk: Double? = articles.get("Milch")
    // mit [ ] auf elemente zugreifen,
    var valueKaffee: Double? = articles["Kaffee"]

    // .keys  gibt alle keys als SET zurück
    var allKeys = articles.keys
    //println(allKeys)

    // .values  gibt alle values als LISTE zurück
    var allValues = articles.values
    // println(allValues)

    // .entries gibt alle einträge zurück
    var allEntries = articles.entries
    println(allEntries)

// wichtige schreibende Map Operationen (NUR auf MutableMaps möglich)

    var mutableArticles: MutableMap<String, Double> = articles.toMutableMap()

    // put(key, value) fügt ein neues Key Value Paar hinzu (oder überschreibt den Value eines Existierenden Keys, wenn der übergebene Key damit übereinstimmt)
    mutableArticles.put("Pizza", 2.49)
    //println(mutableArticles)

    // remove mit Key-Übergabe: Entfernt Value und Key, gibt den gelöschten Value (nicht Key) zurück
    mutableArticles.remove("Kaffee")
    // println(mutableArticles)

    // remove mit key UND value übergabe: der value muss genau zum key passen, sonst wird false zurückgegeben und nichts gelöscht
    var removeSuccessful = mutableArticles.remove("Banane", 1.39) // gibt false zurück, da 1.39 der falsche Key ist
    // println(mutableArticles)

    // clear() löscht alle elemente aus der map
    mutableArticles.clear()
    println(mutableArticles)

    // mit [] neue elemente hinzufügen: wenn der key nicht existiert, wird er mit dem value neu hinzugefügt
    mutableArticles["Orange"] = 0.39
    mutableArticles["Birne"] = 0.29
    println(mutableArticles)

    // mit [] den Value bestehender Keys verändern
    mutableArticles["Orange"] = 0.19 // Orange gab es schon, deshalb wird dort ein neuer Value reingeschrieben
    println(mutableArticles)

    // Nullability bei Maps: mit Datentyp angabe, sonst automatisch
    var orangePrice: Double? = mutableArticles["Orange"]





    // Komplexere Map, die je einen Key auf eine Liste an Values mappt: Discographies

    var aerzteMusik: List<String> = listOf("13", "Geräusch", "auch", "Jazz ist anders", "Bäst Of")

    var discographies: Map<String, List<String>> = mutableMapOf(
        "Taylor Swift" to listOf("1989", "Speak Now", "Folklore", "Midnights"),
        "Lorde" to listOf("Pure Heroine", "Melodrama", "Solar Power"),
        "Biggie Smalls" to listOf("Ready to Die", "Life After Death", "Album3"),
        "Die Ärzte" to aerzteMusik,
        "Nena" to listOf("99 Luftballons", "Irgendwie, irgendwo, irgendwann", "Nur geträumt")
    )
    println(discographies)
    println(discographies.keys)

    // Komplexere Map, die je einen Key auf eine Liste an Values mappt:
    var lordeList: MutableList<String> = mutableListOf("Royals", "Ribs", "Solar Power")
    var music: MutableMap<String,MutableList<String>> = mutableMapOf(
        "Taylor Swift" to mutableListOf("Blank Space", "Shake It Off", "Anti-Hero"),
        "Lorde" to lordeList,
        "Die Ärzte" to mutableListOf("Schrei nach Liebe", "Hurra", "1/2 Lovesong")
    )

    println(music)
    println(music.keys)
    println(music.values)

    // Operationen an Listen in Maps
    // Element hinzufügen
    music["Taylor Swift"]?.add("Karma")
    // Element entfernen
    music["Lorde"]?.remove("Royals")
    // neuen Key und Value in die Map einfügen
    music["Adele"] = mutableListOf("Hello","Rolling in the Deep", "Someone Like You")
    // Key und dessen Value entfernen
    music.remove("Die Ärzte")
    // Existiert ein bestimmter Key?
    val artistExists = music.containsKey("Taylor Swift")
    // existiert ein bestimmes Element in den Values eines Keys?
    music["Lorde"]?.contains("Royals")








}