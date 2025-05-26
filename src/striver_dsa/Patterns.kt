package striver_dsa

fun rectStarPattern(count: Int) {
    for (i in 1..count) {
        for (j in 1..count)
            print("*")
        print("\n")
    }
}

fun rightAngledTrianglePattern(count: Int) {
    for(i in 1..count) {
        for (j in 1.. i)
            print("*")
        print("\n")
    }
}

fun leftAngledTrianglePattern(count: Int) {
    var spacesCount = 0
    for (i in 1..count) {
        spacesCount = count - i
        for (j in 1 .. count) {
            if (spacesCount > 0) print(" ")
            else print("*")
            spacesCount--
        }
        print("\n")
    }
}

fun rightAngledTriangleNumber(count: Int) {
    for(i in 1..count) {
        for (j in 1.. i)
            print(j)
        print("\n")
    }
}

fun leftAngledTriangleNumber(count: Int) {
    var spacesCount = 0
    for (i in 1..count) {
        spacesCount = count - i
        for (j in 1 .. count) {
            if (spacesCount > 0) print(" ")
            else print(j)
            spacesCount--
        }
        print("\n")
    }
}

fun rightAngledTriangleNumberAccordingColumn(count: Int) {
    for(i in 1..count) {
        for (j in 1.. i)
            print(i)
        print("\n")
    }
}

fun inverseRightAngledTrianglePattern(count: Int) {
    for(i in 1..count) {
        for (j in 1.. (count - i))
            print("*")
        print("\n")
    }
}

fun inverseRightAngledTriangleNumber(count: Int) {
    for(i in 1..count) {
        for (j in 1.. (count - i))
            print(j)
        print("\n")
    }
}

fun starPyramid(rowCount: Int) {
    var starsCount = 1
    var spacesCount = 0
    for (i in 1..rowCount) {
        spacesCount = rowCount - i
        for (j in 1 .. spacesCount)
            print(" ")
        for (k in 1..starsCount)
            print("*")
        print("\n")
        starsCount+=2
    }
}

fun inverseStarPyramid(rowCount: Int) {
    var starsCount = (2*rowCount)-1
    for (i in 0 until rowCount) {
        for (j in 0 until i)
            print(" ")
        for (k in 0 until starsCount)
            print("*")
        print("\n")
        starsCount-=2
    }
}

fun main() {
    rightAngledTrianglePattern(4)
}