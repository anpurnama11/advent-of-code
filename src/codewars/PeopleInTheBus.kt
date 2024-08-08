package codewars

fun peopleInTheBus(busStops: Array<Pair<Int, Int>>): Int {
    val sumOfCome = busStops.sumOf { it.first }
    val sumOfLeft = busStops.sumOf { it.second }
    return sumOfCome - sumOfLeft
}

fun main() {
    println(peopleInTheBus(arrayOf(3 to 0,9 to 1,4 to 8,12 to 2,6 to 1,7 to 8)))
}