fun main(){

    var preis: Double = 125.0
    var kontostand: Double = 650.0
    println("Kontostand: $kontostand Euro")
    println("Preis pro Ticket: $preis")

    var anzahlFamilienMitglieder: Int = 4

    // Preis für 4 Tickets für die vierköpfige Familie:
    var gesamtPreis: Double = preis*anzahlFamilienMitglieder

    println("Gesamtpreis: $gesamtPreis")


    kontostand -= gesamtPreis


    println("Neuer Kontostand: $kontostand ")



}