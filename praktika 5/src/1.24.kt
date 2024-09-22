fun main() {
    // Ввод размеров матрицы
    println("Введите количество строк:")
    val rows = readln().toInt()
    println("Введите количество столбцов:")
    val cols = readln().toInt()

    // Инициализация матрицы
    val matrix = Array(rows) { IntArray(cols) }

    // Ввод элементов матрицы
    println("Введите элементы матрицы:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("Элемент [$i][$j]: ")
            matrix[i][j] = readln().toInt()
        }
    }

    // Транспонирование матрицы
    val transposedMatrix = Array(cols) { IntArray(rows) }
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    // Вывод транспонированной матрицы
    println("Транспонированная матрица:")
    for (i in 0 until cols) {
        for (j in 0 until rows) {
            print("${transposedMatrix[i][j]} ")
        }
        println()
    }
}
