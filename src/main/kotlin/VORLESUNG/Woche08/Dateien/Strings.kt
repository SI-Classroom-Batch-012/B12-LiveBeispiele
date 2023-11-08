
/**
 *  Diese Datei zeigt verschiedene Features von Strings in Kotlin.
 *      - Chars, Escaped Strings und Raw Strings
 *      - Zeichen austauschen [String.replace]
 *      - Strings aufteilen in Teilstrings [String.split]
 *      - Emojis in Strings, und wie verhalten sich Emojis als Char
 */
fun main(){

    var text: String = "Lorem ipsum dolor sit amet, \n" +
            "consectetur adipiscing elit."

    println(text)
    text = """
        Lorem ipsum dolor sit amet, 
        consectetur adipiscing elit.""".trimIndent()
    println(text)
    val zeichen: Char = text[10]


    var text2 = """
        Hallo,
           mein Name ist "Gordon"!!
            
            liebe Grüße
            Gordon
    """.trimIndent()

    println(text2)


    
    text2 = text2.replace(",", "")
    text2 = text2.replace("Gordon", "Malte")

    // Anwendungsfall
    //readln().replace(",", ".").toDouble()
    
    println(text2)

    val wortListe: List<String> = text.split(" ")
    println(wortListe)


    var textMitEmoji = "😆"
    println(textMitEmoji)
    println(textMitEmoji[0])
    println(textMitEmoji[1])

    println(text.lowercase())
    println(text.uppercase())

    /*
        name;preis;anzahl;bewertungen
        apfel;0.55;5;1,2,1,3,1
        banane;0.34;2;2,3
        zitrone;0.2;9;
     */

    val beispielZeile = "apfel,0.5,5"
    val daten: List<String> = beispielZeile.split(",")

    /*
    for zeile in datei.alleZeilen:
        daten = zeile.split(";")

        bewertungen = mutableList<Int>()
        for (bewertung in daten[3].split(",")
            bewertungen.add(bewertung)

        Produkt(
            name = daten[0]
            preis = daten[1].toDouble()
            anzahl = daten[2].toInt()
            bewertungen = bewertungen
        )
     */

}