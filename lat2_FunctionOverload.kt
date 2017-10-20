fun sum(n1:Int, n2:Int) : Int{
    return  n1 + n2
}

fun  sum(n1: Int, n2: Int, n3:Int): Int{
    return n1+n2+n3
}

fun  sum(n1: Int,n2: Int,n3: Int,n4:Int): Int{
    return  n1+n2+n3+n4
}

fun main(args: Array<String>) {
    var sumNumber=sum(n1 = 10, n2 = 11)
    println("sum="+sumNumber)

    sumNumber=sum(n1 = 10, n2 = 11, n3 = 15)
    println("sum="+sumNumber)

    sumNumber=sum(n1 = 10, n2 = 11, n3 = 15, n4 = 14)
    println("sum="+sumNumber)
}