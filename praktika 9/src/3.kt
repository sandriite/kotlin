fun main() {
    // Фиксированный курс для примера (1 доллар = 0.95 евро)
    val usdToEurRate = 0.95

    // Запрашиваем у пользователя количество долларов
    println("Введите количество долларов для конвертации в евро:")
    val dollars = readln().toDouble()

    // Выполняем конвертацию
    val euros = dollars * usdToEurRate

    // Выводим результат
    println("%.2f долларов равно %.2f евро".format(dollars, euros))
}
