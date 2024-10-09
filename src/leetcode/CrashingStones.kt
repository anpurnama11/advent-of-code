package leetcode

fun lastStoneWeight(weights: Array<Int>): Int {
    if (weights.size == 1) return weights.first()
    val weightList = weights.toList().sortedDescending().toMutableList()
    while (weightList.size > 1) {
        val firstWeight = weightList.removeAt(0)
        val secondWeight = weightList.removeAt(0)
        val res = firstWeight - secondWeight
        if (res > 0) {
            weightList.add(res)
            weightList.sortDescending()
        }
    }
    return if (weightList.size == 0) 0 else  weightList.first()
}

fun main(args: Array<String>) {
    val weightsCount = readLine()!!.trim().toInt()

    val weights = Array<Int>(weightsCount, { 0 })
    for (i in 0 until weightsCount) {
        val weightsItem = readLine()!!.trim().toInt()
        weights[i] = weightsItem
    }

    val result = lastStoneWeight(weights)

    println(result)
}