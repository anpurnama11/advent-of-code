package codewars

fun highestAndLowest(input: String): String {
    val nums = input.split(" ").map { it.toInt() }.toSortedSet()
    return "${nums.lastOrNull()} ${nums.firstOrNull()}"
}

fun main() {
    println(highestAndLowest("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
}