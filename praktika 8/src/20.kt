fun maxInArray(arr: List<Int>): Int {
    return arr.maxOrNull() ?: 0
}

fun main() {
    println(maxInArray(listOf(1, 2, 3, 9, 5)))  // 9
}
