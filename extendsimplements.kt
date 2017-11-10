open class Manusia{
    fun bernafas(){
        println("bernafas...")
    }
}

interface Dosen{
    fun mengajar()
}
interface Sniper{
    fun menembak()
}
class ManusiaSakti : Manusia(), Dosen, Sniper{
    override fun menembak() {
        println("menembak...")
    }

    override fun mengajar() {
        println("mengajar")
    }
}
class Utama{
    companion object {
        fun testDosen(d : Dosen){
            d.mengajar()
        }
        fun testSniper(d : Sniper){
            d.menembak()
        }
        fun testManusia(m : Manusia){
            m.bernafas()
        }
    }
}

fun main(args: Array<String>) {
    val budi = ManusiaSakti()
    Utama.testDosen(budi)
    Utama.testManusia(budi)
    Utama.testSniper(budi)
}