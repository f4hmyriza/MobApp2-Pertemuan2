fun disply(n:Int=0) : Unit{
    println("n:$n")
}

fun displyNoInput():Unit{
    println("Welcom To Display")
}

fun main(args: Array<String>) {
    disply(n = 10)
    disply()

    displyNoInput()
}