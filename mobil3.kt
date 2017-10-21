class Mobil3{
    companion object {
        @JvmField var pintu = 2
        fun bukapintu(){
            println("Buka Pintu...")
        }
    }

    var mesin =1
    var roda = 4
    var body = 1
}

fun main(args: Array<String>) {
    var avanza = Mobil3()
    var innova = Mobil3()
    println("Mesin avanza : " + avanza.mesin)
    println("Pintu avanza : " + Mobil3.pintu)
    println("Pintu innova : " + Mobil3.pintu)

    Mobil3.pintu = 4
    println("Pintu avanza : " + Mobil3.pintu)
    println("Pintu innova : " + Mobil3.pintu)


    Mobil3.bukapintu()
}