package leetcode.easy

fun isAnagramSort(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val sortedS = s.toList().sorted()
    val sortedT = t.toList().sorted()

    return sortedS == sortedT
}

fun isAnagramHashMap(s: String, t: String): Boolean {
    val mapS = mutableMapOf<Char, Int>()
    val mapT = mutableMapOf<Char, Int>()

    for (char in s) {
        mapS.put(char, mapS.getOrDefault(char,0) + 1)
    }

    for (char in t) {
        mapT.put(char, mapT.getOrDefault(char,0) + 1)
    }

    return mapS == mapT
}

fun main() {
    val s = "anagram"
    val t = "nagaram"
    println("does $s and $t is anagram? ${isAnagramHashMap(s, t)}")
}