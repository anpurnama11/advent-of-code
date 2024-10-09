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

fun twoSumFunctional(nums: IntArray, target: Int) = nums.indices.flatMap { i ->
    (i + 1 until nums.size).mapNotNull { j ->
        if (nums[i] + nums[j] == target) intArrayOf(i,j) else null
    }
}.firstOrNull() ?: intArrayOf()

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

fun twoSumHashTableFunctional(nums: IntArray, target: Int) = nums.indices.map {  }

fun main() {
    println(twoSumFunctional(intArrayOf(3,2,4),6).contentToString())
}