package behavioral.state.states

import behavioral.state.Order
import behavioral.state.OrderState
import behavioral.state.OrderStatus

class Shipped : OrderState {

    override fun refund(order: Order) {
        order.state = Refunded()
    }

    override fun status() = OrderStatus.SHIPPED

}