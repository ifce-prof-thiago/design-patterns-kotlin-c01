package behavioral.state.states

import behavioral.state.Order
import behavioral.state.OrderState
import behavioral.state.OrderStatus

class Refunded : OrderState {
    override fun cancel(order: Order) {
        order.state = Cancelled()
    }

    override fun status() = OrderStatus.REFUNDED
}