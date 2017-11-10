class Mysql : Database{
    override fun connect(){
        println("mysql connect...")
    }

    override fun disconnect(){
        println("mysql disconnect...")
    }
}

interface Database{
    fun connect()
    fun disconnect()
}

//class IbmDb2 : Database{
//    override fun connect() {
//        println("IbmDb2 connect...")
//    }
//
//    override fun disconnect() {
//        println("IbmDb2 disconnect...")
//    }
//}

fun main(args: Array<String>) {
    val d = Mysql()
    d.connect()
    d.disconnect()

}

