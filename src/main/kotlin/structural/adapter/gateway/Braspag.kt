package creational.adapter.gateway

class Braspag(val price: Double, val qtdParcelas: Int, val card: String, val ccv: String) {
    fun pagar() {
        println("Pay with Braspag")
        println("Amount: $price")
        println("Installments: $qtdParcelas")
        println("Card Number: $card")
        println("CCV: $ccv")
    }
}