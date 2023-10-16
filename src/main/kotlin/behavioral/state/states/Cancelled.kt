package behavioral.state.states

import behavioral.state.OrderState
import behavioral.state.OrderStatus

class Cancelled : OrderState {
    override fun status() = OrderStatus.CANCELLED

}