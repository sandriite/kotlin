fun main() {
    while (true) {
        println("Введите первое число (или 'стоп' для выхода):")
        val input1 = readln()

        // Проверка на выход
        if (input1.lowercase() == "стоп") break

        println("Введите второе число (или 'стоп' для выхода):")
        val input2 = readln()

        // Проверка на выход
        if (input2.lowercase() == "стоп") break

        // Преобразование строк в числа
        val num1 = input1.toDoubleOrNull()
        val num2 = input2.toDoubleOrNull()

        // Проверка на корректность ввода
        if (num1 == null || num2 == null) {
            println("Пожалуйста, введите корректные числа")
            continue
        }

        // Вывод результатов
        println("Сложение: ${num1 + num2}")
        println("Умножение: ${num1 * num2}")
    }

    println("Программа завершена")
}
