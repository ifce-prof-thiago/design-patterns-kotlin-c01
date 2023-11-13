package creational.adapter

interface Payment { // Target
    fun pay(props: PaymentProperties)
}

data class PaymentProperties(
    val value: Double,
    val installments: Int,
    val cardNumber: String,
    val ccv: String
)