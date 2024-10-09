fun fizzBuzz(n: Int): List<Any> {
    val result = mutableListOf<Any>()

    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result.add("ВизллБизлл") // Для чисел, кратных 3 и 5
            i % 3 == 0 -> result.add("Физллл") // Для чисел, кратных 3
            i % 5 == 0 -> result.add("Бизлллл") // Для чисел, кратных 5
            else -> result.add(i) // Для остальных чисел
        }
    }

    return result
}

fun main() {
    println(fizzBuzz(5))  // [1, 2, Физллл, 4, Бизлллл]
    println(fizzBuzz(16)) // [1, 2, Физллл, 4, Бизлллл, Физллл, 7, 8, Физллл, Бизлллл, 11, Физллл, 13, 14, ВизллБизлл, 16]
}
