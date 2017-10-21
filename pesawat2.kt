open class Pesawat2{
    val sayap : Int = 2

    open fun terbang(){
        println("terbang...")
    }
    fun mendarat(){
        println("Mendarat...")
    }
}

class PesawatTempur : Pesawat(){
    var Rudal : Int =4

    fun Manuver(){
        println("Manuver...")
    }

    override fun terbang(){
        println("Terbang ALa Tempur...")
    }
}

fun main(args: Array<String>) {
    var boeing = Pesawat()
    var F16 = PesawatTempur()

    boeing.terbang()
    F16.terbang()

    boeing.mendarat()
    F16.mendarat()

    //boeing.Manuver()
    F16.Manuver()
}