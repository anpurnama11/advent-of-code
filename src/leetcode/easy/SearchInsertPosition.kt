package leetcode.easy

fun searchInsert(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1
    var mid = 0
    while (low <= high) {
        mid = (low + high) / 2
        if (nums[mid] == target) {
            return mid
        }
        else if (nums[mid] < target) {
            low = mid + 1
        }
        else {
            high = mid - 1
        }
    }
    return low
}

fun main() {
    val nums = intArrayOf(1,3,5,6)
    println("position is at ${searchInsert(nums, 2)}")
}