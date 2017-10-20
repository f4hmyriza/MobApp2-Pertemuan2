fun main(args: Array<String>) {
//    var map= HashMap<Int, String>()
//    map.put(1,"Fahmi")
//    map.put(2, "Riza")
//    map.put(3, "Agustya")
//    println(map.get(33))
//
//    map.put(33, "Unisnu Jepara")
//    for (k in  map.keys){
//        println(map.get(k))

    var map= HashMap<String,String>()
    map.put("nama_depan","Fahmi")
    map.put("nama_tengah","Riza")
    map.put("nama_belakang","Agustya")
    println(map.get("nama_depan"))

    map.put("nama_tengah", "Unisnu Jepara")
    for (k in map.keys) {
//        println(k + " "+map.get(k))
    }
}
