package leetcode.easy

fun romanToInt(s: String): Int {
    var total = 0
    val romanValuesMap = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    for (i in s.indices) {
        val current = romanValuesMap[s[i]] ?: 0
        val next = if (i < s.length -1) romanValuesMap[s[i+1]] ?: 0 else -1
        if (current < next)
            total -= current
        else total += current
    }
    return total
}

fun main() {
    val romanNum = "MCMXCIV"
    println("int value of $romanNum is ${romanToInt(romanNum)}")
}