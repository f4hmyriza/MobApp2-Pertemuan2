open class Pesawat3(val sayap: Int =2){
    init {
        println("object pesawat dibuat...")
    }
}
class PesawatTempur3(val rudal : Int = 4) : Pesawat3(){
    init {
        println("object pesawat tempur dibuat...")
    }
}

fun main(args: Array<String>) {
    val f16 = PesawatTempur3()
}