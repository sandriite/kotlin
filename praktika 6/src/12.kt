fun main () {
    println("введите номер метода")
    val nomer = readln().toInt()

    when (nomer) {


        1 -> {
            val massiv = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
            var hzlol1 = 0
            var hzlol2 = 0
            println("введите индекс первого элемента")
            val men1 = readln().toInt()

            println("введите индекс второго элемента")
            val men2 = readln().toInt()


            hzlol1 = massiv[men1]
            hzlol2 = massiv[men2]

            massiv[men1] = hzlol2
            massiv[men2] = hzlol1

            println("изменённый массв: $massiv")
        }

        2-> {

                val massiv = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

                println("Введите индекс первого элемента:")
                val men1 = readln().toInt()

                println("Введите индекс второго элемента:")
                val men2 = readln().toInt()

                // Меняем элементы местами
                massiv[men1] = massiv[men2].also { massiv[men2] = massiv[men1] } //Для обмена значениями используется выражение also, которое помогает сделать это в одну строку
                //Оно делает так, что сначала присваивается значение massiv[men1], а потом меняется massiv[men2]

                println("Изменённый массив: $massiv")


        }
    }
}