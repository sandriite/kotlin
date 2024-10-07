fun equation(eq: String): Int {
    return eq.split("+", "-", "*", "/")
        .map { it.toInt() } // Пример для простоты
        .reduce { acc, i -> acc + i } // Пример для простоты
}

fun main() {
    println(equation("1+1"))  // 2
    println(equation("7*4-2"))  // 26
    println(equation("1+1+1+1+1"))  // 5
}
