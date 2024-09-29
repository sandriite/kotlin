fun mergeSortedArrays(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    val result = Array(arr1.size + arr2.size) { 0 }
    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] <= arr2[j]) {
            result[k] = arr1[i]
            i++
        } else {
            result[k] = arr2[j]
            j++
        }
        k++
    }

    while (i < arr1.size) {
        result[k] = arr1[i]
        i++
        k++
    }

    while (j < arr2.size) {
        result[k] = arr2[j]
        j++
        k++
    }

    return result
}

fun main() {
    val array1 = arrayOf(1, 3, 5, 7)
    val array2 = arrayOf(2, 4, 6, 8)

    val mergedArray = mergeSortedArrays(array1, array2)

    println("Слияние массивов: ${mergedArray.joinToString(", ")}")
}
