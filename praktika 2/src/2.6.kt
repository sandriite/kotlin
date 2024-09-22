fun main() {
    val X: Boolean = false
    val Y: Boolean = false
    val Z: Boolean = true
    val odin = X or Y and !Z
    val dva = X and !Y or Z
    val tri = !X and !Y
    val chetiri = X and (!Y or Z)
    val pat = !(X and Z) or Y
    val shest = X or (!(Y or Z))

    println("X or Y and !Z = $odin")
    println("X and !Y or Z = $dva")
    println("!X and !Y = $tri")
    println("X and (!Y or Z) = $chetiri")
    println("!(X and Z) or Y = $pat")
    println(" X or (!(Y or Z)) = $shest")
}
