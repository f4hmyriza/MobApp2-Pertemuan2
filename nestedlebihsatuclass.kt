interface InterfaceDalam{
    fun cetakTerdalam()
}
class Luar2{
    val varLuar = 1
    fun cetakLuar(){
        println("cetak luar...")
    }
    inner class Dalam{
        val varDalam = 2
        fun cetakDalam(){
            val varLuar = 10
            cetakLuar()
            println("cetak dalam...")
            //println("cetak luar dari dalam: $varLuar")
        }
        inner class Terdalam : InterfaceDalam {
            val varTerdalam = 3
            override fun cetakTerdalam() {
                println("cetak terdalam...")
            }
        }

//        val varTerdalam = 3
//        fun cetakTerdalam() {
//            println("cetak Terdalam...")
//        }
        }
    }

fun main(args: Array<String>) {
    val l = Luar2()
    val d = l.Dalam()
    val t :InterfaceDalam = d.Terdalam()

    l.cetakLuar()
    d.cetakDalam()
    t.cetakTerdalam()
}