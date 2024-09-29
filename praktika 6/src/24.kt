fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val cols = matrix[0].size
    val transposed = Array(cols) { IntArray(rows) } // Создаем новую матрицу для транспонирования

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposed[j][i] = matrix[i][j] // Заполняем транспонированную матрицу
        }
    }

    return transposed
}

fun main() {
    // Исходная матрица 2x3
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    // Транспонирование матрицы
    val transposedMatrix = transposeMatrix(matrix)

    // Выводим исходную матрицу
    println("Исходная матрица:")
    for (row in matrix) {
        println(row.joinToString(", "))
    }

    // Выводим транспонированную матрицу
    println("\nТранспонированная матрица:")
    for (row in transposedMatrix) {
        println(row.joinToString(", "))
    }
}
