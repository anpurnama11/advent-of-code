package leetcode.easy

fun removeDuplicates(nums: IntArray): Int {
    var unique = 0
    /*var lastNum = -101
    val iterator = nums.toMutableList().iterator()
    while (iterator.hasNext()) {
        val currentNum = iterator.next()
        if (currentNum != lastNum) {
            lastNum = currentNum
            unique++
        } else iterator.remove()
    }*/
    return unique
}