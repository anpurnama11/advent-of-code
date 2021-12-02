package year2021.day2

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        var vertical = 0
        var horizontal = 0
        input.forEach {
            val commands = it.split(" ")
            when(commands[0]) {
                "forward" -> horizontal+=commands[1].toInt()
                "down" -> vertical+=commands[1].toInt()
                else -> vertical-=commands[1].toInt()
            }
        }
        return vertical*horizontal
    }

    fun part2(input: List<String>): Int {
        var vertical = 0
        var horizontal = 0
        var aim = 0
        input.forEach {
            val commands = it.split(" ")
            when(commands[0]) {
                "forward" -> {
                    horizontal+=commands[1].toInt()
                    if (aim > 0) vertical += commands[1].toInt()*aim
                }
                "down" -> aim+=commands[1].toInt()
                else -> aim-=commands[1].toInt()
            }
        }
        return vertical*horizontal
    }

    val testInput = readInput("/year2021/day2/Day02_test")
    val input = readInput("/year2021/day2/Day02")
    check(part1(testInput)==150)
    check(part2(testInput)==900)
    println(part1(input))
    println(part2(input))
}