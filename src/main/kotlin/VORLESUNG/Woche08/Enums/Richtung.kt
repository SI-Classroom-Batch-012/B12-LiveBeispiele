package VORLESUNG.Woche08.Enums

enum class Richtung(val grad: Int){
    NORD(0),
    OST(90),
    SUED(180),
    WEST(270);


    fun uhrzeigersinn(): Richtung {
        return when(this){
            NORD -> OST
            OST -> SUED
            SUED -> WEST
            WEST -> NORD
        }
    }

    fun gegenUhrzeigersinn(): Richtung {
        return when(this){
            NORD -> WEST
            OST -> NORD
            SUED -> OST
            WEST -> SUED
        }
    }

}