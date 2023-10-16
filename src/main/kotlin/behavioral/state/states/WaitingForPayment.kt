package behavioral.state.states

import behavioral.state.Order
import behavioral.state.OrderState
import behavioral.state.OrderStatus

class WaitingForPayment : OrderState {
    override fun pay(order: Order) {
        order.state = Paid()
    }

    override fun cancel(order: Order) {
        order.state = Cancelled()
    }

    override fun status() = OrderStatus.WAITING_PAYMENT

}