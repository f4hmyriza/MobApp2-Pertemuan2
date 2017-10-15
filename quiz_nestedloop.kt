fun main(args: Array<String>) {
    for (i in 1..5) {
        for (a in 5 downTo i) {
            print(" ")
        }
        for (b in 1..i) {
            print("*")
        }

        println()
    }
}