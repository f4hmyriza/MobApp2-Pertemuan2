class Mobil {
    var mesin = 1
    var roda = 4
    var body = 1

    fun maju() {
        println("maju...")
    }

    fun mundur() {
        println("mundur...")
    }

    fun belok() {
        println("belok...")
    }
}
    fun main(args: Array<String>){
        var avanza = Mobil()
        avanza.maju()
        avanza.mundur()
        avanza.belok()

        println("Mesin : " + avanza.mesin)
        println("Roda : " + avanza.roda)
        println("Body : " + avanza.body)
    }
