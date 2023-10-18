package VORLESUNG.Woche06.`Tag28-Vererbung`

class Goldfish(name: String): Fish(name,0){


    override fun move() {
        println("Unser Goldfisch $name schwimmt herum.")
    }


}


fun main(){
    var goldie: Goldfish = Goldfish("Goldie")
    // move ist von Animal geerbt, nicht von Goldfisch.
    goldie.move()

    var tier = Animal("Jimmy",false,true)
}