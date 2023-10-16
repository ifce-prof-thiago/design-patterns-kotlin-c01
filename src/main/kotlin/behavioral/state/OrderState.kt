package behavioral.state

interface OrderState {
    fun pay(order: Order) {
        throw IllegalStateException("Order is already paid")
    }

    fun cancel(order: Order) {
        throw IllegalStateException("Order is already cancelled")
    }

    fun dispatch(order: Order) {
        throw IllegalStateException("Order is already shipped")
    }

    fun refund(order: Order) {
        throw IllegalStateException("Order is already refunded")
    }

    fun status(): OrderStatus

}