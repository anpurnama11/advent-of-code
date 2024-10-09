package codewars

//imperative
/*fun grow(arr: IntArray): Int {
    var res = 1
    arr.forEach { num ->
        res *= num
    }
    return res
}*/

//functional
fun grow(arr: IntArray) = arr.fold(1) { res, num -> res *num }

fun main() {
    println(grow(intArrayOf(4, 1, 1, 1, 4)))
}