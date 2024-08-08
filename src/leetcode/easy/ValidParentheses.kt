package leetcode.easy

fun isValidParentheses(input: String): Boolean {
    val charArr = input.toCharArray()
    val stackOfOpenings = ArrayDeque<Char>()
    charArr.forEach { char ->
        when (char) {
            '{','[','(' -> stackOfOpenings.addLast(char)
            '}' -> {
                if (stackOfOpenings.isEmpty() || stackOfOpenings.last() != '{')
                    return false
                else stackOfOpenings.removeLast()
            }
            ']' -> {
                if (stackOfOpenings.isEmpty() || stackOfOpenings.last() != '[')
                    return false
                else stackOfOpenings.removeLast()
            }
            ')' -> {
                if (stackOfOpenings.isEmpty() || stackOfOpenings.last() != '(')
                    return false
                else stackOfOpenings.removeLast()
            }
            else -> return false
        }
    }
    return stackOfOpenings.isEmpty()
}

fun main() {
    println(isValidParentheses("([{}])"))
}