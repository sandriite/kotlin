fun main () {
    val massiv = arrayOf(1,2,3,4,5,6,7,8,9)
    println("введите что хотите найти")
    val search = readln().toInt()

    for (i in massiv.indices) {
        if (search == massiv[i]) {
            println("это под индексом $i")
            break
        }
    }
}