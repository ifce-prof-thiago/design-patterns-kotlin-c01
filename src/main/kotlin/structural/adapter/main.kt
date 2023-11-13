package creational.adapter

fun main() {

    val props = PaymentProperties(
        value = 100.0,
        installments = 2,
        cardNumber = "1234 1234 1234 1234",
        ccv = "123"
    )

    payWith(props, PagarmeAdapter())

}

fun payWith(props: PaymentProperties, gateway: Payment) {
    gateway.pay(props)
}