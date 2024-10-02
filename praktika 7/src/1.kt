import kotlin.math.pow

fun main() {
    println("Консольный калькулятор на Kotlin")
    while (true) {
        println("Введите выражение (например, 2 + 2):")
        val expression = readLine() ?: continue

        if (expression == "exit") break // Выход из калькулятора

        val result = calculate(expression)
        println("Результат: $result")
    }
}

fun calculate(expression: String): Double {
    val tokens = tokenize(expression)
    return evaluate(tokens)
}

fun tokenize(expression: String): List<String> {
    val tokens = mutableListOf<String>()
    var currentToken = ""
    for (char in expression) {
        when (char) {
            '+', '-', '*', '/', '^' -> {
                if (currentToken.isNotEmpty()) tokens.add(currentToken)
                tokens.add(char.toString())
                currentToken = ""
            }
            else -> currentToken += char
        }
    }
    if (currentToken.isNotEmpty()) tokens.add(currentToken)
    return tokens
}

fun evaluate(tokens: List<String>): Double {
    val numbers = mutableListOf<Double>()
    val operators = mutableListOf<Char>()

    for (token in tokens) {
        when {
            token.toDoubleOrNull() != null -> numbers.add(token.toDouble())
            token in "+-*/^" -> operators.add(token[0])
        }
    }

    while (operators.isNotEmpty()) {
        val operatorIndex = findHighestPriorityOperator(operators)
        val operator = operators.removeAt(operatorIndex)
        val right = numbers.removeAt(operatorIndex + 1)
        val left = numbers.removeAt(operatorIndex)

        numbers.add(operatorIndex, calculateOperation(operator, left, right))
    }

    return numbers.first()
}

fun findHighestPriorityOperator(operators: List<Char>): Int {
    val priorities = mapOf(
        '^' to 3,
        '*' to 2,
        '/' to 2,
        '+' to 1,
        '-' to 1
    )
    var highestPriorityIndex = 0
    var highestPriority = 0

    for ((index, operator) in operators.withIndex()) {
        val currentPriority = priorities[operator] ?: 0
        if (currentPriority >= highestPriority) {
            highestPriority = currentPriority
            highestPriorityIndex = index
        }
    }

    return highestPriorityIndex
}

fun calculateOperation(operator: Char, left: Double, right: Double): Double {
    return when (operator) {
        '+' -> left + right
        '-' -> left - right
        '*' -> left * right
        '/' -> left / right
        '^' -> left.pow(right)
        else -> throw IllegalArgumentException("Неверный оператор: $operator")
    }
}