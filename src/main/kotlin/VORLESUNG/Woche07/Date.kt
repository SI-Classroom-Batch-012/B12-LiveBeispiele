package VORLESUNG.Woche07

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main() {
    // heutiges Datum
    println("---Heutiges Datum---")
    var today: LocalDate = LocalDate.now()
    println(today)


    // heutiges Datum mit Uhrzeit
    println("---Heutiges Datum mit genauer Uhrzeit---")
    var todayWithTime: LocalDateTime = LocalDateTime.now()
    println(todayWithTime)


    println("---In Variable gespeicherter Geburtstag---")
    // Datum in einer Variable speichern
    val birthday: LocalDate = LocalDate.of(1999,11,1)
    println(birthday)


    println("---Geburtsdatum selber eingeben, als LocalDate speichern ---")
    println("Tag:")
    val day: Int = readln().toInt()
    println("Monat:")
    val month: Int = readln().toInt()
    println("Jahr:")
    val year: Int = readln().toInt()
    val newBirthday: LocalDate = LocalDate.of(year,month,day)
    println("NewBirthday: $newBirthday")

//    println("ALternative: bitte direkt Jahr, Monat und Tag eingeben:")
//    val oneLineBirthday: LocalDate = LocalDate.of(readln().toInt(), readln().toInt(), readln().toInt())
//    println("OneLineBirthday: $oneLineBirthday")

    println("---Eingegebenes Geburtsdatum volljährig?---")
    // checken, ob newBirthday über 18 Jahre her ist
    var todayMinus18 = today.minusYears(18).plusDays(1)
    println(todayMinus18)

    if (newBirthday.isBefore(todayMinus18)) {
        println("ist volljährig")
    } else {
        println("ist unter 18")
    }



    // Formatierung
    println("--Vor dem Formatieren--")
    val formatMonatAlsZahl: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    println(today)


    println("--Nach dem Formatieren:--")
    val formattedDateZahl = today.format(formatMonatAlsZahl)
    println(formattedDateZahl)


    // ohne variable, mit monat als text format:
    val formattedDateText: String = today.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"))
    println(formattedDateText)


}