package structural.adapter

import structural.adapter.gateway.Pagarme

class PagarmeAdapter : Payment {

    override fun pay(props: PaymentProperties) {

        val pagarme = Pagarme(
            amount = props.value,
            installments = props.installments,
            cardNumber = props.cardNumber,
            securityCode = props.ccv
        )

        pagarme.pay()
    }

}