fun main () {
    val massiv = arrayOf(1,2,3,4,5,6,7,8,9)
    val reverse = mutableListOf<Int>()

    for (i in massiv.size - 1 downTo 0) {
        reverse.add(massiv[i])
    }
    println("реверс: $reverse")
}