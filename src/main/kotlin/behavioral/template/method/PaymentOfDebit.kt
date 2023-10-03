package behavioral.template.method

class PaymentOfDebit(value: Number) : Payment(value) {

    override fun calculateFee(): Number {
       return 10.0
    }

    override fun calculateDiscount(): Number {
       return value.toDouble() * 0.06
    }

}