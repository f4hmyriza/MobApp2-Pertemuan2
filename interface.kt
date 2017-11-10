import Bonbin3.Companion.test

interface Binatang3{
    abstract fun makan()
    abstract fun tidur()

}
class Gajah3 : Binatang3{
    override fun makan(){
        println("Gajah Makan...")
    }

    override fun tidur() {
        println("Gajah Tidur...")
    }
    fun duduk(){
        println("Gajah Duduk...")
    }
}
class Kerbau3 : Binatang3{
    override fun makan() {
        println("Kerbau Makan...")
    }

    override fun tidur() {
        println("Kerbau Tidur...")
    }
}
class Bonbin3{
    companion object {
        fun test(x:Binatang3){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    val g : Gajah3 = Gajah3()
    val k : Kerbau3 = Kerbau3()

    test(g)
    test(k)
}