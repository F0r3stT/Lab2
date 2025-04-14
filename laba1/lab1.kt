fun main() {
    print("Enter number: ")
    val n = readLine()!!.toInt()
    print("Enter position: ")
    val p = readLine()!!.toInt()

    if (n < 0 || p < 0) {
        println("Incorrect value")
        return
    }

    var N = n
    var c = 0
    while (N > 0) {
        val digit = N % 10
        c++
        if (c == p) {
            println("well done: $digit")
        }
        N /= 10
    }
}
