fun maxAndMin(arr: List<Int>): Pair<Int, Int> {
    return Pair(arr.maxOrNull() ?: 0, arr.minOrNull() ?: 0)
}

fun main() {
    println(maxAndMin(listOf(1, 2, 3, 9, 5)))  // (9, 1)
}
