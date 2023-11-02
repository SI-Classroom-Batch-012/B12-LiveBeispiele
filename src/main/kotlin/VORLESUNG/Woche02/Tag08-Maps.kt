package VORLESUNG.Woche02

import java.util.*

fun main(){
// Map anlegen
    // generelle formel: var mapName: Map<Key-Datentyp, Value-Datentyp> = mapOf(key1 to value1, key2 to value2, etc)

    var articles: Map<String,Double> = mapOf(
        "Banane" to 1.99,
        "Erdbeeren" to 2.99,
        "Zahnpasta" to 2.49,
        "Milch" to 1.49
    )
    println(articles)
    println("Der Preis einer Banane ist: " + articles["Banane"])



// wichtige lesende Map Operationen (lesend, auf Maps und MutableMaps anwendbar, Äquivalent zu vielen Listenoperationen)

    // size
    var size: Int = articles.size

    // isEmpty
    var isEmpty: Boolean = articles.isEmpty()


    // contains: will den Key, nicht den Value, sagt uns, ob der Key enthalten ist oder nicht, gibt true zurück wenn ja, false wenn nein
    var containsBread: Boolean = articles.contains("Brot")


    // containsKey()
    var containsMilk: Boolean = articles.containsKey("Milch")


    // containsValue() : nur hier können wir direkt die Values durchsuchen
    var containsPrice: Boolean = articles.containsValue(1.99)




    // get(key)  (äquivalent zu articles[key]) -> gibt den value des keys zurück
    var milkPrice: Double? = articles.get("Milch")
    println(milkPrice)
    var breadPrice: Double? = articles["Bread"]
    println(breadPrice)
    breadPrice?.plus(10)


    // .keys  gibt alle keys als SET zurück (keine Doppelungen)
    println(articles.keys)


    // .values  gibt alle values als LISTE zurück
    println(articles.values)


    println()
    // .entries gibt alle einträge zurück
    println(articles.entries)



// wichtige schreibende Map Operationen (NUR auf MutableMaps möglich)

    var mutableArticles: MutableMap<String, Double> = articles.toMutableMap()


    // put(key, value) fügt ein neues Key Value Paar hinzu (oder überschreibt den Value eines Existierenden Keys, wenn der übergebene Key damit übereinstimmt)
    mutableArticles.put("Pizza",2.99)
    println(mutableArticles)

    // remove mit Key-Übergabe: Entfernt Value und Key, gibt den gelöschten Value (nicht Key) zurück
    var removedArticlePrice: Double? = mutableArticles.remove("Erdbeeren")



    // remove mit key UND value übergabe: der value muss genau zum key passen, sonst wird false zurückgegeben und nichts gelöscht
    var removeSuccessful: Boolean = mutableArticles.remove("Banane",1.99)

    var removeMilkSuccessful: Boolean = mutableArticles.remove("Milch",0.49)


    // clear() löscht alle elemente aus der map
    mutableArticles.clear()

    println(mutableArticles)

    // mit [] neue elemente hinzufügen: wenn der key nicht existiert, wird er mit dem value neu hinzugefügt
    mutableArticles["Orange"] = 0.39
    mutableArticles["Birne"] = 0.79
    println(mutableArticles)
    // mit [] den Value bestehender Keys verändern / value eines bereits vorhandenen Elements überschreiben:
    mutableArticles["Birne"] = 1.79
    println(mutableArticles)


    // Nullability bei Maps: mit Datentyp angabe, sonst automatisch
    var orangePrice: Double? = mutableArticles["Orange"] // probiert aus, das ? wegzunehmen


    // BONUS: sortierte Map: brauchen wir aber nicht
    var sortedMap: SortedMap<String, Double> = mutableArticles.toSortedMap()
    println(sortedMap)


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