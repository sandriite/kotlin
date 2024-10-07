fun elementAtIndex(arr: List<Int>, index: Int): Int? {
    return if (index in arr.indices) arr[index] else null
}

fun main() {
    println(elementAtIndex(listOf(1, 2, 3, 4, 5), 2))  // 3
    println(elementAtIndex(listOf(1, 2, 3, 4, 5), 5))  // null
}
