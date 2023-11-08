package VORLESUNG.Woche08.Enums

enum class Difficulty (val farbe: Farbe, val wert: Int) {
    EASY(Farbe.gruen, 0),
    MEDIUM(Farbe.gelb, 1),
    HARD(Farbe.rot, 2),
    INSANE(Farbe.schwarz, 3);

    fun naechsteSchwierigkeit(): Difficulty {
        return when(this){
            EASY -> MEDIUM
            MEDIUM -> HARD
            HARD -> INSANE
            else -> INSANE
        }
    }

}