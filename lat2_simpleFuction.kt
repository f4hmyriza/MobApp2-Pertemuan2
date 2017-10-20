fun sum(n1:Double, n2:Double) : Double{
    var sum = n1+n2
    return sum
}

fun main(args: Array<String>) {
    var r= sum(n1 = 10.0, n2 = 12.0)
    println("r:$r")

    r=sum(n1 = 5.0, n2 = 82.0)
    println("r:$r")

    r=sum(n1 = 110.0, n2 = 112.0)
    println("r:$r")
}