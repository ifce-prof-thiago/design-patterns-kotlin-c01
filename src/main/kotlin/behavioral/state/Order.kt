package behavioral.state

import behavioral.state.states.WaitingForPayment

class Order(var total: Double, var state: OrderState) {

    fun pay() = state.pay(this)

    fun cancel() = state.cancel(this)

    fun dispatch() = state.dispatch(this)

    fun refund() = state.refund(this)

    fun status() = state.status()
}

fun main() {
    val order = Order(100.0, WaitingForPayment())
    println(order.status())
    order.pay()
    println(order.status())
    order.pay()

}