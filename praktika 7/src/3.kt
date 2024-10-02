fun calculatePoints(wins: Int, draws: Int, losses: Int): Int { //Принимает три параметра: количество побед, ничей и поражений.
    // Каждая победа дает 3 очка
    val p = wins * 3 // победа = 3 очкам
    val o = draws * 1// ничья = 1 очку
    return p + o // Общее количество
}
fun main() {
    // Пример ввода
    println("Введите количество побед:")
    val w = readLine()?.toIntOrNull() ?: 0 // Защита от некорректного ввода
    println("Введите количество ничьих:")
    val d = readLine()?.toIntOrNull() ?: 0
    println("Введите количество поражений:")
    val l = readLine()?.toIntOrNull() ?: 0

    // Вычисление очков
    val points = calculatePoints(w, d, l)

    // Вывод результата
    println("Команда набрала $points очков.")
}