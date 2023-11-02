package VORLESUNG.Woche07

import RED

open class Held(var hp: Int, var name: String){
    // logik attacken etc

    constructor(hp: Int): this(hp, "Default Name")

    open fun doSomething(){
        println("blablabl")
    }
}


class Helfer(var ap: Int, var kampfSchrei: String,): Held(30,"Helferlein") {

    var bla = RED

//    override fun doSomething(){
//        println("Helferspezfischer Kampschrei")
//    }

}

fun main() {
    var held1: Held = Held(30,"Krieger Adrian")
    var held2: Held = Held(40)

    println("---Held 1---")
    println(held1.name)
    println(held1.hp)
    println("---Held 2---")

    println(held2.name)
    println(held2.hp)

    var helfer: Helfer = Helfer(10,"Ich helfe dir!")
    helfer.doSomething()

    println("""
 __    __       ___       __      ____        ____                                                                                   
|  |  |  |     /   \     |  |     |  |      /  __  \                                                                                  
|  |__|  |    /  ^  \    |  |     |  |     |  |  |  |                                                                                 
|   __   |   /  /_\  \   |  |     |  |     |  |  |  |                                                                                 
|  |  |  |  /  _____  \  |  `----.|  `----.|  `--'  |                                                                                 
|__|  |__| /__/     \__\ |_______||_______| \______/                                                                                  
                                                                                                                                      
                                                                                                                                      
                                                                                                                                      
                                                                                                                                      
                                                                                                                                      
                                                                                                                                      
                                                                                                                                      
                                                                                                                                      
  _______   ______    __       _______   _______ .__   __.         _______.____    ____ .__   __. .___________.    ___      ___   ___ 
 /  _____| /  __  \  |  |     |       \ |   ____||  \ |  |        /       |\   \  /   / |  \ |  | |           |   /   \     \  \ /  / 
|  |  __  |  |  |  | |  |     |  .--.  ||  |__   |   \|  |       |   (----` \   \/   /  |   \|  | `---|  |----`  /  ^  \     \  V  /  
|  | |_ | |  |  |  | |  |     |  |  |  ||   __|  |  . `  |        \   \      \_    _/   |  . `  |     |  |      /  /_\  \     >   <   
|  |__| | |  `--'  | |  `----.|  '--'  ||  |____ |  |\   |    .----)   |       |  |     |  |\   |     |  |     /  _____  \   /  .  \  
 \______|  \______/  |_______||_______/ |_______||__| \__|    |_______/        |__|     |__| \__|     |__|    /__/     \__\ /__/ \__\ 
                                                                                                                                     
    """.trimIndent())

}