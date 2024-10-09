package codewars

fun peopleInTheBus(busStops: Array<Pair<Int, Int>>): Int {
    val sumOfCome = busStops.sumOf { it.first }
    val sumOfLeft = busStops.sumOf { it.second }
    return sumOfCome - sumOfLeft
}

fun peopleInTheBusDeclarative(busStops: Array<Pair<Int, Int>>) = busStops.fold(0) { res, (come, left) ->
    res + come - left
}

fun main() {
    println(peopleInTheBusDeclarative(arrayOf(3 to 0,9 to 1,4 to 8,12 to 2,6 to 1,7 to 8)))
}