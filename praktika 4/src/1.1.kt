fun main() {
    println("введите номер деня недели")
    val day = readln().toInt()

    if (day in 1..7) {
        when (day) {
            1 -> println("понедельник")
            2 -> println("вторник")
            3 -> println("среда")
            4 -> println("четверг")
            5 -> println("пятница")
            6 -> println("суббота")
            7 -> println("воскресение")
        }
    }
    else {
        println("вы ввели неправильный номер дня недели")
    }
}