package leetcode.easy
import kotlin.math.abs

fun findClosestNumber(nums: IntArray): Int {
    var closestDistanceSoFar = Int.MAX_VALUE
    var resultNumber = -1
    for (num in nums) {
        val currentDistance = abs(num)
        if (currentDistance < closestDistanceSoFar) {
            closestDistanceSoFar = currentDistance
            resultNumber = num
        }
        else if (currentDistance == closestDistanceSoFar)
            if (num > resultNumber) {
                closestDistanceSoFar = num
                resultNumber = num
            }
    }
    return resultNumber
}


fun main() {
    val nums = intArrayOf(8, -2, 2, 3)
    println("closest to zero is ${findClosestNumber(nums)}")
}