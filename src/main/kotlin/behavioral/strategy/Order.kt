package behavioral.strategy

class Order(private var total: Double, private var instalmentCount: Int) {

    fun calculate(calculateRate: CalculateRate): Double {
        return calculateRate.calculateRate(instalmentCount)
    }

}

fun main() {

    val order = Order(
        instalmentCount = 2,
        total = 100.0
    )

    val rate = order.calculate(CalculateMercadoPagoRate())

    println(rate)

}