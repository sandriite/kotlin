fun main() {
    val array = arrayOf(1, 2, 3, 2, 1) // Пример палиндрома

    val isPalindrome = array.contentEquals(array.reversedArray())

    if (isPalindrome) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}
