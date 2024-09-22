fun main() {
    println("Выберите способ оплаты (наличные, кредитная карта, PayPal)")
    val paymentMethod = readln().lowercase() //lowercase переводит строку в маленькие буквы

    when (paymentMethod) {
        "наличные" -> println("Вы выбрали оплату наличными")
        "кредитная карта" -> println("Вы выбрали оплату кредитной картой")
        "paypal" -> println("Вы выбрали оплату через PayPal")
        else -> println("неверный способ оплаты")
    }
}
