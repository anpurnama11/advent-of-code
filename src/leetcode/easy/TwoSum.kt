package leetcode.easy

fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
    val indexes = IntArray(2)
    for(i in 0 until nums.size) {
        for (j in i + 1 until nums.size)
            if (nums[i] + nums[j] == target) {
                indexes[0] = i
                indexes [1] = j
                return indexes
            }
    }
    return indexes
}

fun twoSumHashTable(nums: IntArray, target: Int): IntArray {
    val indexes = IntArray(2)
    val hashTable = hashMapOf<Int,Int>()
    for (i in 0 until nums.size) {
        if (hashTable.containsKey(target - nums[i])) {
            indexes[0] = hashTable[target-nums[i]] ?: 0
            indexes[1] = i
        } else hashTable[nums[i]] = i
    }
    return indexes
}

fun main() {
    println(twoSumHashTable(intArrayOf(3,2,4),6).contentToString())
}