fun main() {

    println("Введите длину стороны a:")
    val a = readln().toDouble()

    println("Введите длину стороны b:")
    val b = readln().toDouble()

    println("Введите длину стороны c:")
    val c = readln().toDouble()

    // Проверка на существование треугольника
    if (a + b > c && a + c > b && b + c > a) {
        // Определение типа треугольника по длинам сторон
        val triangleType = when {
            a == b && b == c -> "равносторонний"
            a == b || a == c || b == c -> "равнобедренный"
            else -> "разносторонний"
        }
        println("Треугольник $triangleType")
    } else {
        println("нет треугольника с такими сторонами")
    }
}
