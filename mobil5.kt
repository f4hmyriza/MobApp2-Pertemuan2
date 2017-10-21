class Mobil5(val mesin : Int, val roda: Int, val body : Int){
    init {
        println("Mesin : $mesin, Roda : $roda, Body : $body")
    }
}

fun main(args: Array<String>) {
    var avanza = Mobil4(1,4,1)
    var innova = Mobil4(2,5,7)

    println("Mesin AVanza : " + avanza.mesinMobil)
    println("Mesin Innova : " + innova.mesinMobil)
    println("Roda AVanza : " + avanza.rodaMobil)
    println("Roda Innova : " + innova.rodaMobil)

}