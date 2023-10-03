package behavioral.template.method

class PaymentOfCredit(value: Number) : Payment(value) {
    override fun calculateFee(): Number {
        return value.toDouble() * 0.0499
    }

    override fun calculateDiscount(): Number {

        if (value.toDouble() > 300.0) {
            return value.toDouble() * 0.03
        }

        return 0.0
    }

}