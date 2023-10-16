package behavioral.state.states

import behavioral.state.Order
import behavioral.state.OrderState
import behavioral.state.OrderStatus

class Paid : OrderState {
    override fun cancel(order: Order) {
        order.state = Cancelled()
    }

    override fun dispatch(order: Order) {
        order.state = Shipped()
    }

    override fun status() = OrderStatus.PAID
}