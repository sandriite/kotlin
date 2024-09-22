fun main() {
    val X: Boolean = true
    val Y: Boolean = true
    val Z: Boolean = false

    val odin = !X and Y
    val dva = X or !Y
    val tri = X and Y or Z
    println("!X and Y = $odin")
    println("X or !Y = $dva")
    println("X and Y or Z = $tri")
}
