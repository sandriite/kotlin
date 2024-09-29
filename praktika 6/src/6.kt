fun main () {
    val massiv = arrayOf(1,2,3,4,5,6,7,8,9)
    val chetnoe = mutableListOf<Int>()
    val nechetnoe = mutableListOf<Int>()

    for (number in massiv.indices) {
        if ((massiv[number] % 2) == 0) {
            chetnoe.add(massiv[number])
        }
        else {
            nechetnoe.add(massiv[number])
        }
    }
    println("четные: $chetnoe")
    println("НЕчетные: $nechetnoe")
}