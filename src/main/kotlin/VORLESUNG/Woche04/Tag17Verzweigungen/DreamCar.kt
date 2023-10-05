package VORLESUNG.Woche04.Tag17Verzweigungen

fun main(){

    // Unser Traumauto:
    // Farbe: rot oder grün
    // Preis: maximal 10k
    // Marke: Toyota oder VW
    // Alter: maximal 3 Jahre
    // PS: Minimum 100
    traumAuto()

}
fun traumAuto(){
    // Dream Car
    // Tatsächliches Auto im Angebot:
    var brand = "Toyota"
    var autoAlter = 4
    var ps = 120
    var preis = 10.5
    var farbe = "blau"

    // hier prüfen wir, ob dieses Auto unseren Bedingungen entspricht -- sehr verschachtelte abfrage
    if ((preis <= 20000.5 && (farbe == "grün" || farbe == "rot") && (brand == "Toyota" || brand == "VW") && ps > 100 && autoAlter <=3) || preis <= 500.0){
        println("Auto Probe fahren...")
    } else{
        println("Kein Interesse, alle meine Wünsche werden nicht erfüllt....")
    }

    // XOR BEISPIEL:
    // XOR: nur eine Seite darf true sein, sonst wird in isTrue false gespeichert
    var isTrue = (farbe == "grün") xor (farbe == "blau")

}