package year2021.day3

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        val updatedInput = input.map { binary-> binary.toCharArray() }
        val maxIndex = updatedInput.first().size
        var index = 0
        val maxIteration = updatedInput.size
        var iteration = 0
        val digits = mutableListOf<Char>()
        val mostCommon = mutableListOf<Map<Char, Int>>()
        while (index < maxIndex) {
            while (iteration < maxIteration) {
                digits.add(updatedInput[iteration][index])
                iteration++
            }
            iteration = 0
            mostCommon.add(digits.groupingBy { it }.eachCount())
            digits.clear()
            index++
        }
        val gammaString = StringBuilder()
        val epsilonString = StringBuilder()
        mostCommon.forEach {
            gammaString.append(it.maxByOrNull { it.value }?.key)
            epsilonString.append(it.minByOrNull { it.value }?.key)
        }
        val gamma = gammaString.toString().toInt(2)
        val epsilon = epsilonString.toString().toInt(2)
        return gamma*epsilon
    }

    val testInput = readInput("/year2021/day3/Day03_test")
    check(part1(testInput)==198)
    val input = readInput("/year2021/day3/Day03")
    println(part1(input))
}