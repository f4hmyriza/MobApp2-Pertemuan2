//import Bonbin.Companion.test
//
//class Bonbin{
//    companion object {
//        fun test(x:Binatang){
//            x.makan()
//            x.tidur()
//
//        }
//    }
//}
//
//fun main(args: Array<String>) {
//    val bin : List<Binatang> = arrayListOf(Gajah(),Kerbau())
//    test(bin[0])
//    test(bin[1])
//}
open class Binatang{
    open  fun makan(){
        println("makan...")
    }
    open fun tidur(){
        println("tidur...")
    }
}
class Gajah: Binatang(){
    override fun makan(){
        println("gajah makan...")
    }
    override fun tidur(){
        println("gajah tidur...")
    }
    fun duduk(){
        println("gajah duduk...")
    }
}
class Kerbau : Binatang(){
    override fun makan(){
        println("kerbau makan...")
    }
    override fun tidur(){
        println("kerbau tidur...")
    }
}

fun main(args: Array<String>) {
    val g : Binatang = Gajah()
    g.makan()
    g.tidur()
    (g as Gajah).duduk()
}
