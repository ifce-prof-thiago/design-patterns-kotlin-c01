package structural.adapter

import structural.adapter.gateway.Braspag

class BraspagAdapter : Payment {
    override fun pay(props: PaymentProperties) {
        val braspag = Braspag(
            price = props.value,
            qtdParcelas = props.installments,
            card = props.cardNumber,
            ccv = props.ccv
        )

        braspag.pagar()
    }
}