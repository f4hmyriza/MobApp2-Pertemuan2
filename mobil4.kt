class Mobil4(mesin : Int, roda: Int, body : Int){
    init {
        println("Mesin : $mesin, Roda : $roda, Body : $body")
    }

    var mesinMobil = mesin
    var rodaMobil = roda
    var bodyMobil = body

}

fun main(args: Array<String>) {
    var avanza = Mobil4(1,4,1)
    var innova = Mobil4(2,5,7)

    println("Mesin AVanza : " + avanza.mesinMobil)
    println("Mesin Innova : " + innova.mesinMobil)
    println("Roda AVanza : " + avanza.rodaMobil)
    println("Roda Innova : " + innova.rodaMobil)

}