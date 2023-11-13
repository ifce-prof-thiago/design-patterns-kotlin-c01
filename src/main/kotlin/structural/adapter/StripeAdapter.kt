package creational.adapter

import creational.adapter.gateway.Stripe

class StripeAdapter : Payment {
    override fun pay(props: PaymentProperties) {

        val stripe = Stripe()

        stripe.pay(
            value = props.value,
            installments = props.installments,
            cardNumber = "Number: ${props.cardNumber} | Secure Code:  ${props.ccv}"
        )
    }

}