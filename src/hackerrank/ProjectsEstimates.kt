package hackerrank

import kotlin.math.abs

/*
 * Complete the 'countPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY projectCosts
 *  2. INTEGER target
 */

fun countPairs(projectCosts: Array<Int>, target: Int): Int {
    var res = 0
    for(i in projectCosts.indices)
        for (j in i + 1 until projectCosts.size)
            if (abs(projectCosts[i]-projectCosts[j]) > target) res++
    return res
}

fun main(args: Array<String>) {
    val projectCostsCount = readLine()!!.trim().toInt()

    val projectCosts = Array<Int>(projectCostsCount, { 0 })
    for (i in 0 until projectCostsCount) {
        val projectCostsItem = readLine()!!.trim().toInt()
        projectCosts[i] = projectCostsItem
    }

    val target = readLine()!!.trim().toInt()

    val result = countPairs(projectCosts, target)

    println(result)
}