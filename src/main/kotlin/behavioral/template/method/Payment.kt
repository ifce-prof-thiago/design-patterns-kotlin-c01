package behavioral.template.method

abstract class Payment(var value: Number) {

    fun calculateTotal(): Number {

        val fee = calculateFee()
        val discount = calculateDiscount()

        return value.toDouble() + fee.toDouble() - discount.toDouble()
    }

    abstract fun calculateFee(): Number
    abstract fun calculateDiscount(): Number

}

fun main() {

    val payment = PaymentOfDebit(100)
    println(payment.calculateTotal())

}