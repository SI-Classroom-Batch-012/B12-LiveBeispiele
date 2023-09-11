package VORLESUNG

/*
    main Funktion: der Ort, an dem unser Code ausgeführt wird
    jeder Code muss da rein
 */
fun main() {
    // nächste Zeile druckt den Inhalt von println() in die Konsole
    println("Hello Batch 12!")

    // Extra Kompilierfehler: direkt beim Schreiben merkt die IDE, dass der Code fehlerhaft ist, weil die Syntax nicht stimmt (zum Ausprobieren einkommentieren):
    //pirntln("Wie geht's?")

    // Extra Laufzeitfehler: Der Compiler warnt uns schon, dass die Liste nicht bis 100 geht, aber es ist kein Syntaxfehler -> erst bei der Laufzeit, wenn die Zeile 16 erreicht wird, stürzt das Programm ab
    val list = listOf(1,2,3,4)
    //println(list[123])

    // READLN:
    println("Hi, wie alt bist du?")
    // das, was der User eintippt, wird in der Variable "age" gespeichert
    val age = readln()
    // die Variable age benutzen, um den Inhalt anzuzeigen
    println("Ok, du bist also $age Jahre alt.")




}
