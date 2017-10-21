class Mobil6(val mesin:Int){
    constructor(roda:Int,body:Int):this(1){
        println("dicetak dari secondary constructor")
        println("Mesin : ${this.mesin}, Roda : $roda, body : $body")
    }
}

fun main(args: Array<String>) {
    var avanza = Mobil6(4,1)


}