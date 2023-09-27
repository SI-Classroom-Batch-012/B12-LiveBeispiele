package VORLESUNG.Woche03

fun main(){
    println("Pancakes für 4 Personen:")
    makePancakes(4,250,150,190)
    println("Pancakes für doppelt so viele Personen:")
    makePancakes(4*2,250*2,130*2,170*2)
}


fun makePancakes(eier: Int, mehl: Int, milch: Int, wasser: Int) {
    println("$eier Eier und $mehl g Mehl wird verrührt...")
    Thread.sleep(2000)
    println("$milch ml Milch und $wasser ml Wasser kommen dazu...")
    Thread.sleep(2000) // sorgt fuer 2 sekunden pause
    println("Fertig ist der Pfannkuchenteig!")
}