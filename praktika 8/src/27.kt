fun containsElement(arr: List<Int>, element: Int): Boolean {
    return arr.contains(element)
}

fun main() {
    println(containsElement(listOf(1, 2, 3, 4, 5), 3))  // true
}
