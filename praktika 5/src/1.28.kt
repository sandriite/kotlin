fun main() {
    println("Введите количество чисел N:")
    val N = readln().toInt()

    val numbers = mutableListOf<Double>()

    // Ввод чисел
    for (i in 1..N) {
        println("Введите число $i:")
        val number = readln().toDouble()
        numbers.add(number)
    }

    // Сортировка чисел
    numbers.sort()
    
    println("Числа в порядке возрастания:")
    for (number in numbers) {
        println(number)
    }
}
