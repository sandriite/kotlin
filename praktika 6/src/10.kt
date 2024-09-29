fun main () {
    val massiv = arrayOf(1,2,3,4,5,6,7,8,9)
    val sum = mutableListOf<Int>()
    var result = 0

    for (i in massiv.indices){
        if ((massiv[i] % 2) == 0) {
            sum.add(massiv[i])
        }
    }

    for (i in sum.indices) {
        result += sum[i]
    }
    println("сумма чётных чисел в массиве: $result")
}