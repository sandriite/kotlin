fun main() {

    println("введите строку")
    val input = readln()

    // переменная для хранения обратной строки
    var reversed = ""

    // цикл для прохода по строке в обратном порядке
    for (i in input.length - 1 downTo 0) {
        reversed += input[i]  // добавляем каждый символ в обратном порядке
    }

    println("обратный порядок строки: $reversed")
}
