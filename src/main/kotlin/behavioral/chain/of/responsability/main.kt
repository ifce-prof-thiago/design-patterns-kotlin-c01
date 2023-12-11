package behavioral.chain.of.responsability

fun main() {
    val points = calculate(10.0, 15)
    println("Points: $points")
}

fun calculate(value: Double, monthDay: Int): Int {

    val point90 = Point90()
    val point60 = Point60()
    val point30 = Point30()

    point90.next(point60)
    point60.next(point30)

    if(monthDay > 15) {
        return point90.execute(value) * 2
    }

    return point90.execute(value)
}