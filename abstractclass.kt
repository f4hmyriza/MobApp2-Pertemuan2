import Bonbin2.Companion.test

abstract class Binatang2{
    abstract fun makan()
    abstract fun tidur()

    fun bernafas(){
        println("bernafas...")
    }
}
class Gajah2 : Binatang2(){
    override fun makan(){
        println("Gajah Makan...")
    }

    override fun tidur() {
        println("Gajah Tidur...")
    }
}
abstract class Kerbau2 : Binatang2(){
    override fun makan() {
        println("Kerbau Makan...")
    }

    override fun tidur() {
        println("Kerbau Tidur...")
    }
}
class Bonbin2{
    companion object {
        fun test(x:Binatang2){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    val g : Binatang2 = Gajah2()
//    val k : Binatang2 = Kerbau2()

    test(g)
//    test(k)
}