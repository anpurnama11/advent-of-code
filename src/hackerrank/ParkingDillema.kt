package hackerrank

fun carParkingRoof(cars: Array<Long>, k: Int): Long {
    // Write your code here
    return 0L
}

fun main(args: Array<String>) {
    val carsCount = readLine()!!.trim().toInt()

    val cars = Array<Long>(carsCount, { 0 })
    for (i in 0 until carsCount) {
        val carsItem = readLine()!!.trim().toLong()
        cars[i] = carsItem
    }

    val k = readLine()!!.trim().toInt()

    val result = carParkingRoof(cars, k)

    println(result)
}