fun countVowels(s: String): Int {
    val vowels = "aeiouAEIOU"
    return s.count { it in vowels }
}

fun main() {
    println(countVowels("hello world"))  // 3
}
