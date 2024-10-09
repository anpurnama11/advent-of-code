package codewars

/**
 * Interprets a simple assembly-like program.
 *
 * This function takes an array of strings representing program instructions and executes them.
 * The program supports the following commands:
 * - `mov x y`: Moves the value of y into x. y can be an integer or a variable.
 * - `inc x`: Increments the value of x by 1.
 * - `dec x`: Decrements the value of x by 1.
 * - `jnz x y`: Jumps to the instruction relative to the current instruction by y if x is not zero. y can be an integer or a variable.
 *
 * @param program An array of strings representing the program instructions.
 * @return A map containing the final values of all variables used in the program.
 */
fun interpret(program: Array<String>): Map<String, Int> {
    // Stores the values of variables
    val dictionaries = mutableMapOf<String, Int>()
    // Program counter, points to the current instruction
    var programCounter = 0

    // Iterate through the program instructions
    while (programCounter < program.size) {
        // Split the current instruction into its components
        val splittedCommand = program[programCounter].split(" ")

        // Execute the command based on the first part of the split string
        when (splittedCommand[0]) {
            "mov" -> {
                // Move value to variable
                val param = splittedCommand[2].toIntOrNull()
                if (param != null) {
                    // Move integer value
                    dictionaries[splittedCommand[1]] = param
                } else {
                    // Move value from another variable
                    dictionaries[splittedCommand[1]] = dictionaries[splittedCommand[2]] ?: 0
                }
                programCounter++
            }
            "inc" -> {
                // Increment variable value
                val newVal = dictionaries[splittedCommand[1]]?.inc()
                dictionaries[splittedCommand[1]] = newVal ?: 0
                programCounter++
            }
            "dec" -> {
                // Decrement variable value
                val newVal = dictionaries[splittedCommand[1]]?.dec()
                dictionaries[splittedCommand[1]] = newVal ?: 0
                programCounter++
            }
            "jnz" -> {
                // Conditional jump
                // Get the condition value, which can be an integer or a variable
                val condition = splittedCommand[1].toIntOrNull() ?: dictionaries[splittedCommand[1]] ?: 0
                // Jump if condition is not zero
                if (condition != 0) {
                    // Get jump offset, which can be an integer or a variable
                    val param = splittedCommand[2].toIntOrNull()
                    if (param != null) {
                        // Jump by integer offset
                        programCounter += param
                    } else {
                        // Jump by variable offset
                        programCounter += dictionaries[splittedCommand[2]] ?: 0
                    }
                } else {
                    // Condition is zero, move to next instruction
                    programCounter++
                }
            }
        }

    }
    // Return the final state of variables
    return dictionaries
}


fun main() {
    println(interpret(arrayOf("mov a -10", "mov b a", "inc a", "dec b", "jnz a -2")))
}