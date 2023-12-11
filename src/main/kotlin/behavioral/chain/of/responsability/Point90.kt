package behavioral.chain.of.responsability

class Point90 : CalculatePoints() {

    override fun execute(value: Double): Int {

        if (value > 90) {
            return (value / 5).toInt()
        }

        return next?.execute(value) ?: 0
    }

}