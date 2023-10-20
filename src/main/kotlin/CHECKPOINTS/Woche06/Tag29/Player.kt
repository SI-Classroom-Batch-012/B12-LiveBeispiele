package CHECKPOINTS.Woche06.Tag29

class Player(
    name: String,
    password: String,
    age: Int,
    private var points: Int = 0
) : User(name, password, age) {

        constructor(user: User): this(user.name, user.password, user.age)

        fun winSomePoints(){
            val win: Int = (10..20).random()
            points += win
            println("Du hast $win Punkte gewonnen. Dein Neuer Punktestand lautet: $points")
        }

    override fun toString(): String {
        return "Player $name with $points points"
    }

    fun getPoints(): Int{ return points }
}