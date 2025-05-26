package leetcode.easy

fun isPalindrome(x: Int): Boolean {
    val numInString = x.toString()
    var start = 0
    var end = numInString.length - 1
    while (start < end) {
        if (numInString[start] != numInString[end]) {
            return false
        }
        start++
        end--
    }
    return true
}

fun main() {
    val num = 133
    println("$num is palindrome? ${isPalindrome(num)}")
}