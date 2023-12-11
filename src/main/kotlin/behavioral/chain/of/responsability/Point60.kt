package behavioral.chain.of.responsability

class Point60 : CalculatePoints() {

    override fun execute(value: Double): Int {
        if (value > 60) {
            return (value / 7).toInt()
        }

        return next?.execute(value) ?: 0
    }
}