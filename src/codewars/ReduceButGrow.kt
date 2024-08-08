package codewars

fun grow(arr: IntArray): Int {
    var res = 1
    arr.forEach { num ->
        res *= num
    }
    return res
}

fun main() {
    println(grow(intArrayOf(4, 1, 1, 1, 4)))
}