package codewars

fun spinWords(sentence: String): String {
    val results = mutableListOf<String>()
    sentence.split(" ").forEach { word ->
        if (word.length > 4) {
            val newWord = word.reversed()
            results.add(newWord)
        } else results.add(word)
    }
    return results.joinToString(" ")
}

fun main() {
    println(spinWords("Hey fellow warriors"))
}