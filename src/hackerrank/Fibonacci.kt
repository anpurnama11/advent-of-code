package hackerrank

fun fibonacci(n: Int): Array<Int> {
    val sequence = mutableListOf<Int>()
    when (n) {
        1 -> return mutableListOf(0).toTypedArray()
        2 -> return mutableListOf(0,1).toTypedArray()
    }
    sequence.add(0)
    sequence.add(1)
    for (i in 2 until n) {
        val next = sequence[i-1] + sequence[i-2]
        sequence.add(next)
    }
    return sequence.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = fibonacci(n)

    println(result.joinToString("\n"))
}