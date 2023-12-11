package structural.adapter.gateway

class Stripe {

    fun pay(value: Double, installments: Int, cardNumber: String) {
        println("Pay with Stripe")
        println("Amount: $value")
        println("Installments: $installments")
        println("Card Number: $cardNumber")
    }

}