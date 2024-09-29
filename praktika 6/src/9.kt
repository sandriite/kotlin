fun main () {
    val massiv1 = arrayOf(1,2,3,4,5,6,7,8,9)
    val massiv2 = mutableListOf<Int>()

    for (i in massiv1.indices) {
        massiv2.add(massiv1[i])
    }
    println(massiv2)
}