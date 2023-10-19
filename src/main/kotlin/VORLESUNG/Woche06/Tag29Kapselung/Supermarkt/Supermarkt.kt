package VORLESUNG.Woche06.Tag29Kapselung.Supermarkt

class Supermarkt(val lebensmittelListe: MutableList<Lebensmittel>) {

    private fun addLebensmittel(items: List<Lebensmittel>){
        lebensmittelListe.addAll(items)
    }

    init {
        addLebensmittel(
            listOf(
            Fleisch("Rind",8.99,"Kuh"),
            Lebensmittel("Joghurt",1.49),
            Fleisch("Hühnerbrust","Huhn"),
            //Gemuese("Brokkoli"),
            //Gemuese("Karotten",1.99,30),
            Obst("Kirsche"),
            Obst("Mandarine"),
            //Gemuese("Paprika"),
            Obst("Kiwi"),
            )
        )

    }
    fun printLebensmittel(){
        println("Alle Lebensmittel im Supermarkt:")
        lebensmittelListe.forEach{
            println(it.name)
            println(it.getPreiss())
            println("---")
        }
    }

    fun printFleisch(){
        println("----Fleisch drucken----")
        for (food in lebensmittelListe){
            // is: ist item Teil der Klasse Fleisch. wenn ja drucken
            if (food is Fleisch){
                println(food.name)
            }
        }

    }

}