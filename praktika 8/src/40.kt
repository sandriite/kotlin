fun copyArray(arr: List<Int>): List<Int> {
    return arr.toList()
}

fun main() {
    val original = listOf(1, 2, 3, 4, 5)
    val copy = copyArray(original)
    println(copy)  // [1, 2, 3, 4, 5]
}
