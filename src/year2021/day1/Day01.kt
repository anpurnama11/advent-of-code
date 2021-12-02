package year2021.day1

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var count = 0
        val inputInts = input.map { it.toInt() }
        for (i in 1 until inputInts.size) {
            if (inputInts[i] > inputInts[i-1]) count++
        }
        return count
    }

    fun part2(input: List<String>): Int {
        var count = 0
        val inputInts = input.map { it.toInt() }
        val groupOfMeasurement = inputInts.take(3).toMutableList()
        var previousSumOfMeasurement = groupOfMeasurement.sum()
        for (element in inputInts.drop(3)) {
            groupOfMeasurement.removeFirst()
            groupOfMeasurement.add(element)
            val currentSum = groupOfMeasurement.sum()
            if (currentSum > previousSumOfMeasurement) count++
            previousSumOfMeasurement = currentSum
        }
        return count
    }

    val testInput = readInput("/year2021/day1/Day01_test")
    val input = readInput("/year2021/day1/Day01")
    check(part1(testInput) == 7)
    println(part1(input))
    check(part2(testInput) == 5)
    println(part2(input))
}
