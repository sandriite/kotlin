fun main() {
    val massiv1 = arrayOf(1, 2, 3, 4, 5)
    val massiv2 = arrayOf(3, 4, 5, 6, 7)

    val intersection = mutableListOf<Int>()

    for (element in massiv1) {
        if (element in massiv2) {
            intersection.add(element)
        }
    }

    println("Пересечение массивов: $intersection")
}
