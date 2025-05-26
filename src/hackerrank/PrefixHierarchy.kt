package hackerrank

fun findCompletePrefixes(names: Array<String>, query: Array<String>): Array<Int> {
    val res = mutableListOf<Int>()
    for (i in 0 until query.size) {
        val temps = names.filter { query[i].contains(it) }
        res.add(temps.size)
    }
    return res.toTypedArray()
}

fun main(args: Array<String>) {
    val namesCount = readLine()!!.trim().toInt()

    val names = Array<String>(namesCount, { "" })
    for (i in 0 until namesCount) {
        val namesItem = readLine()!!
        names[i] = namesItem
    }

    val queryCount = readLine()!!.trim().toInt()

    val query = Array<String>(queryCount, { "" })
    for (i in 0 until queryCount) {
        val queryItem = readLine()!!
        query[i] = queryItem
    }

    val result = findCompletePrefixes(names, query)

    println(result.joinToString("\n"))
}