fun ArrayList<String>.swap(index1: Int, index2: Int){
    val temp = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2,temp)
}

fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("agus")
    arrayList.add("budi")
    arrayList.add("cici")
    println(arrayList)
    arrayList.swap(1,2)
    println(arrayList)
}