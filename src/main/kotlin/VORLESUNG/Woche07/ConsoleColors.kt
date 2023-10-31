
val RED = "\u001B[31m"

fun main() {
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val blue = "\u001B[34m"
    val magenta = "\u001B[35m"
    val cyan = "\u001B[36m"
    val bold = "\u001B[1m"
    val underline = "\u001B[4m"
    val backgroundYellow = "\u001B[43m"
    // alle zuvor verwendeten Formatierungen zurücksetzen, ohne bleiben sie auch in den nächsten printlns bestehen bestehen
    val reset = "\u001B[0m"

    // Nutzung Ansi Escape Codes mit Variablen
    println("${RED}Roter Text${reset}")
    println("${green}Grüner Text${reset}")
    println("${yellow}Gelber Text${reset}")
    println("${blue}Blauer Text${reset}")
    println("${magenta}Magenta Text${reset}")
    println("${cyan}Cyan Text${reset}")

    println("${bold}Fetter Text${reset}")
    println("${underline}Unterstrichener Text${reset}")

    println("${backgroundYellow}Text mit gelbem Hintergrund${reset}")

    // Nutzung Ansi Escape Codes ohne Variable
    println("\u001b[31mRote Farbe $reset")
    println("Hier ist kein roter Code mehr drin...")

    // alle Textfarben mit Schleife ausdrucken
    for (i in 30..37){
        print("\u001b[${i}m i ")
    }
    for (i in 90..97){
        print("\u001b[${i}m i ")
    }

    println(reset)
    println("Bist du grau?")

    // alle Hintergrundfarben mit Schleife ausdrucken
    for (i in 40..47){
        print("\u001b[${i}m i ")
    }
    for (i in 100..107){
        print("\u001b[${i}m i ")
    }


}