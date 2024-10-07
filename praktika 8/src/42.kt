fun firstIndexOf(arr: List<Int>, element: Int): Int {
    return arr.indexOf(element)
}

fun main() {
    println(firstIndexOf(listOf(1, 2, 3, 4, 5), 3))  // 2
    println(firstIndexOf(listOf(1, 2, 3, 4, 5), 6))  // -1
}
