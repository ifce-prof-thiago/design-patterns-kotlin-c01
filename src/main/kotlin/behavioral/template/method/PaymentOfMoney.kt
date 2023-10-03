package behavioral.template.method

class PaymentOfMoney(value: Number) : Payment(value) {

    override fun calculateFee(): Number {
        return 0.0
    }

    override fun calculateDiscount(): Number {
        return value.toDouble() * 0.15
    }

}