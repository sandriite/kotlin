fun repetition(txt: String, n: Int): String {
    return if (n <= 0) "" else txt + repetition(txt, n - 1)
}

fun main() {
    println(repetition("ab", 3))  // "ababab"
    println(repetition("kiwi", 1))  // "kiwi"
    println(repetition("cherry", 2))  // "cherrycherry"
}
