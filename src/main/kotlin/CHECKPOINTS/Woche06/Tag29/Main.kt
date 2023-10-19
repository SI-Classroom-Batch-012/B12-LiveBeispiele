package CHECKPOINTS.Woche06.Tag29

fun main() {

    // TODO Erstelle eine Liste an Usern

    val users: List<User> = listOf(
        User("abc", "123", 21),
        User("player1", "secretPW", 21),
        User("coolUser", "passwort123", 18),
        User("bestPlayer", "1234", 16),
        User("bestPlayer1", "1234", 32),
    )

    // TODO Gebe alle (erwachsenen) User auf der Konsole aus
    for(user in users){
        if(user.age >= 18) {
            user.rede()
        }
    }

    // TODO Benutzer einloggen versuchen
    // DO WHILE VARIANTE
    do {
        print("Username: ")
        val usernameEingabe: String = readln()
        print("Passwort: ")
        val passwordEingabe: String = readln()


        val foundUser: Boolean = users.any{user: User ->
            user.name == usernameEingabe && user.password == passwordEingabe
        }

        if(!foundUser){
            println("Nicht erfolgreich eingeloggt")
        }else{
            println("Erfolgreich eingeloggt")
        }
    } while(!foundUser)

    // WHILE VARIANTE
//    var found = false
//    while(!found){
//        print("Username: ")
//        val usernameEingabe: String = readln()
//        print("Passwort: ")
//        val passwordEingabe: String = readln()
//
//
//        found = users.any{user: User ->
//            user.name == usernameEingabe && user.password == passwordEingabe
//        }
//
//        if(!found){
//            println("Nicht erfolgreich eingeloggt")
//        }else{
//            println("Erfolgreich eingeloggt")
//        }
//    }


    // TODO Player von User erstellen
    val firstUser: User = users[0]
    val firstPlayer: Player = Player(firstUser)
    println(firstPlayer)



    // TODO Solange player spielen lassen, bis 100 Punkte erreicht wurden
    while(firstPlayer.getPoints() < 100){
        firstPlayer.winSomePoints()
    }

}

