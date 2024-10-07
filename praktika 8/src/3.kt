fun mergeLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 + list2
}

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)
    println("Объединение списков: ${mergeLists(list1, list2)}")
}
