package creational.adapter.gateway

class Pagarme(
    var amount: Double,
    var installments: Int,
    var cardNumber: String,
    var securityCode: String
) {

    fun pay() {
        println("Pay with Pagarme")
        println("Amount: $amount")
        println("Installments: $installments")
        println("Card Number: $cardNumber")
        println("Security Code: $securityCode")
    }
}