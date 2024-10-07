fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}

fun main() {
    println(isPalindrome("madam"))  // true
    println(isPalindrome("hello"))  // false
}
