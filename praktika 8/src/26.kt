fun lastElement(arr: List<Int>): Int? {
    return arr.lastOrNull()
}

fun main() {
    println(lastElement(listOf(1, 2, 3, 4, 5)))  // 5
}
