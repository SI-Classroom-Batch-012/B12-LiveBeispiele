package VORLESUNG.Woche07

import java.time.Duration
import java.time.LocalTime


fun main() {
    // Zeitpunkte definieren
    // konkrete Zeitpunkte:
    var mittagsPauseStart: LocalTime =  LocalTime.of(12,30)
    println(mittagsPauseStart)

    // aktueller Zeitpunkt: now
    val aktuelleZeit: LocalTime = LocalTime.now()
    println(aktuelleZeit)

    // Zeit relativ zu einem anderen Zeitpunkt
    val endZeit: LocalTime = aktuelleZeit.plusHours(12).plusSeconds(120)
    println(endZeit)

    var mittagsPauseEnde: LocalTime = LocalTime.of(12,59,59)


    // Zeitspannen macht man mit der Klasse *Duration*
    var mittagsPausenDauer: Duration = Duration.between(mittagsPauseStart,mittagsPauseEnde)
    println(mittagsPausenDauer)

    println("""
        Die Mittagspause dauert:
        ${mittagsPausenDauer.toHours()}
        ${mittagsPausenDauer.toMinutes()}
        ${mittagsPausenDauer.seconds%60}
       
    """.trimIndent())

    println("Ein Simpler Countdown...")
    countdown(10)
}

fun countdown(seconds: Int) {
    for (i in seconds downTo 0){
        if (i ==9){
            print("\b") // \b überschreibt das, was vorher in der Zeile stand. sorgt dafür, dass in breits existiernde Zeile überschrieben wird
        }
        print("\b$i")
        Thread.sleep(1000)
    }

}
