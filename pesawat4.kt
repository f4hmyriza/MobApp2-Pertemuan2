open class Pesawat4(val sayap : Int=2){
    init {
        println("object pesawat dibuat...")
    }
    fun cetakSayap(){
        println("Sayap : " + sayap)
    }
}
class PesawatTempur4(val rudal: Int=4) : Pesawat4(){
    init {
        println("object pesawat tempur dibuat...")
        super.cetakSayap()
    }
}

fun main(args: Array<String>) {
    val f16 = PesawatTempur4()
}