fun searchEven(num: Int): Int {
    var n = num
    var count = 0
    while (n > 0) {
        val last = n % 10
        if (last % 2 == 0) count++
        n /= 10
    }
    return count
}
//https://www.tutorialspoint.com/compilers/online-kotlin-compiler.htm
fun main() {
    print("Enter number of numbers: ")
    val n = readLine()!!.toInt()
    repeat(n) {
        print("Enter number: ")
        val k = readLine()!!.toInt()
        println(searchEven(k))
    }
}
