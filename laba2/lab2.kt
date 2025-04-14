fun searchColor(r: String): Int {
    if (r.length % 2 != 0) {
        println("Incorrect value")
        return 0
    }

    val vecR = IntArray(10)
    val vecW = IntArray(10)
    val vecB = IntArray(10)
    var c = 0

    for (i in r.indices step 2) {
        val color = r[i]
        val cod = r[i + 1] - '0'
        when (color) {
            'R' -> vecR[cod] = 1
            'W' -> vecW[cod] = 1
            'B' -> vecB[cod] = 1
        }
    }

    for (i in 0..9) {
        if (vecR[i] == 1 && vecW[i] == 1 && vecB[i] == 1) c++
    }

    return c
}

fun main() {
    print("Enter rods: ")
    val input = readLine()!!
    println("Number of rods: ${searchColor(input)}")
}

https://www.tutorialspoint.com/compilers/online-kotlin-compiler.htm