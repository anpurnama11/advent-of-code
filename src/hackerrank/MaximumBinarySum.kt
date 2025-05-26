package hackerrank

fun maximumBinary(numberOfBits: Int, maximumOperationsAllowed: Int, arr: Array<String>): String {
    // Write your code here
    return ""
}

fun main(args: Array<String>) {
    val numberOfBits = readLine()!!.trim().toInt()

    val maximumOperationsAllowed = readLine()!!.trim().toInt()

    val arrCount = readLine()!!.trim().toInt()

    val arr = Array<String>(arrCount, { "" })
    for (i in 0 until arrCount) {
        val arrItem = readLine()!!
        arr[i] = arrItem
    }

    val result = maximumBinary(numberOfBits, maximumOperationsAllowed, arr)

    println(result)
}