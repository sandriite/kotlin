fun containsSubstring(str: String, substr: String): Boolean {
    return str.contains(substr)
}

fun main() {
    println(containsSubstring("hello world", "world"))  // true
    println(containsSubstring("hello world", "planet"))  // false
}
