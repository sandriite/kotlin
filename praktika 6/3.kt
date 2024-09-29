fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var largestElement = numbers[0]

    for (number in numbers){
        if(largestElement < number)
            largestElement = number
    }
    println("Наибольшее число в массиве: $largestElement")
    for (number in numbers){
        if(largestElement > number)
            largestElement = number
    }
    println("Наименьшее число в массиве: $largestElement")
}