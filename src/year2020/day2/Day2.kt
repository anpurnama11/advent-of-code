package year2020.day2

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        var validPasswordCount = 0
        input.forEach { entry ->
            val passwords = entry.split(":").last().trim()
            val policy = entry.split(":").first()
            val policyAlphabet = policy.split(" ").last().toCharArray().first()
            val policyMinimumOccurence = policy.split(" ").first().split("-").first().toInt()
            val policyMaximumOccurence = policy.split(" ").first().split("-").last().toInt()

            val alphabetCounts: Map<Char, Int> = passwords.groupingBy { it }.eachCount()
            if (alphabetCounts[policyAlphabet]!= null && alphabetCounts[policyAlphabet] in policyMinimumOccurence..policyMaximumOccurence)
                validPasswordCount++
        }
        return validPasswordCount
    }

    fun part2(input: List<String>): Int {
        var validPasswordCount = 0
        input.forEach { entry ->
            val passwords = entry.split(":").last().trim()
            val policy = entry.split(":").first()
            val policyAlphabet = policy.split(" ").last().toCharArray().first()
            val policyIndexFirst = policy.split(" ").first().split("-").first().toInt() - 1
            val policyIndexSecond = policy.split(" ").first().split("-").last().toInt() - 1
            var tempValidCount = 0
            if (passwords[policyIndexFirst] == policyAlphabet) tempValidCount++
            if (passwords[policyIndexSecond] == policyAlphabet) tempValidCount++
            if (tempValidCount in 1..1) validPasswordCount++
        }
        return validPasswordCount
    }

    val testInput = readInput("/year2020/day2/Day02_test")
    check(part1(testInput)==2)
    check(part2(testInput)==1)
    val input = readInput("/year2020/day2/Day02")
    println(part1(input))
    println(part2(input))
}