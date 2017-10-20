fun main(args: Array<String>) {
    var map= hashMapOf( "nama_depan" to "Fahmi", "nama_tengah" to "Riza")
    map.put("nama_belakang","Agustya")
    println(map.get("nama_belakang"))
    println(map["nama_belakang"])

    var ar = arrayOf(1,10,22,11)
    println(ar[10])
    var list = mutableListOf(11,22,33,22)
    list[0]=22
    for (item in list){
        println(item)
    }
}
