package VORLESUNG.Woche04.Tag19Wiederholung

import kotlin.math.PI


// Die gespeicherten User mit deren PW
// user sind außerhalb von main() : globale Konstanten, in anderen Dateien nutzbar. globale Konstanten werden GROSS geschrieben
val USER1 = "Batman"
val PW1 = "1234"

val USER2 = "Superman"
val PW2 = "password"

fun main(){
    // variablen, um zu tracken, ob die user jeweils eingeloggt sind

    // globale Variablen werden klein geschrieben
    var isUser1LoggedIn: Boolean = false
    var isUser2LoggedIn: Boolean = false



    println("Bitte gib Namen ein...")
    val userName: String = readln()


    // User1 einloggen, lange version (verschachtelte ifs)
    loginUser1(userName)

    // User2 einloggen: sehr kurze Version (Verknüpfungsoperatoren)
    println("Passwort eingeben...")
    val password: String = readln()
    if (USER2 == userName && password == PW2){
        println("Erfolgreich eingeloggt, Name und PW stimmen.")
        isUser2LoggedIn = true
    } else {
        println("Fehlversuch.")
    }


    // Beispiel für NOT EQUALS !=
    if (userName != USER1 || password != PW1){ // ist das gleiche wie: !(userName == USER1)
        println("Falscher Username oder falsches passwort...")
    }


    // Einlog-Status, der im Boolean userLoggedIn getrackt wird, nutzen, um was entsprechendes anzuzeigen
    if (isUser2LoggedIn) {
        println("User 2 Profil anzeigen")
    }

    // was, wenn keiner eingeloggt ist?

    // Identisch: !(A || B) == !A && !B

}


fun loginUser1(userName: String) {
    var isUser1LoggedIn = false
    if (USER1 == userName) {
        println("Dein Name ist also $userName")
        println("Bitte Passwort eingeben...")
        val password: String = readln()

        if (PW1 == password) {
            println("Erfolgreich eingeloggt...")
            isUser1LoggedIn = true

        } else {
            println("Falsches Passwort eingegeben")
        }

    } else {
        println("Falschen Nutzernamen eingegeben.... Versuch es nochmal.")
        var nextTryName = readln()
        loginUser1(nextTryName)
    }
}







fun ifBeispiele(){
    // if-else
    if (2 > 3){
        // mach irgendwas
    } else {
        // mach was anderes
    }

    //else-if
    if (2 == 20) {
        // mach was
    } else if (2 < 3){
        // mach irgendwas anderes
    } else if (2 != 3) {
        // mach noch was anderes
    }
}

