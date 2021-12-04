package year2020.day1

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        val inputAsInt = input.map { it.toInt() }
        for(i in inputAsInt.indices)
            for (j in i+1 until  inputAsInt.size)
                if (inputAsInt[i] + inputAsInt[j] == 2020) {
                    return inputAsInt[i]*inputAsInt[j]
                }
        return  -1
    }

    fun part2(input: List<String>): Int {
        val inputAsInt = input.map { it.toInt() }
        for(i in inputAsInt.indices)
            for (j in i+1 until  inputAsInt.size)
                for (k in j+1 until inputAsInt.size)
                    if (inputAsInt[i] + inputAsInt[j] + inputAsInt[k] == 2020) {
                        return inputAsInt[i]*inputAsInt[j]*inputAsInt[k]
                    }
        return  -1
    }

    val testInput = readInput("/year2020/day1/Day01_test")
    check(part1(testInput)==514579)
    check(part2(testInput)==241861950)
    val input = readInput("/year2020/day1/Day01")
    println(part1(input))
    println(part2(input))
}