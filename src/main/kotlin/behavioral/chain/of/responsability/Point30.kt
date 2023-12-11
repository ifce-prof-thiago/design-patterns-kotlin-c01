package behavioral.chain.of.responsability

class Point30 : CalculatePoints() {

    override fun execute(value: Double): Int {
        if (value > 30) {
            return (value / 10).toInt()
        }

        return next?.execute(value) ?: 0
    }

}