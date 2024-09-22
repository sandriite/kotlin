import java.time.LocalDate
import java.time.YearMonth

fun main() {

    println("введите год (например, 2023)")
    val year = readln().toInt()
    println("введите месяц (от 1 до 12)")
    val month = readln().toInt()

    // получение количества дней в месяце
    val yearMonth = YearMonth.of(year, month)
    val daysInMonth = yearMonth.lengthOfMonth()

    // вывод всех дат в месяце
    println("даты в месяце $month $year:")
    for (day in 1..daysInMonth) {
        val date = LocalDate.of(year, month, day)
        println(date)
    }
}
